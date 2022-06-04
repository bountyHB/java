package level.level1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// BufferedWriter를 사용하기 위해서는 throws IOException을 해 주어야 함.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		bw.write("Hello World");
		bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
		bw.close(); 
	
	}
}
