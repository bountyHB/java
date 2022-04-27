package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Application {

	public static void main(String[] args) {
	
//		User user = new User(); // user 클래스안에 있는 기본 생성자 (new User();) 를 호출한다.
//		*매개값을 가지게 되는 생성자가 존재하게 되면, 자동으로 객체를 만들어주지 않는다.
		
		
		// 기본 생성자로 객체 생성 : 생성자를 만들지 않았지만 자동으로 컴파일러가 만들어 주기 때문에 객체 생성에 문제가 없다.
//		User user = null;  // 1.user 타입의 참조변수를 null 로 초기화
//		user = new User(); // 2. 기본 생성자.
		
		User user = new User();
		
		System.out.println(user.information());
		
		
		// 매개 변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
		user = new User("gildong", "1234", "홍길동");
		System.out.println(user.information());
		
		
		
		// 매개 변수가 있는 생성자로 객체 생성 (5개의 값을 생성자로 전달)
		user = new User("gildong", "1234", "홍길동", 20, '남');
		System.out.println(user.information()); 
		
		
		// 생성자와 메소드 초기화 차이.
		// 생성자 - > 객체를 만들떄 초기화
		// 세터 -> 객체를 만들고 참조변수를 호출한후 초기화 
		
	}

}
