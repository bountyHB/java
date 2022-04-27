package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_ByteToCharStraem {
	// 1. input
	public void input() {
		String value = null;
		// 보조스트림을 여러개 연결해서 사용 가능 
		// system.in => 키보드로 연결되어있는 input 시스템
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		
		// 위 두줄을 한 줄로
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.print("문자열 입력 > ");
			
//			System.in.read() => 이건 한줄밖에 못 얻어 옴.
			value = br.readLine();
			
			System.out.print("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	// 2. output
	public void output() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

			bw.write("아직도 IO가 어려우신가요?ㅜ");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, HTML ,CSS, ... 남았습니다.");
			bw.newLine();
			bw.write("힘내세요!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}	
	
}
