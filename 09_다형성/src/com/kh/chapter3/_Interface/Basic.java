package com.kh.chapter3._Interface;
// 1. 공통적으로 가지고 있는 기능을 인터페이스로 만들었다.
public interface Basic {
	// 인터페이스에서 필드는 무조건 상수 필드이다. (public static final 생략 가능) 
	/*public static final*/ int num = 10;
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다. (public abstract 생략 가능)
	// 실제로는 인터페이스를 구현하는 클래스에서 구현할 것이기 때문에 추상메소드만 가지게 된다.
	/*public abstract */void turnOn(); 
	/*public abstract */void turnOff();
	
	
}
