package com.kh.lambda.standard.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 데이터 생성자
@Data // getter setter toString equals hashCode
public class Student {
	private String name;
	private int age;
	private String gender;
	private int math;
	private int english;

	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAvg () {
		return (this.math + this.english)/2;
	}
}