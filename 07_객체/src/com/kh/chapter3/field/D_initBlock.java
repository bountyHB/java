package com.kh.chapter3.field;

/*
 *  필드의 초기화 순서
 *    1. 필드 
 *    	1) JVM이 정한 기본값으로 초기화
 *    	2) 명시적 초기화
 *    	3) 인스턴스 플록을 이용한 초기화
 *    	4) 생성자를 이용한 초기화
 *    
 *    2. 클래스 변수(static 필드) <- 객체를 만들지 않기 때문에 생성자로 초기화하지 않음 
 *  	1) JVM이 정한 기본값으로 초기화 
 *  	2) 명시적 초기화 
 *  	3) static 블록을 이용한 초기화 
 */

public class D_initBlock {
	// 1) JVM이 정한 기본값으로 초기화
	private String name;
	
	private static int age;
	
	
	// 2) 명시적 초기화
	private String phoneName = "아이폰12 미니";
	
	private int price = 1090000;
	
	private static String brand = "애플";
	
	// 3) 초기화 블록을 이용한 초기화
	// 인스턴스 블록은 필드를 초기화 시키는 블록으로 인스턴스 생성시마다 실행되고 초기화한다. 
	{
		phoneName = "아이폰13";
		price = 1190000;
		
//		인스턴스 블록에서는 클래스 변수도 초기화할 수 있다.
//		brand = "삼성; 
	}
	
	
//		static 블록은 클래스 변수를 초기화 시키는 블록으로 프로그램 시작 시 단 한번만 실행되고 초기화된다.
		static {
			age = 20;

//		static 블록에서는 필드를 초기화할 수 없다. 
//		name = "왓에버";
		
	}
	
	// 4) 생성자를 이용한 초기화 - 접근제한자 있고 반환값 없고 클래스 이름과 동일.
	public D_initBlock() {
		name = "멍청"; // this.name 도 가능.
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public static int getAge() {
		return age;
	}
	
	public String getPhoneName() {
		return phoneName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() { // static 필드는 getter에도 static이 붙음.
		return brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
