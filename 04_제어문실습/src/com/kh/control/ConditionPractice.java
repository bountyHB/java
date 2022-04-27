package com.kh.control;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
	/*
	 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "00메뉴입니다"를,
	 * 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
	 * 
	 * ex)
	 * 1. 입력
	 * 2. 수정
	 * 3. 조회
	 * 4. 삭제 
	 * 9. 종료 
	 * 메뉴번호를 입력하세요 : 3
	 * 조회 메뉴입니다.
	 */
		
		int num1 = 0;
		String menu = null;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료\n");
		System.out.print("메뉴 번호를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		switch (num1) {
		case 1:
			menu = "입력";
		break;
		case 2:
			menu = "수정";
		break;
		case 3:
			menu = "조회";
		break;
		case 4:
			menu = "삭제";
		break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			scanner.close();
		return;
		}
		
		System.out.printf("%s 메뉴입니다" , menu);
		scanner.close();
	}
	
	public void practice2() {
	/*
	 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
	 * 짝수가 아니면 "홀수다"를 출력하세요.
	 * 양수가 아니면 "양수만 입력해주세요."를 출력하세요
	 * 
	 * ex)
	 * 숫자를 한 개 입력하세요 : -8
	 * 양수만 입력해주세요.	
	 */
		
		int num1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num1 = scanner.nextInt();
		
		if (num1%2 == 0 && num1 > 0) {
			System.out.println("짝수다");
		} else if (num1%2 != 0 && num1 > 0) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
		scanner.close();
		
	}
	
	public void practice3() {
	/*
	 * 국어, 영어, 수학 세 과목으 ㅣ점수를 키보드로 입력 받고 합계와 평균을 계산하고
	 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	 *(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
	 * 합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
	 * 불합격인 경우에는 "불합격입니다."를 출력하세요.
	 * 	
	 */
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		kor = scanner.nextInt();
		System.out.print("수학점수 : ");
		math = scanner.nextInt();
		System.out.print("영어점수 : ");
		eng = scanner.nextInt();
		
		double avg = (kor + eng + math)/3;
		int total = kor + eng + math;

		if((avg >= 60) && (kor >= 40) && (eng >= 40) && (math >= 40)) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n",kor,math,eng,total,avg );
				System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

		scanner.close();
	}

	public void practice4() {
	/*
	 * 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
	 * 
	 * ex 1.
	 * 1~12 사이의 정수 입력 : 8
	 * 8월은 여름입니다.
	 * 
	 * ex 2.
	 * 1~12 사이의 정수 입력 : 8
	 * 99월은 잘못 입력된 달입니다.
	 */
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.printf("%d월은 봄입니다." , month);
			break;
		case 6:
		case 7:
		case 8:
			System.out.printf("%d월은 여름입니다." , month);
			break;
		case 9:
		case 10:
		case 11:
			System.out.printf("%d월은 가을입니다." , month);
			break;
		case 12:
		case 1:
		case 2:
			System.out.printf("%d월은 겨울입니다." , month);
			scanner.close();
			break;
			
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
			
			scanner.close();
			return;
		}
		
	}

	public void practice5() {
	/*
	 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
	 * 로그인 성공 시 "로그인 성공",
	 * 아이디가 틀렸을 시 "아이디가 틀렸습니다.",
	 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
	 * ex).equals 이용 
	 */
		
		String inputId = null;
		String inputPwd = null;
		String userId = "qwerty";
		String userPwd = "1234";
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		inputId = scanner.nextLine();
		
		System.out.print("비밀번호 : ");
		inputPwd = scanner.nextLine();
		
		
		if (inputId.equals(userId) && inputPwd.equals(userPwd)) {
			System.out.println("로그인 성공");
		}else if(inputId.equals(userId)){
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(inputPwd.equals(userPwd)){
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
		
		scanner.close();
		
		
	}

	public void practice6() {
	/*
	 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
	 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	 * 비회원은 게시글 조회만 가능합니다.
	 * (단, 잘못 입력하였을 경우 "잘못 입력했습니다."라는 출력문이 출력되도록)
	 */
		String str = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		str = scanner.nextLine();
		
		switch (str) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			scanner.close();
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			scanner.close();
			return;
		}
		
		
		
	}

	public void practice7() {
	/*
	 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계싼 결과에 따라
	 * 저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
	 * BMI = 몸무게 / (키(m) * 키(m))
	 * BMI가 18.5  미만일 경우 저체중 / 18.5 이상 23 미만일 경우 정상체중
	 * BMIrk 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	 * BMI가 30이상일 경우 고도 비만 
	 */

		double height = 0.0;
		double weight = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		weight = scanner.nextDouble();
		
		double bmi = (weight / (height*height));
		System.out.printf("BMI 지수 : %f\n",bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
			
		}else if (bmi < 23) {
			System.out.println("정상체중");
		}else if (bmi < 25) {
			System.out.println("과체중");
		}else if (bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		scanner.close();
		
	}

	public void practice8() {
	/*
	 * 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
	 * (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
	 * "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력)
	 * 
	 *  (printf()문을 이용하여 마지막 출력문을 작성해보시오.)
	 *  
	 *  ex)
	 *  피연산자1 입력 : 15
	 *  피연산자2 입력 : 4
	 *  연산자를 입력(+,-,*,/,%) : /
	 *  15 / 4 = 3
	 */
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = '\u0000';
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		op = scanner.nextLine().charAt(0);
				
		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
				
			default:
				System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
				scanner.close();
				return;
			} 
			}else {
				System.out.println("양수가 아닙니다. 프로그램을 종료합니다.");
				scanner.close();
				return;
			}
			
			scanner.close();
			System.out.printf("%d %c %d = %d",num1, op, num2, result);
	}

	public void practice9() {
	/*
	 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
	 * 총 점 100점 중 배점으로는 다음과 같다.
	 * 중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
	 * 
	 * 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력 
	 * 
	 * 총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
	 * 아니면 Fail을 출력하세요.
	 */
		
		double mTerm = 0;
		double fTerm = 0;
		double hw = 0;
		double atten = 0;
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		mTerm = scanner.nextInt();
		System.out.print("기말 고사 점수 : ");
		fTerm = scanner.nextInt();
		System.out.print("과제 점수 : ");
		hw = scanner.nextInt();
		System.out.print("출석 회수 : ");
		atten = scanner.nextInt();
		
		// (mTerm*0.2) + (fTerm*0.3) + (hw*0.3) >= 70 && atten >= 20*0.7
		
		sum = (mTerm*0.2) + (fTerm*0.3) + (hw*0.3) + atten;
		
		
		if (sum >= 70 && atten >= (20*0.7)) {
			System.out.printf("==========결과==========\n");
			System.out.printf("중간 고사 점수 (20) : %.1f\n", (mTerm*0.2));
			System.out.printf("기말 고사 점수 (20) : %.1f\n", (fTerm*0.3));
			System.out.printf("과제 점수     (20) : %.1f\n", (hw*0.3));
			System.out.printf("출석 점수     (20) : %.1f\n", atten);
			System.out.printf("총점 : %.1f\n", sum);
			System.out.printf("PASS\n");
			
		}else {
			
			System.out.printf("==========결과==========\n");
			System.out.printf("FAIL [점수미달] (총점 %.1f)\n", sum);
		}
	
		scanner.close();
		
		
		
	}

	public void practice10() {
	/*
	 * 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
	 * 
	 * ex)
	 * 실행할 기능을 선택하세요.
	 * 1. 메뉴 출력
	 * 2. 짝수/홀수
	 * 3. 합격/불합격
	 * 4. 계절
	 * 5. 로그인
	 * 6. 권한 확인
	 * 7. BMI
	 * 8. 계산기
	 * 9. Pass/Fail
	 * 선택 : 4 (실습문제 4에 해당하는 메소드 호출)
	 */
		
		
		
		
		
	}


}
