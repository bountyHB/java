package com.kh.lambda.standard;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import com.kh.lambda.standard.model.vo.Student;

public class D_Operator {
	/*
	 * Operator
	 *  - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 추상 메소드를 가지고 있다.
	 *  - applyXXX() 추상 메소드는 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
	 */
	
	public void method1() {
		Student student1 = new Student("김삿갓", 21, "남자", 80, 70);
		Student student2 = new Student("성춘향", 17, "여자", 100, 100);
		
		// IntBinaryOperator
		IntBinaryOperator intBinaryOperator;
		
		// 메소드 확인 
//		intBinaryOperator.applyAsInt(0, 0);
		intBinaryOperator = (a , b) -> a * b;
	
		// 출력
		System.out.println(intBinaryOperator.applyAsInt(20, 30));
	
		// IntUnaryOperator
		IntUnaryOperator intUnaryOperator = a -> a * a;
		
		System.out.println(intUnaryOperator.applyAsInt(5));
	
		// 객체를 이용한 BinaryOperator
		BinaryOperator<Student> binaryOperator;
		
		// apply 메소드 확인
//		binaryOperator.apply(student1, student2);
	
		// 람다식을 이용해서 메소드 정의
		binaryOperator = (s1, s2) -> {
			return s1.getMath() > s2.getMath() ? s1 : s2;
		};
	
		// 재정의된 메소드 출력
		System.out.println(binaryOperator.apply(student1, student2));
	
		// 참고
		binaryOperator = BinaryOperator.<Student>maxBy((s1, s2)-> Integer.compare(s1.getMath(), s2.getMath()));
		
		System.out.println(binaryOperator.apply(student1, student2));
		
	}
}
