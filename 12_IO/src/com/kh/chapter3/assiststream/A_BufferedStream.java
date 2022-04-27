package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_BufferedStream {
	// 1.fileSave
	public void fileSave() {
		// 1.기반스트림생성
//		FileWriter fw = null; 
		// 2.보조스트림생성
//		BufferedWriter bw = null;
		
		// 5. 보조스트림과 기반스트림을 한줄로 합쳐서 작성
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			// 3.보조스트림에 기반스트림을 넘겨주기
//			fw = new FileWriter("C_buffer.txt");
			// 4.보조스트림에 기반스트림을 참조변수없이 한줄로 넣어버림. 
//			bw = new BufferedWriter(new FileWriter("C_buffer.txt"));
			
			bw.write("안녕하세요.\n");
			bw.write("아직도 IO가 어려우신가요?ㅜㅜ");
			bw.newLine(); // 라인 변경해주는 메소드
			bw.write("줄 바꿈이 적용 되었나요?");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.fileRead
	public void fileRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// readLine 메소드는 한줄씩 읽어오다가 더이상 데이터가 없으면 null을 읽는다.
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); 
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (Exception e) {
		}
		
		
	}
	
}
