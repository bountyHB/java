package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.after.Tv;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {

		// Desktop 객체 생성 
//		Desktop desktop = new Desktop();
		Desktop desktop = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true);
		SmartPhone smartPhone = new SmartPhone ("a2222", "아이폰12 미니", "애플", 960000, "KT");
		Tv tv = new Tv("t-01", "올레드 벽걸이 TV", "LG", 2500000, 60);
//		Product product = new pro
		
//		setter를 이용해 부르면 수정하여 출력할 수 있다.
		desktop.setpCode("a1112");
		desktop.setName("맥21인치");
		
		// 출력
//		System.out.println(desktop.toString()); // toString 직접 호출. desktop클래스에서 막아놔도 실행되는데, 오브젝트 클래스안에 있기 때문에 가능하다.
		System.out.println(desktop); // toString 메소드가 없었다면 주소값이 출력됨.
		System.out.println(smartPhone);
		System.out.println(tv);
	
		
		
		System.out.println("========================================================");
		// 오버라이딩 테스트 
		Book book1 = new Book("자바의 정석" , "홍길동", 3000);
		Book book2 = new Book("자바의 정석" , "홍길동", 3000);
		Book book3 = new Book("자바 너무 어려워" , "문길동", 200);
		
		// toString() 테스트 
//		System.out.println(book1); // 참조값이 출력 
		System.out.println(book1.toString()); // 문자열이 출력 
		System.out.println(book2); 
		System.out.println("========================================================");
		
		// equals() 테스트
		System.out.println("book1과 book2가 같은 책 입니까? " + (book1 == book2)); 
		// false. 주소값을 비교하는데 각자 new 연산자로 두개의 객체가 만들어진 상태다.
		System.out.println("book1과 book2가 같은 책 입니까? " + (book1.equals(book2))); 
		// false. ctrl 누르고 equals 메소드를 들어가보면 this==obj 로 주소값을 비교한다.
		// equals 메소드를 override 후 사용하면 true가 나오게 된다.
		System.out.println("book1과 book2가 같은 책 입니까? " + (book1.equals(book3))); 
		System.out.println("========================================================");

		// hashCode() 테스트 
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		System.out.println("book3의 hashCode : " + book3.hashCode());
		

		
		
	}
}
