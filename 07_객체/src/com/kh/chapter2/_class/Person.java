package com.kh.chapter2._class;

/*
 *  클래스의 구조 
 *  
 *   [표현법]
 *   	[접근 제한자] [예약어] class 클래스명 {
 *   	  // 1. 필드부 (객체의 속성을 정의)
 *  	  [접근 제한자] [예약어] 자료형 필드명 [=초기값];
 *		   ...   	
 *   
 *   
 *   	  // 2. 생성자부 (필드를 초기화하거나, 객체를 사용할 준비를 한다.)
 *   	  [접근 제한자] 클래스명([매개변수, ...]) {
 *         ...
 *        }
 *   
 *   
 *   
 *   	  // 3. 메소드부 (객체의 기능을 정의)
 *        [접근 제한자] [예약어] 반환형 메소드명([매개변수, ...]_ {
 *         ...
 *        
 *         [return] [반환값];
 *         }
 *   	}
 *   
 *   
 * 클래스에서 사용 가능한 접근 제한자
 * 
 * 1. public 
 *   - 클래스를 선언할 때 public 으로 붙였다면 클래스는 public 접근 제한을 갖는다.
 *   - public 으로 선언된 클래스를 아무런 제약없이 사용할 수 있다. 
 * 
 * 2. default
 *   - 클래스를 선언할 때 접근 제한자를 생략했다면 default 접근 제한을 갖는다.
 * 	 - 동일한 패키지에는 아무런 제약없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다. 
 *
 */

public class Person {
	private String name;
	private int age; // 필드생성
	
	// person과 phone은 같은 패키지 내에 있기 때문에 접근이 가능하다.
	private Phone phone;
	
	
	// 아무런 기능이 없는 기본 생성자 (application에서 자동으로 만들어짐)
	public Person () {      // 반환할 값이 없기 때문에 return 생략 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
//	// 4.phone getter 생성.
//	public String getPhone() {
//		return this.phone.getBrand() + "의" + this.phone.getName() + "을 가지고 있습니다.";
//	}
	
	// 1.phone 클래스 setter 생성.
	// 2.여기에서 phone 객체의 속성값을 받아온 뒤 여기서 폰 객체를 만든다. application에서 못읽으니.
	public void setPhone(String name, String color ,String brand) {
		this.phone = new Phone();
		
		// 3.여기서 this는 생략가능하나 그냥 적기로 한다.
		this.phone.setName(name);
		this.phone.setColor(color);
		this.phone.setBrand(brand);

	}
	
	
	// getter 대신에 info 담은 메소드 생성 
	// 4. phone 메소드 생성 
	public void whoAreYou() {
		System.out.println("안녕하세요. 저는 " + this.name + 
				           "입니다. 나이는 " + this.age + "세 입니다.");
		System.out.println("저는 " + this.phone.getBrand() + "의 " + 
					       this.phone.getName() + "를 가지고 있습니다.");
	}
	
	
	
	
	
}
