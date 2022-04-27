package com.kh.chapter5.method;

public class C_StaticMethod {
	private static int num1 = 10;
	public static int num2 = 10;
	
	// 1. 매개 변수와 반환값이 없는 메소드 
	public static void method1() {
		System.out.println(C_StaticMethod.num1 + num2);
		
		C_StaticMethod.num1++; 
//		동일한 이름의 매개변수는 필드를 가르키는것이 아니기때문에 구분해줘야
//		this.num1; // this. 는 객체가 있어야 하는것이기 때문에 쓸수 없다.
//		C_StaticMethod.num1; // 매개 변수가 있는 경우 클래스 이름으로 접근해야 한다.
	}
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드 	
	public static int method2() {
		return num1 + num2;
//		return C_StaticMethod.num1 + C_StaticMethod.num2; 위와 같은 문장
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드 	
	public static void method3(int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	// 4. 매개 변수와 반환값이 있는 메소드 (가변인자 사용)	
	public static int method4(int... numbers) {
		int sum = 0;
		
		for (int number : numbers) {
			sum += number; // sum = sum + number;
		// 기존 for문으로도 작성해보기.
		}
		
		return sum;
	}
	

}
