package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.model.vo.Student;

public class C_Mapping {
	
	/*
	 * 매핑 
	 *  - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
	 *  
	 *    mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다.
	 *    
	 *    flatMapXXX() : 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다.
	 *    
	 *    asDoubleStream() : IntStream을 DoubleStream으로 변환해서 리턴한다. 
	 *    
	 *    asLongStream() : IntStream을 LongStream으로 변환해서 리턴한다.
	 *    				
	 *    boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성하고 리턴한다.
	 */
	
	// mapXXX()
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("김삿갓", 17, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),
				new Student("성춘향", 20, "여자", 100, 100)
		);
		
		// student객체에서 문자열만 모아서 이름만 요소로 가지는 새로운 스트림을 만들어서 변환하여 출력
		students.stream()
				.map(student -> student.getName())
				.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		// 수학점수 평균내기
//		students.stream()
//		.mapToInt(student -> student.getMath())
//		.average()
//		.getAsDouble(); // 에서 command + shift + l
		
		double avg = students.stream()
		.mapToInt(student -> student.getMath())
		.average()
		.getAsDouble();
		
		System.out.println("수학점수의 평균 : " + avg);
	}
	
	// flatMapXXX()
	public void method2() {
		
		List<String> list = Arrays.asList("Java11 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		// 쪼개진 요소들을 가진 하나의 스트림을 리턴
//		list.stream()
//			.flatMap((str)->{
//				String[] arr = str.split(" ");
//			
//				return Arrays.stream(arr);
//			}).forEach(System.out::println);
		
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(System.out::println);
	}
	
	// asDoubleStream(), asLongStream(), boxed()
	public void method3() {
	
		int[] arr1 = {1, 2, 3, 4, 5};
		double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(arr1)
			  .asDoubleStream()
			  .forEach(arr -> System.out.print(arr + " "));
	
		System.out.println();
	
		Arrays.stream(arr1)
		.asLongStream()
		.forEach(arr -> System.out.print(arr + " "));
	
		System.out.println();

		Arrays.stream(arr2)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.forEach(arr -> System.out.print(arr + " "));
	}
}
