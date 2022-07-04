package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.kh.stream.model.vo.Student;

public class C_Collect {

	/*
	 * 수집 
	 *  - 스트림 요소들은 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 collect()를 제공한다.
	 *  - collect() 메소드를 사용하면 필요한 요소만 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
	 */
	
	public void method1() {
		
		List<Student> students = Arrays.asList(
				new Student(1, "김삿갓", 29, "남자", 80, 50),
				new Student(2, "홍길동", 20, "남자", 80, 80),
				new Student(3, "성춘향", 17, "여자", 100, 100),
				new Student(4, "이몽룡", 23, "남자", 60, 70),
				new Student(5, "심청이", 15, "여자", 90, 90)
		);
		
		// collect(Collectors.toList())
		List<Student> list = 
		students.stream()
				.filter(value -> value.getGender().equals("남자"))
				.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		/*
		    Student(idx=1, name=김삿갓, age=29, gender=남자, math=80, english=50)
			Student(idx=2, name=홍길동, age=20, gender=남자, math=80, english=80)
			Student(idx=4, name=이몽룡, age=23, gender=남자, math=60, english=70)
		 */

		System.out.println();
		
		// Collectors.toCollection(HashSet::new)
		Set<Student> Set = 
		students.stream()
				.filter(value -> value.getGender().equals("여자"))
				.collect(Collectors.toSet());
//				.collect(Collectors.toCollection(()-> new HashSet<>())); // 직접 타입 지정하고 싶을 때
//				.collect(Collectors.toCollection(HashSet::new)); // 참조 형식으로
		
		Set.forEach(System.out::println);
		
		/*
		    Student(idx=5, name=심청이, age=15, gender=여자, math=90, english=90)
			Student(idx=3, name=성춘향, age=17, gender=여자, math=100, english=100)
		 */
		
		System.out.println();
		
		// Map<Integer, String>
		// key 와 value 각각 Function 함수적 인터페이스를 구현해주어야 함
		Map<Integer, String> map =
		students.stream()
				.collect(Collectors.toMap(student -> student.getIdx(), 
										  student -> student.getName()));
//		.collect(Collectors.toMap(Student::getIdx, Student::getName));
				
		System.out.println(map); // {1=김삿갓, 2=홍길동, 3=성춘향, 4=이몽룡, 5=심청이}
		
		// Map<Integer, Student> 방법 1
		Map<Integer, Student> map2 =
		students.stream()
				.collect(Collectors.toMap(student -> student.getIdx(), 
										  student -> student));
//										  Function.identity()));
				
		System.out.println(map2);
				
		/*
		  {1=Student(idx=1, name=김삿갓, age=29, gender=남자, math=80, english=50), 
		   2=Student(idx=2, name=홍길동, age=20, gender=남자, math=80, english=80), 
		   3=Student(idx=3, name=성춘향, age=17, gender=여자, math=100, english=100), 
		   4=Student(idx=4, name=이몽룡, age=23, gender=남자, math=60, english=70), 
		   5=Student(idx=5, name=심청이, age=15, gender=여자, math=90, english=90)}
		 */
				
		System.out.println();
		
		// 성별을 가지고 그룹핑
		Map<String, List<Student>> map3 =
		students.stream()
				.collect(Collectors.groupingBy(student -> student.getGender()));
		
		System.out.println(map3);
		
		/*
		  {여자=[Student(idx=3, name=성춘향, age=17, gender=여자, math=100, english=100), 
		        Student(idx=5, name=심청이, age=15, gender=여자, math=90, english=90)], 
		   남자=[Student(idx=1, name=김삿갓, age=29, gender=남자, math=80, english=50), 
		        Student(idx=2, name=홍길동, age=20, gender=남자, math=80, english=80), 
		        Student(idx=4, name=이몽룡, age=23, gender=남자, math=60, english=70)]}
		 */
		
	}
}
