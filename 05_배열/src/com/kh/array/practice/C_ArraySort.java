package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {
// 오름차순 정렬 Arrays.sort(); // 메소드 바로 프린트 Arrays.toString(arr)
	public void method1() {
		int arr[] = {2, 7, 5, 1, 3};
		
//		// 메소드 바로 프린트 
//		System.out.println(arr.hashCode());
//		System.out.println(Arrays.toString(arr));
		
		// 오름차순으로 정렬 
		Arrays.sort(arr);
		
//		System.out.println(arr.hashCode());
//		System.out.println(Arrays.toString(arr));
				
		// 내림차순으로 정렬 
		// 1. for 문을 사용해서 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다.
		int[] copy = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			copy[4 - i] = arr[i];
		} 
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
//		System.out.print(copy[i]);
//      arr[5] = (1, 2, 3, 5, 7};		
//		i = 0 => copy[4] = arr[0] = 1
//		i = 1 => copy[3] = arr[1] = 2
//		i = 1 => copy[2] = arr[2] = 3
//		i = 1 => copy[1] = arr[3] = 5
//		i = 1 => copy[0] = arr[4] = 7
//		copy[] = {7, 5, 3, 2, 1};
		
//		System.out.println(Arrays.toString(copy));
		
		
		// 2. 아래와 같이 작성하는 방법이 있다. (추후에 다시 설명)
//		Integer[] iArray = {2, 7, 5, 1, 3};
//		
//		Arrays.sort(iArray, Collections.reverseOrder());
//		
//		System.out.println();
//		System.out.println(Arrays.toString(copy));
		
	}
// 문자열 오름차순 정렬 
	public void method2() {
		String[] array = {"orange" , "banana", "apple", "메론", "레몬"};
		
		
		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// 내림차순 정렬
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
				
	}

	/*
	 * 조별 과제 
	 * 조원별로 알고리즘을 하나 선택해서 내용을 정렬해주면 됨
	 * 
	 *  1. 개별로 정렬 알고리즘을 하나씩 선택해서 정리해 주세요.
	 *   - 삽입 정렬, 버블 정렬, 선택 정렬, 퀵 정렬, ...
	 *   
	 *  2. 시간 복잡도와 공간 복잡도를 정리해 주세요.
	 *   - 개별로 공부해서 자율로 
	 *   
	 *  3. 반드시 정리된 내용은 조원들끼리 공유 및 코드 리뷰 진행해 주세요 
	 *  
	 *  4. 4/17(일)까지 프로젝트 하나 만들어서 패키지안에 클래스 1개씩 만들고
	 *     application에 복잡도는 주석으로 정리해주기.(주석은 ppt나 워드도 ㄱㅊ)
	 * 
	 */

	
	
	
}


