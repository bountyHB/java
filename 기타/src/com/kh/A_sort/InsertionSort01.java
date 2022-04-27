package com.kh.A_sort;

import java.util.Arrays;

public class InsertionSort01 {

	public static void main(String[] args) {
		
		int[] arry = {32, 13, 9, 54, 23};		// 1. 임의의 배열을 만든다.
		
		for (int i = 1; i < arry.length; i++) { // 2. 배열의 2번째 값부터 하나씩 증가하며 
			for (int j = 0; j < i; j++) {       // 3. 그 왼쪽에 있는 값들을 비교한다.
				if (arry[j] > arry[i] ) {       // 4. 만약 왼쪽의 값이 더 크다면 아래를 실행한다.
		
					int tmp = arry[j];          // 5. 임시의 공간에 큰값을 넣어 자리를 빈 상태로 만들고 
					arry[j] = arry[i];          // 6. 비어있는 배열에 더 작은 값을 넣는다.
					arry[i] = tmp;              // 7. 임시의 공간에 넣어둔 큰 값을 오른쪽으로 정렬한다.
				}         
			}	
			System.out.println(Arrays.toString(arry));
		}
			for (int i = 0; i < arry.length; i++) {
				System.out.print(arry[i] + " ");
		}


	}

}
