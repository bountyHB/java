package com.kh.chapter3.assiststream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
	public void fileSaveAndRead() {
		// 기본타입은 반드시 byte 기반으로 만들어야 함.
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt"));
			 DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))){

			// 파일에 출력하기
			
			dos.writeUTF("홍길동");
			dos.writeInt(20);
			dos.writeChar('M');
			dos.writeBoolean(false);
			dos.writeDouble(183.4);
			
			// 파일에서 값을 읽어오기 
			while(true) {
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e){ // 순서가 바뀌면 오류가 발생하기 때문에 이 구문을 추가했다.
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
	
}
