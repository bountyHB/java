package com.kh.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Create {
	/*
	 * 스트림의 종류
	 *  - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 
	 *    자식 인터페이스들이 상속 관계를 이루고 있다.
	 *  
	 *  - Stream, IntStream, LongStream, DoubleStream이 있다.
	 *  
	 * 스트림 생성
	 *  - 숫자 범위로 스트림을 얻는 방법
	 *    IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
	 *    
	 *  - 배열로부터 스트림을 생성하는 방법
	 *    Arrays.Stream(배열) 메소드로 스트림을 생성한다.
	 *    각 스트림 (Stream, Intstream, ...)의 of(배열) 메소드로 스트림을 생성한다.
	 *    
	 *  - 컬렉션으로부터 스트림을 생성하는 방법
	 *    컬렉션의 stream() 메소드를 이용해서 생성한다. (java.util.Collection.stream())
	 *    
	 */

	// 숫자 범위로 스트림을 생성하는 방법 
	public void method1() {
		// 첫 번째 매개 값 ~ 두 번째 매개 값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다. 
		IntStream stream = IntStream.range(1, 10); 
		int sum = stream.sum();
		
		System.out.println("> Sum : " + sum); // 45 
		
		// peek()을 사용하여 합계를 얻기 전에 원하는 실행구문을 작성 할 수 있음
		// peek(intConsumer action)
		// 중간처리 메소드들은 Stream을 리턴하고 최종처리 메소드들은 값을 리턴함
		stream = IntStream.range(1, 10); 
		sum = stream.peek(value -> System.out.print(value + " ")).sum();
		
		System.out.println("> Sum : " + sum); // 1 2 3 4 5 6 7 8 9 > Sum : 45 
		
		// 첫 번째 매개값 ~ 두 번째 매개값까지 값을 요소로 가지는 스트림 객체를 생성한다.
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.sum();
		
		System.out.println("> Sum : " + sum); // 55
	}
	
	// 배열로부터 스트림을 생성하는 방법
	public void method2() {
		String[] names = {"김삿갓", "홍길동", "이몽룡", "성춘향", "김삿갓"};
		
		// for문을 사용하여 출력
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력 Stream.forEach()
		Stream<String> stream = Arrays.stream(names);
//		Stream<String> stream = Stream.of(names);
		stream.forEach(name -> System.out.print(name + " "));

		stream = Stream.of("김삿갓", "홍길동", "이몽룡", "성춘향", "김삿갓");
		stream.distinct().forEach(name -> System.out.print(name + " ")); // 중복제거
		
	}

	// 컬렉션으로부터 스트림을 생성하는 방법
	public void method3() {
		
		List<Student> list = Arrays.asList(
			new Student("김삿갓", 21, "남자", 80, 50),
			new Student("홍길동", 30, "남자", 80, 80),
			new Student("성춘향", 17, "여자", 100, 100)
		);
		
		// for문을 사용하여 출력 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력 Stream.forEach()
		Stream<Student> stream = list.stream();
//		stream.forEach((student) -> System.out.println(student));
		
		// 스트림은 최종 처리 후 다시 사용할 수 없기 때문에 변수에 담지 않고 바로 쓰는 편이다.
		list.stream().forEach(System.out::println);
		
		System.out.println();

		// 다시 스트림 얻어와서 필터링 후 출력 
		list.stream().filter(Student -> Student.getGender().equals("남자"))
					 .forEach(System.out::println);
		
		// 다시 스트림 얻어와서 필터링 후 배열로 만들어 출력
		list.stream().filter(Student -> Student.getGender().equals("남자"))
					 .collect(Collectors.toList());
		
		System.out.println(list);
	}
}