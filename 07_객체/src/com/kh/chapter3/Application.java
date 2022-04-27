package com.kh.chapter3;

import com.kh.chapter3.field.D_initBlock;

public class Application {

	public static void main(String[] args) {

		// 1. 변수 구분 테스트
//		A_Field field = new A_Field(); // A_Field 가 생성자다. 생성자 호출.
		
		// 매개 값을 넘겨줄때 매개 변수의 타입이 서로 같아야 한다.
//		field.method1(20);
		
		
		// 2. 접근 제한자 테스트 
		
//		public : 필드에 직접 접근이 가능하다.
//		System.out.println(field.publicField);

//		protected : 같은 패키지 내에 존재하거나, 자식 클래스에서만 직접 접근이 가능하다.
//		System.out.println(field.protectedField);
		
//		default : 같은 패키지 내에서만 직접 접근이 가능하다.
//		System.out.println(field.defaultField);
		
//	    privated : 같은 클래스 내에서만 직접 접근이 가능하다. 
//		System.out.println(field.privatedField);
		
		
		// 3. 클래스 변수 테스트 (static)
		// 클래스 변수는 프로그램 실행과 동시에 메모리 (static)에 생성되었기 때문에 객체를 생성하지 않아도 접근이 가능하다.
		
//		System.out.println(B_StaticField.publicStaticField);
//		System.out.println(B_StaticField.privateStaticField);
		
		// 정적 멤버는 객체의 참조 변수로도 접근이 가능하지만, 
		// 정적 멤버는 클래스 이름으로 접근하는 것을 지향한다.
		// (객체 생성 후 접근할 수 있지만. 굳이 권장하지 않는 방법이다.)
		// 이름만 보고 static인지 일반 필드인지 구분하기 어렵기 때문에.. 
//		B_StaticField staticField = new B_StaticField(); // 객체생성 
//		System.out.println(staticField.publicStaticField);
		
		// 4. 상수 필드 테스트
		// static 키워드로 생성된 필드이기 때문에 객체 생성이 필요없다.
//		System.out.println(C_StaticFinalField.MAX_LEVEL);
//		System.out.println(Math.PI);
//		System.out.printf("byte의 표현 범위 : %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
//		System.out.printf("int의 표현 범위 : %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		// final 키워드로 인해서 값을 변경할 수 없다.
//		C_StaticFinalField.MAX_LEVEL = 99;
		
		// 5. 필드 초기화 순서 테스트
		// 필드
		// 인스턴스로 초기화 
		D_initBlock initBlock = new D_initBlock();
		System.out.println(initBlock.getName());
		System.out.println(initBlock.getPhoneName());
		System.out.println(initBlock.getPrice());
		
		
		// 클래스 변수
		System.out.println(D_initBlock.getAge());
		System.out.println(D_initBlock.getBrand());
		
		
		
		
	}

}
