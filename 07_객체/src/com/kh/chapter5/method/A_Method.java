package com.kh.chapter5.method;

import java.util.Arrays;

import com.kh.chapter4.constructor.User;

public class A_Method {

	// 1. 매개 변수가 없고 반환값도 없는 메소드 호출
	public void method1 () {
		// 어떤것도 반환하지 않고 중괄호 안에있는 코드만 실행한다. 
		System.out.println("매개 변수와 반환값이 둘 다 없는 메소드입니다.");
		
		// return 문을 사용할 때 return 문 뒤에 반환값이 오면 에러가 발생한다.
		// return "Hello";
		// return; 반환값 없이 사용은 가능하다. (리턴문이 숨겨져있는 상태) 
		
		System.out.println("리턴 이후 실행");
		// 리턴문 이후에 코드를 넣으면 unreachable error가 뜬다.
	}

	
	// 2. 매개 변수가 없고 반환값은 있는 메소드
	public String method2() {
		//반환타입을 썼으면 리턴구문이 반드시 있어야 에러가 나지 않는다.
//		String str = "매개 변수가 없지만 반환값이 있는 메소드 입니다.";
//		return str; (주소값을 주고 받는다.)
		return "매개 변수가 없지만 반환값이 있는 메소드입니다."; // 위 두줄을 한줄로.
	}
	

	// 3. 매개 변수가 있고 반환값이 없는 메소드 
	public void method3 (int num1, int num2) {
		System.out.println("매개 변수가 있고 반환값이 없는 메소드입니다.");
		//코드 블럭 안에서 전달되는 매개 값을 사용만 해주면 된다.
		System.out.println("입력받은 매개 변수 num1 + num2 = " + (num1+num2));
		
	}
	// 4. 매개 변수가 있고 반환값도 있는 메소드 (void가 없음)
	public int method4 (int num1, int num2) {
		// 두개의 값을 받아서 정수값으로 호출해준다.
		
		return num1 * num2;
	}
	
	// 5. 매개 변수로 User 객체를 전달받는 메소드 
	// user 의 주소값을 받아서 이름하고 나이를 set 해주고 있음 
	public void method5(User user) { // user 객체를 받기위해 user 타입의 참조변수 user를 만든것)
		user.setName("이몽룡");
		user.setAge(19);
		
	}
	
	// 6. 매개 변수로 가변 인자를 전달받는 메소드 
	// 기존에 배열을 사용해서 가변 인자를 받는 방법 
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	
	}
	
	// 가변 인자를 처리하는 방법 (자바 1.5부터 지원)
	// 매개변수가 여러개 있을때 가변 인자는 항상 매개변수 마지막에 있어야 한다. 
	// 가변인자는 사용시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외를 처리하는 코드가 필요하다.
//	public void method7(int ... numbers ,String name) {
	public void method7(String name, int ... numbers) {
		System.out.println(name);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	
	
	
	
	
	
}
