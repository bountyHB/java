package level.level1;

import java.util.Scanner;

		public class Main {

		    public static void main(String[] args){
		        Scanner scanner = new Scanner(System.in);
		        int[] arr = new int[4];
		        int counta = 0;
		        int countb = 0;
		        // 9개의 장수가 주어질 때 최대값을 찾고 그 최대값이 몇번째 수였는지를 구하는 프로그램을 작성
		        // 4개로 실험하기
		        // 기존에는 크기로 정렬한 후에 거기서 최대값과 최소값을 빼왔었는데 이번에는 정렬을 하지 않은 채 최대값을 빼야함

		        for (int i = 0; i < 4; i++) {
		            System.out.println(i+1 + "번째 숫자를 입력하세용>");
		            arr[i] = scanner.nextInt();
		        }

		        for (int i = 0; i < 4; i++) {
		            if(arr[i]>arr[i+1]){
		                counta++;
		            }else if (arr[i]<arr[i+1]){
		                countb++;
		            }
		        }
		        System.out.println(counta);
		        System.out.println(countb);

//		        if(counta > countb){
//		            System.out.println(arr[counta-countb]);
//		        }else{
//		            System.out.println(arr[countb-counta]);
//		        }

		    
		}
}