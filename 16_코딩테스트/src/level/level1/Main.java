package level.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {		
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
			sb.append(result+"\n");
		}
		br.close();
    }
}