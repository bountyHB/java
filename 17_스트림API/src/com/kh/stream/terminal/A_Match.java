package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class A_Match {
	
	/*
	 * 매칭 
	 *  - 최종 처리 단계에서 요소들이 특정 조건을 만족하는지 조사하는 역할을 한다.
	 * 
	 *    allMatch(Predicate)
	 *    : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
	 *    
	 *    anyMatch(Predicate)
	 *    : 최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
	 *    
	 *    noneMatch(Predicate)
	 *    : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
	 */
	
	
	public void method1() {
		
		boolean result = false;
		int[] arr = {2, 4 ,6};
		
		result = Arrays.stream(arr).allMatch(value -> value % 2 == 0);
		System.out.println(result); // true
		
		result = Arrays.stream(arr).anyMatch(value -> value % 3 == 0);
		System.out.println(result); // true

		result = Arrays.stream(arr).noneMatch(value -> value % 5 == 0);
		System.out.println(result); // true
	}

	
	public void method2() {
		
		boolean result = true;
		List<Student> students = Arrays.asList(
				new Student("김삿갓", 29, "남자", 80, 50),
				new Student("홍길동", 20, "남자", 80, 80),
				new Student("성춘향", 17, "여자", 100, 100)
		);
		
		// 나이가 20살 이상인 학생들이 모두 남자인지 확인하시오.
		result = students.stream()
				.filter((value) -> value.getAge() >= 20)
//				.allMatch((value) -> value.getGender() == "남자");
				.allMatch((value) -> value.getGender().equals("남자"));
		
		System.out.println(result);
		
		// 남학생들 중에 평균이 70점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
		result = students.stream()
				.filter((value) -> value.getGender() == "남자")
//				.forEach(system.out::println); // 중간마다 확인해보며 진행해도 된다.
				.anyMatch((value) -> (value.getMath() + value.getEnglish()) / 2 >= 70);
		
		System.out.println(result);
	}
}
