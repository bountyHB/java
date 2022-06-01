package level.level1;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
 
		int a = in.nextInt();
		in.close();
        
		int cnt = 0;
		int x = a;
        
		while (true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			cnt++;
 
			if (x == a) {
				break;
			}
		}
		System.out.println(cnt);
	}
}