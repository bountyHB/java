package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		
		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].information());
		}
//		System.out.println(Arrays.toString(student));
		System.out.println("=====================================");

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 ==> while(true) 무한 반복문을 통해 
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		
		Employee[] employee = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		
		
		// 계쏙 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
		// 'n'일 경우 더 이상 그만 입력 받도록..
		char answer = '\u0000';
		System.out.print("계속 추가하시겠습니까 ? : ");
		answer = sc.nextLine().charAt(0);
		
		while (true) {
			if (answer == 'y' || answer == 'Y') {
			
				} else {
					break;
				}
		} 

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
		
		// 배열에 담긴 사원들의 정보를 모두 출력 
		
		
		
		
	}

}
