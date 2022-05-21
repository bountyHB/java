package mini.acbook;

import java.util.Scanner;

public class LogIn {
	
	private String logId;
	private String logPwd;
	private int count;
	
	Scanner sc = new Scanner(System.in);
	UserData userData = new UserData();
	
	public LogIn() {
	}
	
	public String getId() {
		return logId;
	}

	public void setId(String id) {
		this.logId = id;
	}

	public String getPwd() {
		return logPwd;
	}

	public void setPwd(String pwd) {
		this.logPwd = pwd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public void login() {
		while(true) {
			System.out.print("아이디 > ");
			logId = sc.nextLine();
			System.out.print("비밀번호 > ");
			logPwd = sc.nextLine();
			
			if(userData.userList.containsKey(this.logId)) {
				System.out.println("아이디가 존재하지 않습니다.");
				break;
			} else {
				if(userData.userList.get(logId).equals(logPwd)) {
				System.out.println("로그인에 성공하였습니다.");
				break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				count++;
				}
				if (count == 3) {
					System.out.println("로그인에 실패하였습니다.");
					return;
				}
			}
		}
		
	}

}
