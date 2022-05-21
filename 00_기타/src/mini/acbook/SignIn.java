package mini.acbook;

import java.util.Scanner;

public class SignIn {
	
	UserData userData = new UserData();
	
	private String id;
	private String pwd;
	private String tmpId;
	private String tmpPwd1;
	private String tmpPwd2;
	Scanner sc = new Scanner(System.in);
	
	public SignIn() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTmpId() {
		return tmpId;
	}

	public void setTmpId(String tmpId) {
		this.tmpId = tmpId;
	}

	public String getTmpPwd1() {
		return tmpPwd1;
	}

	public void setTmpPwd1(String tmpPwd1) {
		this.tmpPwd1 = tmpPwd1;
	}

	public String getTmpPwd2() {
		return tmpPwd2;
	}

	public void setTmpPwd2(String tmpPwd2) {
		this.tmpPwd2 = tmpPwd2;
	}



	public void signInId() {
		while (true) {
			System.out.print("설정할 아이디를 입력해주세요. > ");
			tmpId = sc.nextLine();
			if (tmpId.length() < 4 ) {
				System.out.println("아이디는 최소 4글자 이상 입력하여야 합니다.");
			}else if (userData.userList.containsKey(id)) {
				System.out.println("이미 사용 중인 아이디 입니다.");
				continue;
			}else {
				System.out.println("아이디가 생성 되었습니다.");
				this.id = tmpId;
				break;
			}
		}	
	}
	
	public void signInPwd() {
		while(true) {
			System.out.print("비밀번호를 입력해주세요. > ");
			tmpPwd1 = sc.nextLine();

			System.out.print("비밀번호를 다시 한번 입력해주세요. > ");
			tmpPwd2 = sc.nextLine();
			
			if (tmpPwd1.equals(tmpPwd2)) {
				this.pwd = tmpPwd1;
				userData.userList.put(this.id,this.pwd);
				System.out.println("회원가입이 완료 되었습니다.");
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		
	}
	
	public void signIn() {
		while (true) {
			System.out.print("설정할 아이디를 입력해주세요. > ");
			tmpId = sc.nextLine();
			if (tmpId.length() < 4 ) {
				System.out.println("아이디는 최소 4글자 이상 입력하여야 합니다.");
			}else if (userData.userList.containsKey(id)) {
				System.out.println("이미 사용 중인 아이디 입니다.");
				continue;
			}else {
				System.out.println("아이디가 생성 되었습니다.");
				this.id = tmpId;
				break;
			}
		}
		
		while(true) {
			System.out.print("비밀번호를 입력해주세요. > ");
			tmpPwd1 = sc.nextLine();

			System.out.print("비밀번호를 다시 한번 입력해주세요. > ");
			tmpPwd2 = sc.nextLine();
			
			if (tmpPwd1.equals(tmpPwd2)) {
				this.pwd = tmpPwd1;
				userData.userList.put(this.id,this.pwd);
				System.out.println("회원가입이 완료 되었습니다.");
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		
		
		
	}
	
	
	

}
