package com.kh.chapter2;

import com.kh.chapter2._class.Person;

public class Application {

	public static void main(String[] args) {

		Person person = new Person(); // 객체 인스턴스 생성하며 생성자호출 
//		Phone phone = new Phone();    // default로 생성되었기 때문에 동일한 패키지 내에서만 가능하다.
		// 그러나 같은 패키지 내에 있는 person 클래스에서는 접근이 가능하다.

		
		person.setName("홍길동");
		person.setAge(28);
		
//		person.setPhone(); // person 클래스에서 phone 메소드 생성전에는 접근이 안된다. 

		// person 클래스에서 phone 메소드 생성후 접근이 가능한 모습.
		person.setPhone("아이폰 12 미니", "화이트", "애플");
		
		
		
		
		person.whoAreYou();
		
		
	}

}
