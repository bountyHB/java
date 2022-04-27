package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;

public class Application {
	/*
	 *  다형성 
	 *    - 부모 클래스의 참조 변수로 자식 객체들을 다룰 수 있는 기술이다.
	 *    - 상속 구조의 클래스 간에는 형 변환이 가능하기 때문에 다형성이 가능하다.
	 *    
	 *  UpCasting
	 *    - 자식 타입 -> 부모 타입으로 형 변환이 발생하는 것을 말한다. 
	 *    - 형 변환 연산자의 생략이 가능하다. (자동으로 형 변환)
	 *    - 자식 타입의 멤버(필드, 메소드)에는 접근이 불가능하다. 
	 *  
	 *  DownCasting
	 *    - 부모 타입 -> 자식 타입으로 형 변환이 발생하는 것을 말한다. 
	 *    - 형 변환 연산자를 사용해야 한다. (강제 형 변환)
	 *    	((자식타입)부모참조변수).자식메소드();
	 *  
	 */

	public static void main(String[] args) {
//		1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우 
		Product product = new Product();
		
		// product 참조 변수로 Product의 멤버만 접근 가능
		System.out.println(product);
		
//		2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우 
		Desktop desktop = new Desktop();
		
		// desktop 참조 변수로 Product, Desktop의 멤버에 접근 가능 
		System.out.println(desktop);
		System.out.println(desktop.isAllInOne());
		
//		3. 부모 타입의 참조 변수로 자식 객체를 다루는 경우(다형성 적용) 
		product = /* (Product) */new Desktop();
		
		// 부모타입의 클래스에서 제공해주는 멤버들에만 접근 가능하다. (product.으로 확인가능)
		// 하지만 override 된 Desktop의 toString으로 접근하게 된다. 
		System.out.println(product.toString());
		// desktop의 메소드에 접근하고 싶으면 부모타입을 강제 형변환 시켜주면 된다.
		System.out.println(((Desktop)product).isAllInOne());

		
//		4. 객체 배열과 다형성 
		
		// 다형성을 사용하기 전에는 각각의 Desktop, SmartPhone 배열을 만들어야 한다.
		// 문자열도 객체이듯이 배열도 문자열이라 생각하면 된다. 
		Desktop[] arr1 = new Desktop[2];
		
		arr1[0] = new Desktop();
		arr1[1] = new Desktop();
		
		SmartPhone[] arr2 = new SmartPhone[2];
		
		arr2[0] = new SmartPhone();
		arr2[1] = new SmartPhone();
		
		
		// 다형성을 적용하면 부모 클래스의 참조 변수로 자식 객체들을 가리킬 수 있다. 
		// UpCasting 때문에 자식객체를 대입하는것이 가능하다. 배열을 하나만 만들수 있음.
		Product[] arr3 = new Product[4];
		
		arr3[0] = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true);
		arr3[1] = new Desktop("d-01", "매직스테이션", "삼성", 1500000, false );
		arr3[2] = new SmartPhone("a2222", "아이폰12 미니", "애플", 960000, "KT");
		arr3[3] = new SmartPhone("s-01", "갤럭시 22", "삼성", 600000, "SKT");
		
		// DownCasting 사용으로 접근.
//		System.out.println(((Desktop)arr3[0]).isAllInOne());
//		System.out.println(((Desktop)arr3[1]).isAllInOne());
//		System.out.println(((SmartPhone)arr3[2]).getMobileAgency());
//		System.out.println(((SmartPhone)arr3[3]).getMobileAgency());
		
		// for문 사용으로 접근. 
		for (Product p : arr3) { // 총 4번 반복
//			/*
//			 * instanceof 연산자 
//			 *  - 참조 변수가 실제로 어떤 클래스 타입의 객체의 주소를 참조하는지 확인할 때 사용한다. 
//			 */
//			if (p instanceof Desktop) {
//				System.out.println(((Desktop)p).isAllInOne());
//			}else {
//				System.out.println(((SmartPhone)p).getMobileAgency());
//			}
			
			// 오버라이딩의 개념을 활용해서 실제로 참조하고 있는 객체의 메소드를 찾아서 실행한다. 
			System.out.println(p.toString());
		}
	
		
//		5. 매개 변수의 다형성 
		print(new Desktop()); // 객체 만들어서 밑에 전달해 주는것 
		print(new SmartPhone());
		
	}

//	public static void print(Desktop desktop) { 
//		System.out.println(desktop);
//	}
//
//	// 위와 아래는 같은데 매개값만 다른 비효율적인 식.
//	
//	public static void print(SmartPhone smartPhone) {
//		System.out.println(smartPhone);
//	}
	
	// 상속관계를 이용하여 위를 하나의 메소드로 만들어 처리한다 => 매개변수의 다형성
	public static void print(Product product) {
		System.out.println(product);
	}
	
	
}
