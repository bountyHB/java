package mini.acbook;

import java.util.Scanner;

public class User{
	Scanner scanner = new Scanner(System.in);
	
	private String userId;
	private String userPwd;
	
	
	public User() {
	}

	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public String getId() {
		return userId;
	}

	public void setId(String id) {
		this.userId = id;
	}

	public String getPwd() {
		return userPwd;
	}

	public void setPwd(String pwd) {
		this.userPwd = pwd;
	}

	
	public void logIn() {
		System.out.print("아이디 > ");
		this.userId = scanner.nextLine();
		System.out.print("비밀번호 > ");
		this.userPwd = scanner.nextLine();
	}
}
