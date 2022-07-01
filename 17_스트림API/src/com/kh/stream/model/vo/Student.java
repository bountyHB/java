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

}