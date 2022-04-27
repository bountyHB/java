package com.kh.control.practice;

import java.util.Scanner;

public class C_For {
	/*
	 * for 문
	 * 
	 * 	[표현법]
	 *    for(초기식; 조건식; 증감식) {
	 *    	..실행 코드..
	 *    }
	 *    
	 *    - 초기식 : 반목문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서
	 *             사용하게 될 변수를 선언하고 초기값을 대입한다.
	 *    
	 *    - 조건식 : 반목문이 수행되는 조건을 작성하는 구문으로 조건식이 true 이면
	 *    		   실행 코드를 실행하고, 조건식이 false이면 반복을 멈추고 빠져나온다.
	 *    
	 *    - 증감식 : 반복문을 제어하는 변수의 값을 증감 시키는 구문으로 주로 초기식에서 
	 *    		   제시한 변수를 가지고 증감 연산자(++, --)를 사용한다. 
	 *    
	 *    * 초기식, 조건식, 증감식은 생략이 가능하고 모두 생략하면 무한 루프에 빠진다.(for(;;))
	 */
	
	public void method1 () {
		// 반복문을 사용하지 않았을 때
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i + "번째 출력");
		}
		
		System.out.println();
		
		for (int i = 20; i >15; i--) {
			System.out.println(i + "번째 출력");
		}
	}
	
	public void method2 () {

			// 1부터 10까지의 정수들의 합계를 출력 
			
			int sum = 0;
			
			for (int i = 1; i <= 10; i++) {
//				sum = sum + i;
				sum += i;
//			}
			System.out.println("합계 : " + sum);
			}
		}
	
	public void method3 () {
			/*
			 * 1부터 랜덤값 (1~10)까지의 합계를 구하시오.
			 * java.lang.Math 클래스에서 제공하는 random()메소드를 사용
			 * Math.random() 호출시 -> 0.0~0.99990 사이의 랜덤값을 발생 (0.0 <= 랜덤값 <1.0)
			 * 
			 */

//			int random = (int)(Math.random()*10); // 0.0 ~ 9.99999
			int random = (int)(Math.random()*10 + 1); // 1.0 ~ 10.99999
			int sum = 0;
			
			System.out.println("1 ~ 10 사이의 랜덤값 : " + random);
			
			for (int i = 1; i <= random; i++) {
				sum += i;
			}
				
			System.out.printf("1 ~ %d까지의 합은 : %d\n", random , sum);
			
			
		}

	/*
	 * 중첩 for 문
	 * 
	 *   [표현법]
	 *   
	 *    for(초기식; 조건식; 증감식){
	 *  	  수행할 문장 	
	 *     
	 *        for(초기식; 조건식; 증감식){
	 *            수행할 문장 
	 *        }
	 *        
	 *        수행할 문장 
	 *    }
	 */
	public void method4 () {
		
	/*
	 * 2단 ~ 9단 까지 
	 *   단 -> 2 ~ 9까지 1씩 증가 (바깥쪽 for 문을 통해 해결)
	 *   곱해지는 수 -> 1 ~ 9 까지 1 씩 증가 ( 안쪽 for 문을 통해 해결)
	 *  == 2단 ==
	 *  2 x 1 = 2
	 *  ....
	 *  == 9단 ==
	 *  9 x 1 = 9
	 *  ...
	 *  9 x 9 = 81
	 */
		for (int i = 2; i <=9; i++) {
			System.out.printf("== %d단 ==\n", i);
			
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d x %d = %d\n", i , j , (i*j));
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void method5 () {
		/*
		   *****
		   *****
		   *****
		   *****	
		 */
		// 행이 1~4까지 반복 (바깥쪽 for 문)
		// 열이 1~5까지 반복 (안쪽 for 문)
		for (int i = 0; i <4; i++) {

			for (int j = 0; j < 5 ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	/*
	 * 실습 문제 1
	 * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
	 * 	예시 ) 
	 * 	 정수 > 10
	 * 	 총 합계 > 55
	 */

	public void practice1() {
			int num = 0;
			int sum = 0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("정수 > ");
			num = scanner.nextInt();
			
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			
			System.out.println("총 합계 > " + sum);
			scanner.close();
		}
		
	/*
	 * 실습 문제 2
	 * 사용자가 입력한 단을 출력하시오.
	 *  예시)
	 *    단 수 (2~9)를 입력해 주세요. >3
	 *    3 x 1 = 3
	 *    ...
	 *    3 x 9 = 27
	 *    
	 *    단 수(2~9)를 입력해 주세요. > 12
	 *    1~9 사이의 양수를 입력하여야 합니다.
	 */

	public void practice2() {
			
			int i = 0;
			int result = 0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("단 수 (2~9)를 입력해 주세요. > ");
			i = scanner.nextInt();
			
			if (1 <= i && i <= 9) {
				for (int j = 1; j <= 9; j++) {

				result = i * j;
				System.out.printf("%d x %d = %d\n", i, j, result);
//				System.out.printf("%d x %d = %d\n", i, j, (i * j));
				}
				
			} else {
				System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
			}
			scanner.close();			
		}
		
	/*
	 * 실습 문제 3
	  
	  아래와 같이 출력 되도록 for 문을 작성하시오.
	  
	  예시)
	   1***
	   *2**
	   **3*
	   ***4
	   
	   행이 1~4까지 반복
	   열이 1~4까지 반복
	   행과 열의 값이 같으면 숫자를 출력, 이외에는 *출력 
	   
	 */

	public void practice3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == j) {
//				System.out.printf("%d", j);
				System.out.println(i + 1);
				}else {
					System.out.printf("*");
				}
				
			}
			System.out.println();
		}
		
	}
	/*
	 * 실습 문제 4
	  
	  아래와 같이 출력 되도록 for 문을 작성하시오.
	  
	  예시)
	   *
	   **
	   ***
	   ****
	   *****
	   
	   행이 1~5까지 반복
	   열이 1~5까지 반복
	   열의 값이 행보다 작거나 같을 때까지 * 출력 
	 */

	public void practice4() {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.printf("*");
					}
				}System.out.println();
			}
	}
		
	
	
	/*
	 * 실습 문제 5
	 * 
	 * 사용자가 "안녕하세요." 라고 입력하면 아래와 같이 출력되도록 코드를 작성하세요.
	 * "안"
	 * "녕"
	 * "하"
	 * "세"
	 * "요"
	 * "."
	 *  참고 - length(), charAt() 메소드를 활용
	 */
	
	public void practice5() {
		String str = null;
//		char ch = ' ';
//		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("문자열 입력 > ");
//		str = scanner.nextLine();
//		
//		i = str.length();
//
//		for (int j = 0; j < i; j++) {
//			ch = str.charAt(j);
//			System.out.printf("%c\n", ch);
//		}
		System.out.print("문자열 입력 > ");
		str = scanner.nextLine();
		
		for (int i = 0; i < str.length(); i++ ) {
			System.out.println("\"" + str.charAt(i) + "\"");
		}
		
		scanner.close();
	}
}
