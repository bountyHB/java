package com.kh.io.model.dao;

import java.io.BufferedWriter;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
	}


	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String str = sc.nextLine();
		
		while (true) {
			// "파일에 저장할 내용을 반복해서 입력하시오 ("exit"을 입력하면 내용입력 끝) : "
			// 값을 scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문도 빠져나감 
			// 아닐 경우 sb에 추가
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오 (exit을 입력하면 내용입력 끝) : ");
			if (str.equals("exit")) {
				break;
			}else {
				sb = new StringBuilder(str);
			}
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		if (str.equals('y') || str.equals('Y')) {
			System.out.print("저장할 파일명을 입력하세요 : ");
			str = sc.nextLine();
			
			
		}
		
		// "저장하시겠습니까? (y/n)"
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 "y"이면, 
		// 저장할 파일명을 입력 받음
		
		// "입력받은 파일명.txt" 파일에 해당 sb 데이터출력 
		// "입력받은 파일명.txt 파일에 성공적으로 저장하였습니다." 콘솔창 출력
		
		
		
		
		// 입력 받은 값이 y가 아니면 "다시 메뉴로 돌아갑니다." 출력하고 메뉴로...
		
		
	}
	
	public void fileOpen() {
		
		// "열기 할 파일명 : "
		
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		
		// try 구문 안에서 readLine() 메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
		
		// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨 
		
		// "존재하는 파일이 없습니다."
		
	}
	
	public void fileEdit() {
		
		// "수정 할 파일명 : "
		
		// 파일명을 BufferedReader와 BufferedWriter, FileReader와 FileWriter 스트림 사용
		
		
		
		// 반복문을 통해 해당 파일의 내용을 readLine() 메소드를 통해 콘솔에 출력  
		
		// "파일에 추가할 내용을 입력하시오 : "
		
		// 사용자가 "exit"를 입력하기 전까지 내용을 StringBuilder에 담기 
		
		
		// "변경된 내용을 파일에 추가하시겠습니까? (y/n)"
		
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 "y"이면, 
		
		// "입력받은 파일명.txt 파일의 내용이 변경되었습니다."
		

		
		
	}
	
	
}
