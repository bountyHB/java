package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.model.vo.Student;

import lombok.Value;

public class B_Sorted {
	
	/*
	 * 정렬 
	 *  - 스트림은 요소가 최종 처리 되기전에 중간 단계에서 요소를 정렬해서 최종 처리 순서를 변경할 수 있다.
	 *  - IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다.
	 *  - Stream<>은 요소 객체가 Comparable 인터페이스를 구현하지 않을 경우 예외가 발생한다.
	 */

	
	public void method1() {
		
		List<String> names = Arrays.asList("김삿갓", "홍길동", "이몽룡", "성춘향", "김삿갓", "성춘향");
		
		// 객체의 Comparable 인터페이스 구현 내용에 따라서 정렬
		names.stream()
   			 .distinct()
//			 .sorted()
			 .sorted(Comparator.naturalOrder())
			 .forEach((name)->System.out.print(name + " "));
			 
		System.out.println();
		System.out.println();
		
		// 객체의 Comparable 인터페이스 구현 내용 반대로 정렬
		names.stream()
			 .distinct()
			 // 다른 조건은 람다식으로 만들어 넘길 수 있다
//			 .sorted((name1, name2) -> name2.compareTo(name1))
			 .sorted(Comparator.reverseOrder())
			 .forEach((name)->System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("김삿갓", 17, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),
				new Student("성춘향", 20, "여자", 100, 100)
		);
		
		students.stream()
//				.sorted((o1, o2) -> o1.getAge() - o2.getAge()) // 오름차순으로 정렬하는 법
//				.sorted()
				// student 객체가 Comparator를 구현하지 않고 있어서 에러 뜸
//				.sorted(Comparator.naturalOrder())
				// 구현하게 만든 뒤로는 나이순으로 정렬 가능. (student 클래스에서 메소드 오버라이드를 나이순으로 했기 때문에)
//				.sorted(Comparator.naturalOrder())
				.sorted(Comparator.reverseOrder()) // 나이 반대순으로 정렬 가
				.forEach(Student -> System.out.println(Student));
	}

	// 요소가 기본 자료형일 때
	public void method2() {
		// 배열 생성과 동시에 초기화
//		int[] arr = {1, 2, 3, 4, 5};
		
		// 배열 생성 후 초기화 
//		int[] arr;
//		arr = new int[] {1, 2, 3, 4, 5};
		
		// 다음과 같이 생성해야 한다.
		// 기본 자료형의 요소를 가지는 스트림은 오름차순으로 정렬한다. 
		Arrays.stream(new int[]{3, 5, 1, 4, 2})
			  .sorted()
			  .forEach(value -> System.out.print(value + " "));;
		
			  System.out.println();
			  System.out.println();

		// 기본자료형은 안되는데 객체는 가능함 => wrapper 클래스를 이용	  
	    // Integer 에 있는 compareTo 이용
		Arrays.stream(new int[]{3, 5, 1, 4, 2})
			  .boxed()
			  .sorted(Comparator.reverseOrder())
			  .forEach(value -> System.out.print(value + " "));;
	}
}
