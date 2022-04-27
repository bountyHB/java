package com.kh.control;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
	/*
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 만일 1 미만의 숫자가 입력됐다면 "잘못 입력하셨습니다."를 출력하세요.
	 * (for문 이용)
	 * 
	 * 
	 */
		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		
			if (num1 >= 1) {
				for (int i = 1; i <= num1; i++) {
					System.out.printf("%d ",i);
					}
				}else {
				System.out.println("잘못 입력하셨습니다.");			
			}
			scanner.close();
	}
//practice2 while문으로도 풀어보기.
	public void practice2() {
	/*
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 만일 1 미만의 숫자가 입력됐다면 "잘못 입력하셨습니다."가 출력되면서
	 * 다시 사용자가 값을 입력하도록 하세요.	
	 */
		
//		int num = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		while (true) {
//			System.out.print("값을 입력해주세요. > ");
//			num = scanner.nextInt();
//			
//				if (num>=1) {
//					for (int i = 1; i <= num; i++) {
//						System.out.printf("%d ",i);
//					} break;
//				}else {
//					System.out.print("잘못 입력하셨습니다. ");
//				}
//		}

		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num1 = scanner.nextInt();
		
			if (num1 >0) {
				for (int i = 1; i <= num1; i++) {
					System.out.printf("%d ",i);
				}scanner.close();
				return;
			}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void practice3() {
	/*
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * (for문 이용)
	 */
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = scanner.nextInt();
		
		if (num >= 1) {
			for (int i=num; i>=1; i--) {
				System.out.printf("%d ", i);
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}
//	Practice4는 scanner.close()를 어디에 써야하는걸까 
	public void practice4() {
	/*
	 * practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
	 * "잘못 입력하셨습니다. 다시 입력해주세요." 가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	 */
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = scanner.nextInt();
			
			if (num >= 1) {
				for (int i=num; i>=1; i--) {
					System.out.printf("%d ", i);
				}scanner.close();
				return;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} 
	} 
// 무엇을 반복할 것인가를 생각하기
	public void practice5() {
	/*
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
	 * (for문 이용)
	 */
		int num = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("정수를 하나 입력하세요 : ");
		num = scanner.nextInt();
		
		for (int i=1; i<=num; i++) {	
			sum += i;
			if(i < num) {
				System.out.printf("%d + ", i);
			}else {
				System.out.printf("%d = %d", i, sum);
			}
		
		}
		scanner.close();
	}
// min, max를 이용해서도 출력 가능하다.
	public void practice6() {
	/*
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 * 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자만을 입력해주세요"를 출력하세요.
	 * (for문 이용)
	 */
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		num1 = scanner.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2 = scanner.nextInt();
		
		if(num1 >= 1 && num2 >=1) {
			for(int i=num1; i<=num2; i++) {
				System.out.printf("%d ",i);
			}for(int i=num2; i<=num1; i++) {
				System.out.printf("%d ",i);
			}
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
		scanner.close();
	}
// min, max를 사용해봤다. do-while로 바꿔볼 수도 있다.
	public void practice7() {
	/*
	 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
	 * "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	 */
		
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			System.out.print("첫 번째 숫자 : ");
			num1 = scanner.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = scanner.nextInt();
				
			if (num1 >= 1 && num2 >= 1) {
				for(int i = Math.min(num1, num2); i<= Math.max(num1, num2); i++) {
					System.out.printf("%d ",i);
				}scanner.close();
				return;
			}else{
				 System.out.println("1 이상의 숫자를 입력해주세요");
				 }
		}
	}
	
	public void practice8() {
	 //사용자로부터 입력 받은 숫자의 단을 출력하세요. (for문 이용)
	 
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		num = scanner.nextInt();
		
		System.out.printf("==== %d단 ====\n", num);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i , num*i);
		}scanner.close();
	}

	public void practice9() {
		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		num1 = scanner.nextInt();
		if (2 <= num1 && num1 <= 9) {
			for (int j = num1; j <=9 ; j++) {
				System.out.printf("==== %d단 ====\n", j);
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n",j,i,j*i);
				}
			}
		}else{
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}scanner.close();
	}
	
	public void practice10() {
		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			num1 = scanner.nextInt();
			if (2 <= num1 && num1 <= 9) {
				for (int j = num1; j <=9 ; j++) {
					System.out.printf("==== %d단 ====\n", j);
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d\n",j,i,j*i);
					}
				}return;
			}else{
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}scanner.close();
		}
	}
	
	public void practice11() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		num1 = scanner.nextInt();
		System.out.print("공차 : ");
		num2 = scanner.nextInt();
		
		// num1 , num1+(num2)*1 , num1+(num2)*2 , num1+(num2)*3 
		
		for (int i = 0; i <= 9; i++) {
			System.out.printf("%d ", num1+(num2*i));
		}scanner.close();

	}

	public void practice12() {
		
//		int num1 = 0;
//		int num2 = 0;
//		String op = null;
//		Scanner scanner = new Scanner(System.in);
//		
//		// 조건 3개 : 0으로 나누기 안됨. 무한반복. exit치면 반복멈춤.	
//	while(true) {
//		System.out.print("연산자(+, -, *, /, %) : ");
//		op = scanner.nextLine();
//		
//		if (op.equals("exit")) {
//			System.out.println("프로그램을 종료합니다.");
//			scanner.close();
//			return;
//		}
//		System.out.print("정수1 : ");
//		num1 = scanner.nextInt();
//		System.out.print("정수2 : ");
//		num2 = scanner.nextInt();
//		
//		if(num2!=0) {
//			int result = 0;
//				switch (op) {
//				case "+":
//					result = (num1 + num2);
//					break;
//				case "-":
//					result = (num1 - num2);
//					break;
//				case "*":
//					result = (num1 * num2);
//					break;
//				case "/":
//					result = (num1 / num2);
//					break;
//				case "%":
//					result = (num1 % num2);
//					break;
//		
//				default: System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
//				continue;
//				}
//				System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
//			}else {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			}
//		}
	}
}
