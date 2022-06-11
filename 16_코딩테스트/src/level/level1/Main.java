package level.level1;

import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
 
	       Scanner scanner = new Scanner(System.in);

	       int num = scanner.nextInt();
	       int[] intArr= new int[num];
	       scanner.nextLine();
	        
	       String str = scanner.nextLine();
	        // 띄어쓰기로 구분해서 나눔.
	       String strArr[] = str.split(" ");

	       for (int i = 0; i < num; i++) {
	        // 나눈것을 형 변환해서 int배열에 넣음
	        	intArr[i] = Integer.parseInt(strArr[i]);
			}
	        // 배열에서 min max로 최소값과 최대값 출력함.

	       Arrays.sort(intArr);
	       System.out.println(intArr[0]);
	       System.out.println(intArr[num-1]);
	    }
}