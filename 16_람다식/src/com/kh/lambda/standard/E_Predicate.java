package com.kh.lambda.standard;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.kh.lambda.standard.model.vo.Student;

public class E_Predicate {
	
	/*
	 * Predicate
	 *  - Predicate 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 testXXX() 추상 메소드를 가지고 있다.
	 *  - testXXX() 추상 메소드는 매개값을 조사해서 true / false를 리턴하는 역할을 한다.
	 */
	
	public void method1() {
		Student student1 = new Student("김삿갓", 21, "남자", 80, 70);
		Student student2 = new Student("성춘향", 17, "여자", 100, 100);
		
		// Predicate
		// 입력받은 객체가 남자이면 false 여자이면 true 리턴하도록 메소드 정의
		Predicate<Student> predicate = (Student s) -> {
			return s.getGender().equals("여자");
		};

//		Predicate<Student> predicate = (Student s) -> s.getGender().equals("여자");

		System.out.println("김삿갓은 여자입니까 ? : " + predicate.test(student1));
		System.out.println("성춘향은 여자입니까 ? : " + predicate.test(student2));
		
		// IntPredicate
		IntPredicate intPredicate = (a) -> 100 < a;
		
		System.out.println(intPredicate.test(30)); // false
		System.out.println(intPredicate.test(101)); // true
		
		// BiPredicate
		// 두 성별을 비교해서 같은지 확인
		BiPredicate<Student, Student> biPredicate = (s1, s2) -> {
			return s1.getGender().equals(s2.getGender());
		};
		
		System.out.println(biPredicate.test(student1, student2));
	}
}
