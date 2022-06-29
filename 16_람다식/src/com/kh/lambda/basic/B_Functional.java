package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FunctionalInterface;
import com.kh.lambda.basic.functional.B_FunctionalInterface;
import com.kh.lambda.basic.functional.C_FunctionalInterface;

public class B_Functional {
	public void method1() {
//		A_FunctionalInterface fi = new A_FunctionalInterface() {
//			
//			@Override
//			public void method() {
//				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
//			}
//		};
//		
//		fi.method();

		A_FunctionalInterface fi = ()-> System.out.println("매개변수와 반환값이 없는 람다식");
		
		fi.method();
	}
	
	public void method2() {
		B_FunctionalInterface fi = (int a) -> System.out.println(a*a);
		
		fi.method(30);
		
		// 매개변수의 타입 생략 가능 
		fi = (a) -> System.out.println(a * 2);
		
		fi.method(20);
	}
	
	public void method3() {
		C_FunctionalInterface fi = (int a, int b) -> {
			return a + b;
		};
		
		System.out.println(fi.method(10, 20));
	
		// 매개변수의 타입, return 구문과 중괄호 생략 가능 
		fi = (a, b) -> a * b;
		
		System.out.println(fi.method(3, 4));
	}
	
}
