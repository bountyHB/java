package com.kh.chapter3.assiststream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class D_ObjectStream {
	// 1. fileSave
	public void fileSave() {
		Member member = new Member("gildon", "1234", "홍길동", 10, 1843.7);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"));){
			System.out.println("객체 출력 전");
			
			oos.writeObject(member);
			
			System.out.println("객체 출력 후");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// 2. fileRead
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"));){
			
			System.out.println("객체 입력 전");
		
			Member member = (Member)ois.readObject();
			System.out.println(member);
			
//			System.out.println(ois.readObject());
			
			System.out.println("객체 입력 후");
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
}
