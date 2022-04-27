package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	/*
	 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
	 * 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
	 * 
	 * ex) 
	 * 1 2 3 4 5 6 7 8 9 10
	 */
	public void method1 () {
		
		int[] arry = new int[10];
		
		for (int i = 0; i < arry.length; i++) {
			arry[i] = i+1 ;
			System.out.print(arry[i]+ " ");
		}
	
		
	}
	
	/*
	 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여

	 * 역순으로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
	 * 
	 * ex)
	 * 10 9 8 7 6 5 4 3 2 1 
	 */
	public void method2 () {

		
		int[] arry = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = arry.length-i;
			System.out.print(arry[i] + " ");
		}
		
		
		
	}
	
	/*
	 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
	 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	 * 
	 * ex)
	 * 양의 정수 : 5
	 * 1 2 3 4 5
	 */
	public void method3 () {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		i = scanner.nextInt();
		int[] num = new int[i]; 
		
		for (int j = 0; j < num.length; j++) {
			num[j] =j+1;
			System.out.print(num[j]+ " ");
		}
		
		scanner.close();
	}
	
	/*
	 * 길이가 5인 String 배열을 선언하고 "사과", "귤","포도", "복숭아, "참외"로 초기화 한 후 
	 * 배열 인덱스를 활용해서 귤을 출력하세요.
	 * 
	 * ex)
	 * 귤 
	 */
	public void method4 () {
		
		String[] str = new String[5];
		str = new String[] {"사과","귤","포도","복숭아","참외"};
		
		System.out.println(str[1]);
		
		
		
	}
	
	/*
	 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	 * 
	 * ex)
	 * 문자열 : application
	 * 문자 : i
	 * application 에 i가 존재하는 위치(인덱스) : 4 8
	 * i의 개수 : 2
	 */
	public void method5 () {
		
		char ch = '\u0000';
		char[] chr = null;
		String str = null;
		String index = "";
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = scanner.nextLine();

		System.out.print("문자 : ");
		ch = scanner.nextLine().charAt(0);		
		
		//입력한 문자 길이 만큼의 배열 생성 
		chr = new char[str.length()];
		
		// count로 증감횟수 측정. index 복합대입연산자로 출력
		for (int i = 0; i < chr.length; i++) {
			chr[i] = str.charAt(i); // charAt 문자열 번호로 출력 
			if (chr[i] == ch ) {
				index += i + " ";
				count++;
			}
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n",str, ch, index);
		System.out.printf("%c 개수 : %d", ch, count);
		
		
		
		scanner.close();
	}
	
	/*
	 * "월" ~ "일" (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	 * 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."를 출력하세요.
	 * 
	 * ex) 
	 * 0 ~ 6 사이 숫자 입력 : 4
	 * 금요일 
	 * 
	 * 0 ~ 6 사이 숫자 입력 : 7
	 * 잘못 입력하셨습니다.
	 */
	
	public void method6 () {
		
		String[] date = {"월","화","수","목","금","토","일"};
		
		int num = 0;
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if (0 <= num && num <=6 ) {
			System.out.println(date[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}
	
	/*
	 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 입덱스에 값을 초기화 하세요.
	 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장 된 값들의 합을 출력하세요.
	 * 
	 * ex)
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4 
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * 4 -4 3 -3 2
	 * 총 합 : 2
	 */
	
	public void method7 () {
		
		int input = 0;
		int[] arry;
		int index = 0;
		int sum = 0; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		input = scanner.nextInt();
		arry = new int[input];
		
		for (int i = 0; i < arry.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			index = scanner.nextInt();
			arry[i] = index; 
		}
		for (int j = 0; j < arry.length; j++) {
			System.out.printf("%d " , arry[j]);
			sum += arry[j];
		}	
		System.out.println();
		System.out.printf("총합 : %d",sum);
			
			scanner.close();
		

	}
	
	/*
	 * 3 이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	 * 단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요."를 출력하고
	 * 다시 정수를 받도록 하세요.
	 *
	 * 1. 배열의 중간까지는 오름차순으로 값을 넣는다.
	 * 2. 배열의 중간 이부후터는 내림차순으로 값을 넣는다.
	 * 3. 배열을 출력한다.
	 * 
	 * 4. 다시 입력하세요를 출력하고 다시 정수를 받는다.
	 *
	 * ex)
	 * 정수 : 4
	 * 다시 입력하세요.
	 * 정수 : -6 
	 * 다시 입력하세요.
	 * 정수 : 5
	 * 1, 2, 3, 2, 1
	 */
	// method8 다시 풀기. ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	public void method8 () {
		
		int num = 0;
		int[] arry;
		
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			System.out.print("정수 : ");
			num = scanner.nextInt();
			arry = new int[num];
		
			if (num % 2 == 1 && num > 3) {
				for (int i = 0; i < arry.length; i++) {
					if(i >= (arry.length/2)) {
						arry[i] = num--; 
					}
					if(i < (arry.length/2)) {
						arry[i] = num++; 
					}
					System.out.print(arry[i] + " ");
				}break;
				
			}else {
				scanner.close();
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	/*
	 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요. 
	 */
	public void method9 () {

		int[] arry = new int[10];
//		int random = (int)(Math.random()*10+1);
		
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int)(Math.random()*10+1);
			System.out.println(Arrays.toString(arry));
		}
		
		
	}
	
	/*
	 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후 
	 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	 * 
	 * ex)
	 * 5 3 2 7 4 8 6 10 9 10
	 * 최대값 : 10
	 * 최소값 : 2
	 */
	public void method10 () {
		
		int[] arry = new int[10];
		
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int)(Math.random()*10+1);
			System.out.print(arry[i] + " ");
		}
		
		int max = arry[0];
		int min = arry[0];
		
		for (int j = 1; j < arry.length; j++) {
			if (arry[j]> max ) {
				max = arry[j];
			}else if (arry[j]< min ) {
				min = arry[j];
			}
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
//		for (int i = 0; i < arry.length; i++) {
//			arry[i] = (int)(Math.random()*10+1);
//			System.out.printf("%d ",arry[i]);
//		}
//		Arrays.sort(arry);
//		System.out.println();
//		System.out.println("최대값 : " + arry[9]);
//		System.out.println("최소값 : " + arry[0]);
	/*
	 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
	 * 1 ~ 10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	 * 
	 * ex)
	 * 4 1 3 6 9 5 8 10 7 2
	 */
	public void method11 () {
		
		int[] arry = new int[10];
		
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int)(Math.random()*10+1);
		
			for (int j = 0; j < i; j++) {
				if (arry[i] == arry[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
			
		}
		
	}
	
	/*
	 * 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
	 * 
	 * ex)
	 * 3 4 15 17 28 40
	 */
	public void method12 () {
		
	}
	
	/*
	 * 주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
	 * char[]에 옮겨 담기 (단, 성별 자리 이후로부터는*로 담기)
	 * 
	 * ex)
	 * 주민등록번호(-포함) : 123456-1234567
	 * 123456-1******
	 */
	public void method13 () {
		
	}

}
