package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice {

	
	
	public void method1() {
		// 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자 : ");
		char chr = scanner.next().charAt(0);
		
		System.out.print("A Unicode : " + (chr*1));
				
		
		
		scanner.close();
		
	}
	

	public void method2() {
		
		// 실수형으로 국어, 영어, 수학 세과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리하세요.
		
		Scanner scanner = new Scanner(System.in);
		double kor = 0.0;
		double eng = 0.0;
		double math = 0.0;
		
		System.out.print("국어 : ");
		kor = scanner.nextDouble(); 
		System.out.print("영어 : ");
		eng = scanner.nextDouble(); 
		System.out.print("수학 : ");
		math = scanner.nextDouble(); 
		
		int total = (int)(kor + eng + math); 
		int avg = (int)(kor + eng + math)/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		scanner.close();
		
		
	}
	

	public void method3() {
		
		// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산 (+,-,*,/)과 형변환을 
		// 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 - (iNum2 * 2) );  // 2
		System.out.println( (int)(dNum * 2) -1 );  // 2

		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( iNum1 * 1.0 );  // 10.0
		
		System.out.println( (float)iNum1 / iNum2 );  // 2.5
		System.out.println( dNum );  // 2.5
		
		System.out.println( (int)fNum );  // 3
		System.out.println( iNum1 / (int)fNum ); // 3

		System.out.println( iNum1 / fNum );  // 3.3333333
		System.out.println( (double)(iNum1 / fNum) );  // 3.333333333333335
		
		System.out.println( "'" + ch + "'" );  // 'A'
		System.out.println( (int)ch );  // 65
		System.out.println( (int)ch + iNum1 );  // 75
		System.out.println( "'" + (char)((int)ch + iNum1) + "'" );  // 'K'

		

		
	}
	
	
	
}
