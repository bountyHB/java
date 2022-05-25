package mini.acbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	int menu; 
	int num1;
	int sum1;
	int sum2;
	int left;
	ArrayList<Integer> income = new ArrayList<Integer>();
	ArrayList<Integer> expense = new ArrayList<Integer>();
	ArrayList<String> incomeMemo = new ArrayList<String>();
	ArrayList<String> expenseMemo = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);
	Register register = new Register();
	User user = new User();
	public Menu() {
		super();
	}
	
	public void select() {
		while (true) {
			System.out.println("==============메뉴 선택==============");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 아이디 / 비밀번호 찾기");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("원하시는 메뉴의 번호를 입력하세요. > ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println();
				user.logIn();
				if (user.getId().equals(register.getId())) {
					System.out.println();
					System.out.println("환영합니다! " + user.getId() + "님!!");
					enterMoney();
					break;
				} else {
					System.out.println();
					System.out.println("아이디가 존재하지 않습니다.");
					select();
				}
			case 2:
				register.setId();
				register.setPwd();
				select();
				break;
			case 3:
				user.findID();
				user.findPwd();
				select();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			return;
		}
	}

	public void enterMoney() {
		while (true) {
			System.out.println("==============메뉴 선택==============");
			System.out.println("1. 금액입력");
			System.out.println("2. 이전화면");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("원하시는 메뉴의 번호를 입력하세요. > ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("입력하려는 금액 > ");
				this.num1 = scanner.nextInt();
				choose();
				break;
			case 2:
				System.out.println("이전화면으로 돌아갑니다.");
				select();
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

	public void choose() {
		while (true) {
			System.out.println("==============메뉴 선택==============");
			System.out.println("1. 수입");
			System.out.println("2. 지출");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("입력을 원하시는 메뉴의 번호를 입력하세요. > ");
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
	
	public void chooseIncome() {
		while (true) {
			System.out.println("==============수입 선택==============");
			System.out.println("1. 급여");
			System.out.println("2. 용돈");
			System.out.println("3. 기타");
			System.out.println("9. 이전메뉴");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("수입의 종류를 번호로 입력하세요. > ");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("급여가 수입에 저장되었습니다.");
				// 임시로 저장한 값을, 수입머니배열에 넣는다.
				income.add(menu-1, num1);

				// 급여라는 문자값을, 수입문자배열에 넣는다.
				incomeMemo.add(menu-1, "급여");
				cheking();
				break;
			case 2:
				System.out.println("용돈이 수입에 저장되었습니다.");
				income.add(menu-2, num1);
				incomeMemo.add(menu-2, "용돈");
				cheking();
				break;
			case 3:
				System.out.println("기타가 수입에 저장되었습니다.");
				income.add(menu-3, num1);
				incomeMemo.add(menu-3, "기타");
				cheking();
				break;
			case 9:
				System.out.println("이전메뉴로 이동합니다.");
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

	public void chooseExpense() {
		while (true) {
			System.out.println("==============지출 선택==============");
			System.out.println("1. 식비");
			System.out.println("2. 교통비");
			System.out.println("3. 문화생활");
			System.out.println("4. 의료비");
			System.out.println("5. 경조사");
			System.out.println("6. 공과금");
			System.out.println("7. 기타");
			System.out.println("9. 이전메뉴");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("지출의 종류를 번호로 입력하세요. > ");
			System.out.println();
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("식비가 지출에 저장되었습니다.");
				expense.add(menu-1, num1);
				expenseMemo.add(menu-1, "식비");
				cheking();
				break;
			case 2:
				System.out.println("교통비가 지출에 저장되었습니다.");
				expense.add(menu-2, num1);
				expenseMemo.add(menu-2, "교통비");
				cheking();
				break;
			case 3:
				System.out.println("문화생활이 지출에 저장되었습니다.");
				expense.add(menu-3, num1);
				expenseMemo.add(menu-3, "문화생활");
				cheking();
				break;
			case 4:
				System.out.println("의료비가 지출에 저장되었습니다.");
				expense.add(menu-4, num1);
				expenseMemo.add(menu-4, "의료비");
				cheking();
				break;
			case 5:
				System.out.println("경조사가 지출에 저장되었습니다.");
				expense.add(menu-5, num1);
				expenseMemo.add(menu-5, "경조사");
				cheking();
				break;
			case 6:
				System.out.println("공과금이 지출에 저장되었습니다.");
				expense.add(menu-6, num1);
				expenseMemo.add(menu-6, "공과금");
				cheking();
				break;
			case 7:
				System.out.println("기타가 지출에 저장되었습니다.");
				expense.add(menu-7, num1);
				expenseMemo.add(menu-7, "기타");
				cheking();
				break;
			case 9:
				System.out.println("이전메뉴로 이동합니다.");
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

	public void cheking() {
		while (true) {
			System.out.println("==============메뉴 선택==============");
			System.out.println("1. 가계부 확인");
			System.out.println("2. 추가입력");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("원하시는 메뉴의 번호를 입력하세요. > ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				showBalance();
				return;
			case 2:
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

	public void showBalance() {
		inc();
		exp();
		bal();
		cheking();
	}
	
	public void inc () {
		System.out.println("..............수입 내역..............");
		for (int i = 0; i < income.size(); i++) {
			System.out.println(incomeMemo.get(i)+ " : " + income.get(i) + "원");
		}
		for (int i = 0; i < income.size(); i++) {
			sum1 += income.get(i);
		}
		System.out.println();
		System.out.println("총 : " + sum1 + "원");
	}
	
	public void exp() {
		System.out.println("..............지출 내역..............");
		for (int i = 0; i < expense.size(); i++) {
			System.out.println(expenseMemo.get(i)+ " : " + expense.get(i) + "원");
		}
		for (int i = 0; i < expense.size(); i++) {
			sum2 += expense.get(i);
		}
		System.out.println();
		System.out.println("총 : " + sum2 + "원");
	}
	
	public void bal() {
		left = sum1 - sum2;
		
		System.out.println("...............잔 고................");
		System.out.println("==============메뉴 선택==============");
		if (left >= 0) {
			System.out.println();
			System.out.println(user.getId() + "님의 잔고에는 총 " + (left) + "원이 남아 있습니다.");
			System.out.println();
		} else {
			System.out.println(user.getId() + "님의 잔고에 남아있는 돈은 0원,");
			System.out.println((left) + "의 갚아야할 빚이 있습니다.");
			System.out.println();
		}
	}

	public void fileMake() {
	try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hb/Documents/GitHub/java/00_기타/src/mini/acbook/infos/" + user.getId(),true))){
	
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	public void filePrint() {
	try (BufferedReader br = new BufferedReader(new FileReader("/Users/hb/Documents/GitHub/java/00_기타/src/mini/acbook/infos/" + user.getId()))){
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
		} 
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}