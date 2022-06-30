package com.kh.lambda.basic;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

import com.kh.lambda.standard.model.vo.Student;

public class C_MethodReference {
	
	public void method1() {

//		IntBinaryOperator intBinaryOperator = (a, b) -> {
//			return Math.max(a, b);
//		};
		
		// 위에서 불필요한 값들을 삭제
//		IntBinaryOperator intBinaryOperator = (a, b) -> Math.max(a, b);
		
		// 매개값을 줄이기. 메소드 참조
		// 정적 메소드를 참조할 경우에는 클래스이름 뒤에 :: 기호를 붙이고 메소드 이름을 기술하면 된다.
		IntBinaryOperator intBinaryOperator = Math::max;
		
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		
		// 객체의 메소드를 참조할 경우에는 참조변수 :: 기호를 붙이고 메소드 이름을 기술하면 된다.
//		Consumer<String> consumer = s -> System.out.println(s);
		Consumer<String> consumer =System.out::println;
		
		consumer.accept("helllo");
		
		// 객체의 메소드를 참조할 경우에는 참조변수 :: 기호를 붙이고 메소드 이름을 기술하면 된다. 2
//		Function<Student, String> function = s -> s.getName();
		Function<Student, String> function = Student::getName;
		
		System.out.println(function.apply(new Student("홍길동", 20)));
		
		// 생성자 참조.
//		Supplier<Student> supplier = () -> {return new Student();};
//		Supplier<Student> supplier = () -> new Student();
		Supplier<Student> supplier = Student::new;
		
		System.out.println(supplier.get());
		
		// 매개 변수를 2개 받아서 하나의 값(객체)으로 리턴.
//		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age); 
		BiFunction<String, Integer, Student> biFunction = Student::new; 
		
		System.out.println(biFunction.apply("이몽룡", 22));
	}
}
