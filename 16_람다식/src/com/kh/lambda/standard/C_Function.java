package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

import lombok.ToString;

public class C_Function {
	
	/*
	 * Function
	 *  - Function 함수적 인터페이스는 매개값과 반환값이 있는 applyXXX() 추상 메소드를 가지고 있다.
	 *  - applyXXX() 추상 메소드는 주로 매개값을 반환값으로 매핑(타입 변환)하는 역할을 한다.
	 */
	
	public void method1() {
		// 객체 생성 및 초기화
		Student student = new Student("김삿갓", 21, "남자", 80, 70);
		
		// setter로 나이 수정 
		student.setAge(30);
		
		// toString 출력 확인
		System.out.println(student); // Student(name=김삿갓, age=30, gender=남자, math=80, english=70)
		
		// Function
//		Function<Student, String> function = (Student s)->{
//			return s.getName(); // 객체의 이름만 리턴
//		};
		
		Function<Student, String> function = s -> s.getName(); 

		// 재정의된 메소드 출력
		System.out.println("what ur name? : " + function.apply(student));
		
		// BiFunction
//		BiFunction<String, Integer, Student> biFunction = (String name, Integer age) -> {
//			return new Student(name, age);
//		};
		
		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age);
//		BiFunction<String, Integer, Student> biFunction = student::new::;
		
		// 재정의된 메소드 출력
		System.out.println(biFunction.apply("홍길동", 23));
		
		// 메소드에 람다식을 넘겨서 처리하도록 한다.
		System.out.print("[수학점수] : ");
		printvalue((s) -> {return s.getMath();}, student);

		System.out.print("[영어점수] : ");
		printvalue((s) -> {return s.getEnglish();}, student);
		
		// 수학과 영어의 평균점수를 구하시오
		System.out.print("[평균점수] : ");
		printvalue((s) -> (s.getMath()+s.getEnglish())/2, student);
		printvalue((s) -> s.getAvg(), student);
	
	}
	public void printvalue(ToIntFunction<Student> function, Student student) {
	
		System.out.println(function.applyAsInt(student));
	}
}
