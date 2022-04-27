package com.kh.array.practice;

import java.util.Arrays;

/*
 * 배열의 복사
 * 
 * 1. 얕은 복사
 *  - 배열의 주소만 복사하는 복사를 얕은 복사라 한다.
 * 
 * 2. 깊은 복사
 *  - 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사한다.
 */

public class B_ArrayCopy {
	// 얕은 복사
	public void method1 () {
//		int origin = 20;
//		int copy = origin;
//		
//		System.out.printf("origin : %d , copy : %d\n",origin, copy);
		
		int[] origin = {5, 6, 7};
		int[] copy = origin;
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");  // 출력 : 5 6 7
		}
		
		System.out.println(); 
		
		// 복사본 배열 출력
		for (int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");    // 출력 : 5 6 7
		}
		// copy 값 변경 
		copy[1] = 66; // 5 66 7
		
		System.out.println();

		// copy 변경 후 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");  // 출력 : 5 66 7
		}
		
		System.out.println(); 

		// copy 변경 후 복사본 배열 출력
		for (int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");    // 출력 : 5 66 7
		} 
		
		System.out.println();

		// 10진수로 주소값 출력 
		System.out.println(origin.hashCode());  // 출력 : 57748372
		System.out.println(copy.hashCode());    // 출력 : 57748372
		
	
		
	}

	// 깊은 복사 1. for 문
	public void method2 () {
		// 1. for 문을 이용한 깊은 복사
		// 새로운 배열을 생성하여 반복문을 통해 실제 값을 복사하는 방법
		int origin[] = {6, 7, 8, 9, 10};
		int copy[] = new int[5];

		// 반복문을 통해서 origin 에 있는 값들을 copy에 대입한다.
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");  // 출력 : 6 7 8 9 10
		}

		System.out.println();

		// 복사본 배열 출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");    // 출력 : 6 7 8 9 10
		}
		
		// 복사본 수정
		copy[2] = 88;
		System.out.println();
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");  // 출력 : 6 7 8 9 10
		}

		System.out.println();

		// 복사본 배열 출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");    // 출력 : 6 7 88 9 10
		} 
		
		System.out.println();

		// 10진수로 주소값 출력 
		System.out.println(origin.hashCode()); // 출력 : 57748372
		System.out.println(copy.hashCode());   // 출력 : 674483268
		
	}

	// 깊은 복사 2. system 클래스의 arrayCopy() 메소드 / 시작위치 지정가능
	public void method3 () {
		// 2. System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사 

		int origin[] = {6, 7, 8, 9, 10};
		int copy[] = new int[10];
		
		// System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시작 위치, 복사할 길이)
		// System.arraycopy(origin, 0, copy, 0, 0);
		// 복사하고자 하는 배열의 시작 인덱스와 개수를 지정하고 싶을 때 사용한다. 
		// 복사되는 배열을 미리 생성해서 전달해야 한다.
		System.arraycopy(origin, 2, copy, 5, 2);
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");  // 출력 : 6 7 8 9 0
		}

		System.out.println();

		// 복사본 배열 출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");    // 출력 : 0 0 0 0 0 8 9 0 0 0
		}
		
		System.out.println(); 
		System.out.println(origin.hashCode()); // 출력 : 57748372
		System.out.println(origin.length);     // 출력 : 5
		System.out.println(copy.hashCode());   // 출력 : 674483268
		System.out.println(copy.length);       // 출력 : 10
	}

	// 깊은 복사 3. Arrays 클래스의 copyOf() 메소드 / 복사본 배열이 필요 X - 시작위치 지정 불가
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사 

		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = null;
		
		// Arrays.copyOf(원본배열, 복사할 길이);
		// Arrays.copyOf(null, 0)
		// 복사하고자 하는 배열의 크기를 다시 지정해서 복사하고 싶을때 사용한다.
		// 복사되는 배열을 미리 생성하지 않고 메소드에 배열의 크기를 전달해서 생성한다.
		
		copy = Arrays.copyOf(origin, 2);
		
		// 원본 배열 출력 
		for(int value : origin) { // origin 배열의 값들을 순차적으로 꺼내 value에 담아줌 반복.
			System.out.print(value + " ");  // 출력 : 1
		}
		
		
		System.out.println(); 
		
		// 복사본 배열 출력 
		for(int value : copy) {
			System.out.print(value + " ");  // 출력 : 2
		}
		
		System.out.println();
		System.out.println(origin.hashCode());  // 출력 : 57748372
		System.out.println(origin.length);      // 출력 : 5
		System.out.println(copy.hashCode());    // 출력 : 674483268
		System.out.println(copy.length);        // 출력 : 2
		
		
	}
	
	// 깊은 복사 4. .clone() 메소드 / 지정불가 그대로 복사 
	public void method5() {
		// 4. clone() 메소드를 이용한 복사
		// 원본 배열을 통째로 복사해서 새로운 배열을 생성한다.
		// 시작 인덱스를 지정할 수 없고 복사본 배열의 크기도 지정할 수 없다.
		
		int[] origin = {11, 12, 13, 14, 15};
		int[] copy = origin.clone();
		
		// 원본 배열 출력 
		for(int value : origin) { 
			System.out.print(value + " ");     // 11 12 13 14 15
		}
		
		System.out.println(); 
		
		// 복사본 배열 출력 
		for(int value : copy) {
			System.out.print(value + " ");     // 원본과 같이 출력된다.
		}
		
		System.out.println();
		System.out.println(origin.hashCode()); // 출력 : 57748372
		System.out.println(origin.length);     // 출력 : 5
		System.out.println(copy.hashCode());   // 출력 : 674483268
		System.out.println(copy.length);       // 출력 : 5
		
		
		
	}
}