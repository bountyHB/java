package mini.acbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
	Scanner scanner = new Scanner(System.in);
	
	private String id;
	private String pwd;
	private String findId;
	private String findPwd;
	private String tmpId;
	private String tmpPwd1;
	private String tmpPwd2;
	

	public Register() {
	}

	public Register(String id, String password) {
		this.id = id;
		this.pwd = password;
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
	
	public void idFile() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hb/Documents/GitHub/java/00_기타/src/mini/acbook/infos/" + getId(),true))){
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void idPrint() {
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/hb/Documents/GitHub/java/00_기타/src/mini/acbook/infos/" + getId()))){
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void signInId () {
		// 아이디
		while (true) {
			System.out.print("설정할 아이디를 입력해주세요. > ");
			tmpId = scanner.nextLine();
			if (tmpId.length() < 4 ) {
				System.out.println("아이디는 최소 4글자 이상 입력하여야 합니다.");
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
