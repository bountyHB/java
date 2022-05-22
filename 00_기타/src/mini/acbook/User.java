package mini.acbook;

import java.util.Scanner;

public class User{
	Scanner scanner = new Scanner(System.in);
	
	private String id;
	private String pwd;
	private String findId;
	private String findPwd;
	
	public User() {
	}

	public User(String userId, String userPwd) {
		super();
		this.id = userId;
		this.pwd = userPwd;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public void logIn() {
		System.out.print("아이디 > ");
		this.id = scanner.nextLine();
		System.out.print("비밀번호 > ");
		this.pwd = scanner.nextLine();
	}
	
	public void findID() {
		System.out.println("가입당시 비밀번호를 입력해주세요. >");
		this.findPwd = scanner.nextLine();
		if (this.findPwd.equals(this.pwd)) {
			System.out.println("아이디는 " + id +"입니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	
	public void findPwd() {
		System.out.println("가입당시 아이디를 입력해주세요. >");
		this.findId = scanner.nextLine();
		if (this.findId.equals(this.id)) {
			System.out.println("비밀번호는 " + pwd +"입니다.");
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
	}
}
