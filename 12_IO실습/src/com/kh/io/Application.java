package com.kh.io;

import java.util.Scanner;

import com.kh.io.model.dao.FileDao;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		// 반복문을 통한 메뉴 실행 
		// "****** MyNote ******"
		// "1. 노트 새로 만들기" // fd.fileSave() 실행 
		// "2. 노트 열기" // fd.fileOpen() 실행 
		// "3. 노트 열어서 수정하기" // fd.fileEdit() 실행 
		// "4. 끝내기"
		// "번호를 입력하세요 : "

		while (true) {
			System.out.println();
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num == 1) {
				fd.fileSave();
			}else if (num == 2) {
				fd.fileOpen();
			}else if (num == 3) {
				fd.fileEdit();
			}else if (num == 4) {
				return;
			}
		}
		
	}

}
