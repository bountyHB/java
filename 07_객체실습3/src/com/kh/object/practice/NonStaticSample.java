package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드 
		// 응용 --> 오름차순 정렬로 출력 
		int[] lotto = new int [6];
		System.out.printf("랜덤 값 : ");
		for (int i = 0; i < lotto.length; i++) {
			lotto [i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto [i]== lotto[j] ) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public void outputChar(int num,char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드 
		System.out.printf("%c문자 %d개 출력 : ",c , num);
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드 
		// 주의! 소문자 대문자 모두 포함 
		
		System.out.printf("렌덤 영문자 출력 : ");
		int num = 0;
		
		while (true) {
			num = (int)(Math.random()*58+65);
			if (num >= 'a' && num<= 'z' || num >='A' && num <='Z') {
				break;
			}
		}
		return (char)num;
	}
	
	public String mySubString(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스 , 끝 인덱스를 전달 받고 
		// 해당 인덱스 범위의 문자열을 추출하여 리턴 
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. -> 없으면 null 리턴. 
		String result = null;
		
		if(!str.equals("")) {
			result = str.substring(index1, index2);
		}
		
		return result; 
	}
	
}
