package mini.acbook;

import java.util.Scanner;

public class User{
	Scanner scanner = new Scanner(System.in);
	
	private String id;
	private String pwd;
	
	public User() {
	}

	public User(String userId, String userPwd) {
		this.id = userId;
		this.pwd = userPwd;
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

}
