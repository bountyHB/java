package com.kh.chapter1.abstraction;

// 학생을 추상화해서 클래스를 만들어보자.
public class Student {
	// 필드 (속성)
	public int sNum; // 학번 
	public String name; // 이름 
	public int age; // 나이 
	public int math; // 수학점수  
	public int eng; // 영어점수  
	
	// 메소드 (기능)
	public int sum() {
		return math + eng;  // 반환하는 값 
	}
	
	public double avg() {
		return (sum() / 2.0); // 같은 클래스내에 sum이 있기에 바로 호출가능하다.
	}


}
