package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Filtering {
	/*
	 * 필터링
	 *  - 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 *  
	 *    distinct() : 중복을 제거하는 메소드이다. equals() 메소드가 true를 리턴하면 동일한 객체로 판단한다.
	 *    filter(predicate) : 매개 값으로 전달되는 predicate가 false를 리턴하는 요소를 제거한다.
	 */
	
	// 중복 제거 distinct()
	public void method1() {
		// List 배열 생성
		List<String> names = Arrays.asList("김삿갓", "홍길동", "이몽룡", "성춘향", "김삿갓", "성춘향");
		
		// names.strea()후 alt+command+l 로 생성
		Stream<String> stream = names.stream();
		
		// List 배열을 스트림으로 출력
		stream.forEach(name -> System.out.print(name + " "));
	
		// 이미 최종 처리까지 호출된 스트림은 다시 사용할 수 없다. 
		// (컬렉션으로부터 다시 스트림을 얻어와야 한다.)
//		stream.distinct().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		// distinct()로 중복이 제거 된 채 출력
		names.stream().distinct().forEach(name -> System.out.print(name + " "));
	
		System.out.println();
		
		// List 배열 생성
		List<Student> students = Arrays.asList(
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),
				new Student("성춘향", 17, "여자", 100, 100)
		);
		
		// equals()가 재정의 되지 않은 상태에서는 중복 제거가 되지 않는다.
		students.stream().distinct().forEach(student -> System.out.println(student));
	}
	
	// 필터 메소드 filter(predicate)
	public void method2() {
		List<String> names = Arrays.asList("김삿갓", "홍길동", "이몽룡", "성춘향", "김삿갓", "성춘향", "변사또", "이순신");

		// 이씨 성을 가진 사람만
		names.stream()
//			.filter((String name) -> {return name.startsWith("이");})
			.filter(name -> name.startsWith("이"))
			.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		// 성씨 성을 가진 사람만 중복 제거해서
		// 최종처리 메소드 전에 넣어주면 된다
		names.stream()
//		.distinct()
		.filter(name -> name.startsWith("성"))
		.distinct()
		.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		// students 배열 생성
		List<Student> students = Arrays.asList(
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("김삿갓", 21, "남자", 80, 50),
				new Student("홍길동", 30, "남자", 80, 80),
				new Student("성춘향", 17, "여자", 100, 100)
		);
		
		// 성별이 여자인 요소만 출력 
		students.stream()
				.filter((Student student) -> {return student.getGender().equals("여자");})
				.forEach((Student student) -> System.out.println(student));
		
		System.out.println();
		
		// 수학 점수, 영어 점수가 둘 다 60점 이상인 요소만 출력  
		students.stream()
				.filter((student) -> student.getEnglish() >= 60 && student.getMath() >= 60)
				.forEach((Student student) -> System.out.println(student));
	}
}
