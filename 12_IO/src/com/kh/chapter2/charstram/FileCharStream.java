package com.kh.chapter2.charstram;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {
	// 1. fileSave 
	public void fileSave() {
		
		// try-with-resource 문을 통해서 사용한 리소스를 자동으로 close 시킨다.
		// fw 는 try 블럭 안에서만 사용 가능
		try (FileWriter fw = new FileWriter("b_char.txt")){
			 
			fw.write("IO 재미있으신가요??....ㅋㅋ\n"); // \n 줄바꿈
			fw.write("아닌가요?ㅜㅜ\n");
			fw.write('a');
			fw.write('b');
			fw.write(10);
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
			
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// 2. fileRead
	public void fileRead() {
		try (FileReader fr = new FileReader("b_char.txt")){
			// 반복문을 통해 모두 읽어보기 
			int value = 0;
			while ((value = fr.read()) != -1 ) {
				System.out.print((char)value);
			}
			
		} catch (Exception e) {
		}
	}
	
}