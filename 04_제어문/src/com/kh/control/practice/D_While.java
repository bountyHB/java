package com.kh.control.practice;

import java.util.Scanner;

public class D_While {
	/*
	 * while 문
	 * 
	 *  [표현식]
	 *   [초기식]
	 *  
	 *    while(조건식) {
	 *    	..실행 코드..
	 *    
	 *    	[증감식, 분기분]
	 *    }
	 */
	public void method1() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계 
		int sum = 0;
		int random = (int)(Math.random()*10 + 1);
		
		int i = 0; 
		
		while (i <= random) {
			sum += i;
			
			i++;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d",random ,sum);	
	}
	/*
	 * 사용자에게 계속 문자열을 입력 받고 그 문자열을 출력한다.
	 * 단, "exit" 문자열을 입력하면 프로그램을 종료한다.
	 */
	
	public void method2() {
		String str= "";
		Scanner scanner = new Scanner(System.in);
	// 분기문으로 작업 
//		while (true) {
//			System.out.print("문자열을 입력해주세요. > ");
//			str = scanner.nextLine();
//			
//			if(str.equals("exit")) {
//				break;
//			}
//			
//			System.out.println(str);
//		}
		while (!str.equals("exit")) {   // str 을 null 로 초기화한 경우 error.
			System.out.print("문자열을 입력해주세요. > ");
			str = scanner.nextLine();
			
			System.out.printf("%s\n", str);
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	
}