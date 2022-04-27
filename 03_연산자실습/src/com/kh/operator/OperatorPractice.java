package com.kh.operator;

import java.util.Scanner;

public class OperatorPractice {

	public void method1() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
		int num = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = num > 0 ? "양수다" : "양수가 아니다";
		
		
		
		System.out.println(result);
		
		scanner.close();
	}
	
	public void method2() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 
		// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세
		
		int num1 = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num1 = scanner.nextInt();
		
		result = (num1 > 0) ? "양수다" : (num1 < 0) ? "음수다" : "0이다";

		System.out.println(result);
		scanner.close();
		
		
	}
	
	public void method3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요.
		int num = 0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
		scanner.close();
	}
	
	public void method4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원 수와 사탕 개수를 키보드로 입력 받고 
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		int people = 0;
		int candy = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원 수 : ");
		people = scanner.nextInt();

		System.out.print("사탕 개수 : ");
		candy = scanner.nextInt();
		
		int mycandy = (candy / people);
		int leftcandy = (candy % people);
		
		System.out.println("1인당 사탕 개수 : " + mycandy);
		System.out.println("남는 사탕 개수 : " + leftcandy);
		
		scanner.close();
		
	}
	
	public void method5() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년 (13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요. 
		
		int age = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		result = (age <=13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		
		System.out.println(result);
		
		scanner.close();
	}
	
	public void method6() {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean result1 = true;
		boolean result2 = true;
		boolean result3 = true;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("입력1 : ");
		num2 = scanner.nextInt();
		
		System.out.print("입력1 : ");
		num3 = scanner.nextInt();
	
		result1 = (num1 == num2);
		result2 = (num2 == num3);
		result3 = (result1 && result2);
		
		System.out.println(result3);
		scanner.close();
	}
	
}
