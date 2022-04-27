package com.kh.first.practice;

public class ValuePrinter {
	public void print() {
		// 1. 숫자 출력
		System.out.println(123); // 정수값 출력
		System.out.println(3.14);// 실수값 출력 
		
		
		// 2. 연산 결과 출력  
		System.out.println(125 + 40);
		System.out.println(1.23 - 0.12); // 실수값 연산은 불완전하다. 오차값 발생.
		System.out.printf("%.2f\n",(1.23 - 0.12)); 
		System.out.println(Math.ceil(1.23 - 0.12)); // 계산 후 올림 
		System.out.println(Math.floor(1.23 - 0.12)); // 계산 후 내림 
		
		// 3. 문자 출력 
		System.out.println('a');
		System.out.println('b');
		// 문자와 숫자를 연산하면 문자의 코드값과 숫자의 연산 결과를 출력한다. 
		// 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있다 (b: 98)
		System.out.println('b'+1);
		System.out.println('b'+'1');
		System.out.println((int)'1');
		System.out.println('b'+"1");
		System.out.println((char)('b'+1));
		
		//4. 문자열 출력
		
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		
		// 5. 문자열과 그 외의 값 들의 덧셈연산 
		System.out.println("안녕하세요."+"반갑습니다.");
		System.out.println("반갑습니다."+"123");
		System.out.println((40+125)+"반갑습니다.");
		
		
		// 6. printf() 메소드
		int num1 = 10;
		int num2 = 20;
		float fnum = 3.141592f;
		double dnum = 4.1592;
		
		
		
		// %d 서식 지정자 => 정수형
		System.out.printf("%d\n" , num1); // %d는 정수형, \n은 줄바꿈
		System.out.printf("%-5d" , num1); // %-5d는 5칸 확보하고 왼쪽 정렬
		System.out.printf("%d\n" , num1, num2); // num1만 출력됨
//		System.out.printf("%d%d\n" , num1); // error.
		
		// %f 서식 지정자 => 실수형
		System.out.printf("%f\t%f\n" , fnum , dnum); // \t tab만큼 띄어짐
		System.out.printf("%.3f\t%.3f\n" , fnum , dnum); // f앞에 .3=> 3자리수까지만 출력됨
		System.out.printf("\"%.3f\"\t\"%.3f\"\n" , fnum , dnum); // \" 따옴표 출력
		
		
		
	}
}