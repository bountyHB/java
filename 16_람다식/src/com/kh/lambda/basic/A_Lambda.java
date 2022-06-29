package com.kh.lambda.basic;

public class A_Lambda {
	public void method1() {
		// Thread 객체를 직접 생성. Thread 클래스를 상속하는 클래스를 만드는 방
		// Runnable 인터페이스를 구현해서 구현하는 Runnable 인터페이스를 스레드에 생성자로 넘겨주는 방법
		// Thread 클래스 생성자의 매개변수로는 Runnable이 있다.
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
			}
		});
		
		thread.start();
		
		// Runnable 인터페이스의 Run 메소드를 구현한 익명 구현 객체가 만들어져서 대입됨 
		thread = new Thread(() -> {
			System.out.println("람다식을 사용한 Thread 생성");
		});
		
		thread.start();
		
		Runnable runnable = () -> System.out.println("람다식을 사용한 Thread 생성2");
		thread = new Thread(runnable);
		
		thread.start();
		
	}
	
}
