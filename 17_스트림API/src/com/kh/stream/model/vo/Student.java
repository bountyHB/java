package com.kh.stream.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
	
	private int idx;
	private String name;
	private int age;
	private String gender;
	private int math;
	private int english;
	
	@Override
	public int compareTo(Student student) {
		// 클래스 내부이기 때문에 student.getAge() 가 아닌 student.age()가 가능하다.
		// 비교해서 같으면 0, 작으면 음수, 크면 양수를 리턴한다.
		return Integer.compare(this.age, student.age);
	}

	// int idx 추가해서 앞의 클래스들이 에러나기 때문에 생성자를 추가했다.
	public Student(String name, int age, String gender, int math, int english) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.math = math;
		this.english = english;
	}
}