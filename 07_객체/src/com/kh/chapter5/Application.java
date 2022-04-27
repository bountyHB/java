package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.method.A_Method;
import com.kh.chapter5.method.C_StaticMethod;

public class Application {

	public static void main(String[] args) {

	A_Method method = new A_Method();
	
	// 1. 매개 변수가 없고 반환값도 없는 메소드 호출
//	method.method1();
	
	// 2. 매개 변수가 없고 반환값은 있는 메소드
//	String str = method.method2();
//	System.out.println(str);
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드 
// 반드시 매개 변수로 지정된 두개에 변수에 값을 지정해야 함.
//	method.method3(3, 4);
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드 (2.와 비교할것.)
//	int result = method.method4(3, 4);
//	System.out.println(result);
	
//	System.out.println(method.method4(3, 4)); // 위 두 줄을 한 줄로
	
	// 5. 매개 변수로 User 객체를 전달받는 메소드 

	User user = new User(); // user 객체를 넘겨주기위해 user 객체를 만든다. 기본생성자로 만듬.
	// method5 전달 전. 메인 메소드에 대한 스택영역이 실행된다.
	System.out.println(user.information()); // null null null 0
	
	method.method5(user); // 메소드5에 유저 참조값을 넣어준다. (user객체의 주소값을 매개변수로 넘겨주는 것)
	// method5 전달 후. method5 메소드에 대한 스택영역이 주소값을 넘겨줘서 변한다.
	System.out.println(user.information()); // null null 이몽룡 19
	
	// 6. 매개 변수로 가변 인자를 전달받는 메소드 
//	int[] arr = {1, 2, 3, 4};
	
	
//	method.method6(arr);
//	method.method6(new int[]{1, 2, 3, 4, 5, 6}); // 위에서 배열 생성을 했었기 때문에, new연산자를 붙여야한다.
//	method.method7(1, 2, 3, 4, 5); // 6은 error. 7은 동작 
//	method.method7(1, 2, 3); // 6은 error. 7은 동작 
//	method.method7(); // 6은 error. 7은 동작 == numbers = new int[0];
	
//	method.method7("바부");
//	method.method7("바부", 1, 2,(1+2));
	
	System.out.println("=====================");
	
	// 정적 메소드 (Static Method)
	// 1. 매개 변수와 반환값이 없는 메소드 호출 
	C_StaticMethod.method1();  // 20
	C_StaticMethod.method1();  // 21 
	
	
//	new C_StaticMethod().method1();
//	정적 멤버는 객체 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
//  그래야 메소드가 정적 메소드인지 객체 메소드인지 구분이 가능하기 때문이다.
	
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드 	
	int result = 0;
	result = C_StaticMethod.method2();
	System.out.println(result); // 22
	
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드 	
	C_StaticMethod.method3(30); // 52
	
	// 4. 매개 변수와 반환값이 있는 메소드 (가변인자 사용)	
	result = C_StaticMethod.method4();
	
	System.out.println(result); // 0
	System.out.println(C_StaticMethod.method4(8,9));
	System.out.println(C_StaticMethod.method4(8,9,10,20,30));
	
	
	}

}
