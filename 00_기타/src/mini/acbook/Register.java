package mini.acbook;

import java.util.Scanner;

public class Register {
	Scanner scanner = new Scanner(System.in);
	
	private String id;
	private String pwd;
	private String tmpId;
	private String tmpPwd1;
	private String tmpPwd2;
	

	public Register() {
	}

	public Register(String id, String password) {
		super();
		this.id = id;
		this.pwd = password;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setId () {
		// 아이디
		while (true) {
			System.out.print("설정할 아이디를 입력해주세요. > ");
			tmpId = scanner.nextLine();
			if (tmpId.length() < 4 ) {
				System.out.println("아이디는 최소 4글자 이상 입력하여야 합니다.");
			}else {
				this.id = tmpId;
				break;
			}
		}
	}
	
	public void setPwd() {
		while(true) {
			System.out.print("비밀번호를 입력해주세요. > ");
			tmpPwd1 = scanner.nextLine();

			System.out.print("비밀번호를 다시 입력해주세요. > ");
			tmpPwd2 = scanner.nextLine();
			
			if (tmpPwd1.equals(tmpPwd2)) {
				this.pwd = tmpPwd1;
				System.out.println("회원가입이 완료 되었습니다.");
				
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}
	
}
