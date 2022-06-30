package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class A_Consumer {
	/*
	 * Consumer 
	 * 	- Consumer 함수적 인터페이스는 리턴값이 없는 accept() 추상 메소드를 가지고 있다.
	 *  - accept() 추상 메소드는 매개값을 소비하는 역할을 한다.
	 */
	
	public void method1() {
//		Consumer<String> consumer = new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				
//			}
//		};
//		
		// Consumer
		Consumer<String> consumer;
		consumer = (String str) -> System.out.println(str);
		
		// accept 추상 메소드 확인
//		consumer.accept(null);

		// 재정의된 메소드 출력
		consumer.accept("Consumer : 한 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");
		
		// BiConsumer
		BiConsumer<String, String> biConsumer;
		biConsumer = (str1, str2) -> System.out.println(str1+str2);
		
		// accept 추상 메소드 확인
//		biConsumer.accept(null, null);
		
		// 재정의된 메소드 출력
		biConsumer.accept("biConsumer : ", "두 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");
		
		// DoubleConsumer
		// 제네릭스없이 기본 타입의 자료형으로 받는다.
		DoubleConsumer dConsumer; 
		dConsumer = (value) -> System.out.println("DoubleConsumer : 하나의 double 타입의 값을 받아서 소비한다. \tvalue : " + value);
//		dConsumer = System.out::println; // 매개값으로 받는 값만 출력
		
		// accept 추상 메소드 확인
//		dConsumer.accept(0);
		
		// 재정의된 메소드 출력
		dConsumer.accept(3.14);
		
		// ObjIntConsumer
		// object(제네릭스로 타입 지정) + int value
		ObjIntConsumer<String> objIntConsumer = (String str, int value) ->{
			System.out.print("ObjIntConsumer : 두 개의 매개값 (제네릭으로 지정된 타입의 객체, int 타입의 값)을 받아서 소비한다.");
			System.out.println(str + value);
		};
		
		// accept 추상 메소드 확인
//		objIntConsumer.accept(null, 0);
		
		// 재정의된 메소드 출력
		objIntConsumer.accept("Java", 11);
	}
}
