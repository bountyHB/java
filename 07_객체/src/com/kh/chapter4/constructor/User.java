package com.kh.chapter4.constructor;

/*
 * 생성자
 *   - 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 *   - 생성자 작성 시 주의사항 
 *     - 생성자의 이름은 반드시 클래스 이름과 동일해야 한다. 
 *     - 반환형이 존재하지 않는다.
 * 
 */
// getter setter 없이 생성자 만들어 초기화 하고 user 정보만 출력하도록 할 예정
public class User {

	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	
	// *기본 생성자 : 메소드의 종류이다.
	// *매개값을 넣은 생성자를 추가하자 Application 오류가 난다. 
	// *하나의 생성자라도 존재하면, JVM이 자동으로 만들어주지 않는다.
	// 그렇기 때문에 기본생성자를 하나 넣어주는 것이 좋다.
	// 물론 기본생성자에서도 간단한 코드를 작성해도 상관없다. (꼭 내용이 없을 필요는 없다.
	// 기본 생성자에서 접근 제어자를 private으로 선언한다면, 외부에서는 객체를 생성할 수 없다.
	// 하지만 내부에서는 사용이 가능하다. 
	public User() {  // 생성자1.
		System.out.println("기본 생성자 호출");
	}
	
	// 동일한 이름으로 필드나 메소드를 만들면 오류가 나게 된다. 
	// 하지만 매개변수의 갯수나 자료형이 다르면 허용된다. => 오버로딩.
	// 매개 변수가  있는 생성자 (아이디 ,패스워드 , 이름)
	public User(String id, String password, String name) {  //생성자2.
		this.id = id; // 이 필드는 매개변수에서 값을 받아 넣을것이라는 뜻.
		this.password = password; // 앞은 필드명, 뒤는 매개변수명. 구분하기위해 this를 붙였다.
		this.name = name;
	}
	
	// 오버로딩에서는 데이터 이름과 상관없이 데이터 타입만 하나 달라도 다른 생성자로 인정해준다.
	// 매개 변수가 있는 생성자 (아이디 ,패스워드 , 이름, 나이, 성별)
	public User(String id, String password, String name, int age, char gender) {
//		this.id = id;
//		this.password = password;
//		this.name = name;
		// 클래스 내에서 문자열 매개 변수 3개를 가지는 생성자를 호출한다. 
		this(id, password, name); // 생성자에서 다른 생성자(위의 생성자)를 호출할수 있다. 
		                          // 단, 첫번째 줄에서만 사용해야한다.
		this.age = age;
		this.gender = gender;
	}
	

	public String information() {
//		this(id, password, name); // 다른 이름의 메소드에서는 생성자를 사용하는것이 불가능하다.
		
		return this.id + ", " + this.password + ", " + this.name + ", " + this.age + 
				", " + this.gender;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
