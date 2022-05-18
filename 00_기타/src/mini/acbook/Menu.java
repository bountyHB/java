package mini.acbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements JustMenu {
	int menu; 
	int num2;
	int sum1;
	int sum2;
	int left;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> income = new ArrayList();
	ArrayList<Integer> expense = new ArrayList();
	ArrayList<String> incomeMemo = new ArrayList();
	ArrayList<String> expenseMemo = new ArrayList();
	

	@Override
	public void user() {
		System.out.println("유저 ");
	}

	@Override
	public void enterMoney() {
		
		while (true) {
			System.out.println("=============================");
			System.out.println("1. 금액입력");
			System.out.println("2. 이전화면");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("원하시는 메뉴의 번호를 입력하세요. >");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("금액입력을 선택하였습니다.");
				System.out.print("금액 > ");
				this.num2 = scanner.nextInt();
				// 받은 숫자를 임시저장
				choose();
				break;
			case 2:
				System.out.println("enterMoney 이전화면으로 돌아갑니다.");
				return; 
			case 0:
				System.out.println("가계부를 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			return;
		}
	}

	@Override
	public void choose() {
		while (true) {
			System.out.println("===========메뉴 선택===========");
			System.out.println("1. 수입");
			System.out.println("2. 지출");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("입력을 원하시는 메뉴의 번호를 입력하세요. >");
			System.out.println();
			menu = scanner.nextInt();
			
			if (menu == 1) {
				chooseIncome();
				return;
			}else if (menu == 2) {
				chooseExpense();
				return;
			}else if (menu == 0){
				System.out.println("가계부를 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	@Override
	public void chooseIncome() {
		while (true) {
			System.out.println("===========수입 선택===========");
			System.out.println("1. 급여");
			System.out.println("2. 용돈");
			System.out.println("3. 기타");
			System.out.println("9. 이전메뉴");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("수입의 종류를 번호로 입력하세요. >");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("급여가 수입에 저장되었습니다.");
				// 임시로 저장한 값을, 수입머니배열에 넣는다.
				income.add(menu-1, num2);

				// 급여라는 문자값을, 수입문자배열에 넣는다.
				incomeMemo.add(menu-1, "급여");
				cheking();
				break;
			case 2:
				System.out.println("용돈이 수입에 저장되었습니다.");
				income.add(menu-2, num2);
				incomeMemo.add(menu-2, "용돈");
				cheking();
				break;
			case 3:
				System.out.println("기타가 수입에 저장되었습니다.");
				income.add(menu-3, num2);
				incomeMemo.add(menu-3, "기타");
				cheking();
				break;
			case 9:
				System.out.println("chooseIncome 이전메뉴로 이동합니다.");
				choose();
				break;
			case 0:
				System.out.println("가계부를 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			return;
		}
		
		
		
	}

	@Override
	public void chooseExpense() {
		while (true) {
			System.out.println("===========지출 선택===========");
			System.out.println("1. 식비");
			System.out.println("2. 교통비");
			System.out.println("3. 문화생활");
			System.out.println("4. 의료비");
			System.out.println("5. 경조사");
			System.out.println("6. 공과금");
			System.out.println("7. 기타");
			System.out.println("9. 이전메뉴");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("지출의 종류를 번호로 입력하세요. >");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("식비가 지출에 저장되었습니다.");
				expense.add(menu-1, num2);
				expenseMemo.add(menu-1, "식비");
				cheking();
				break;
			case 2:
				System.out.println("교통비가 지출에 저장되었습니다.");
				expense.add(menu-2, num2);
				expenseMemo.add(menu-2, "교통비");
				cheking();
				break;
			case 3:
				System.out.println("문화생활이 지출에 저장되었습니다.");
				expense.add(menu-3, num2);
				expenseMemo.add(menu-3, "문화생활");
				cheking();
				break;
			case 4:
				System.out.println("의료비가 지출에 저장되었습니다.");
				expense.add(menu-4, num2);
				expenseMemo.add(menu-4, "의료비");
				cheking();
				break;
			case 5:
				System.out.println("경조사가 지출에 저장되었습니다.");
				expense.add(menu-5, num2);
				expenseMemo.add(menu-5, "경조사");
				cheking();
				break;
			case 6:
				System.out.println("공과금이 지출에 저장되었습니다.");
				expense.add(menu-6, num2);
				expenseMemo.add(menu-6, "공과금");
				cheking();
				break;
			case 7:
				System.out.println("기타가 지출에 저장되었습니다.");
				expense.add(menu-7, num2);
				expenseMemo.add(menu-7, "기타");
				cheking();
				break;
			case 9:
				System.out.println("chooseExpense 이전메뉴로 이동합니다.");
				choose();
				break;
			case 0:
				System.out.println("가계부를 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			return;
		}
	}

	@Override
	public void cheking() {
		while (true) {
			System.out.println("===========메뉴 선택===========");
			System.out.println("1. 가계부 확인");
			System.out.println("2. 추가입력");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("원하시는 메뉴의 번호를 입력하세요. >");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("가계부를 확인합니다.");
				showBalance();
				return;
			case 2:
				System.out.println("추가 입력을 선택하였습니다.");
				enterMoney(); 
				break;
			case 0:
				System.out.println("가계부를 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			return;
		}
	}

	@Override
	public void showBalance() {
		System.out.println("===========수입 내역===========");
		for (int i = 0; i < income.size(); i++) {
			System.out.println(incomeMemo.get(i)+ " : " + income.get(i) + "원");
		}
		for (int i = 0; i < income.size(); i++) {
			sum1 += income.get(i);
		}
		System.out.println("총 : " + sum1 + "원");
		
		System.out.println("===========지출 내역===========");
		for (int i = 0; i < expense.size(); i++) {
			System.out.println(expenseMemo.get(i)+ " : " + expense.get(i) + "원");
		}
		for (int i = 0; i < expense.size(); i++) {
			sum2 += expense.get(i);
		}
		System.out.println("총 : " + sum2 + "원");

		System.out.println("============$잔 고$===========");
		left = sum1 - sum2;
		
		if (left >= 0) {
			System.out.println("지금 잔고에 남아있는 돈은 " + (left) + "원 입니다.");
		} else {
			System.out.println("지금 잔고에 남아있는 돈은 0원,");
			System.out.println((left) + "의 갚아야할 빚이 있습니다.");
		}
		cheking();
	}

}
