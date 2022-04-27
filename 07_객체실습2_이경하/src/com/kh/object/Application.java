package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {

		
		
		// 기본생성자를 이용하여 첫 번째 Book 객체 생성 
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성
		// 객체가 가진 필드 값 출력 확인
		Book book1 = new Book();
		Book book2 = new Book("자바의정석",20000,0.2,"윤상섭");
		
		System.out.println(book1.info());
		System.out.println(book2.info());
		System.out.println("==============================");

		
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정 
		// 수정된 내용 출력 확인 
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAutor("홍길동");
		System.out.println(book1.info());
		System.out.println("==============================");

		
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력 
		// 할인된 가격 = 가격 - (가격 * 할인율)
		
		System.out.println("도서명 = " + book1.getTitle());
		System.out.println("할인된 가격 = " + (int)book1.discounted() + "원");
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + (int)book2.discounted() + "원");
		
		
		
		
	}

}
