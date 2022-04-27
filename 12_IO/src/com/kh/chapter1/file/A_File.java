package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		try {
		// 경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다. 
		File file = new File("test.txt"); // 실제로 파일이 생성되진 않는다. 메모리상에만 존재하는 객체
//		File file2 = new File("/Volumes/HBD/test2.txt"); // 경로 지정해봄.
		File file2 = new File("/Volumes/HBD/tmp/test2.txt"); 
//		=> 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다. 
		
			System.out.println(file.getName()); // 파일 이름 test.txt
			System.out.println(file.getAbsolutePath()); // 절대 경로 /Volumes/HBD/java/12_IO/test.txt
			System.out.println(file.getPath()); // 상대 경로 test.txt 
			System.out.println(file.length());  // 파일 용량 0
			System.out.println(file.exists());  // 파일 존재 여부 false 
			
			file.createNewFile(); // 실제 파일이 생성된다. 예외처리 코드가 없으면 오류가남.
			
//			file2.mkdirs(); 
//			경로가 없어도 만들어주는 명령어. 그러나 이 경우에는 텍스트파일도 폴더로 만들어 버림.

			File tempDir = new File("/Volumes/HBD/tmp");
			tempDir.mkdirs();
			file2.createNewFile();
//			존재하지 않는 폴더를 만들어서 파일까지 넣기.
			
//			file.delete();
//			파일 지우기 
			
			System.out.println(file2.exists());        // true
			System.out.println(file2.isFile());        // true
			System.out.println(file2.isDirectory());   // false
			System.out.println();
			System.out.println(tempDir.exists());      // true
			System.out.println(tempDir.isFile());      // false
			System.out.println(tempDir.isDirectory()); // true

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
