package com.kh.exception.practice;

import java.io.IOException;

public class B_Throws {
	public void method1()  {
		try {
				System.out.println("method2() 호출 전");

				method2();

				System.out.println("method2() 호출 후");
			// 1. 상위 클래스 하나로 	
//			} catch (Exception e) { // Exception e = ClassNotFoundException
//									// Exception e = IOException 상위 클래스로서 두 문장을 모두 포함.
//									// 만약 둘이 처리 방법이 다르다면 어떻게 해야할까 ? 
									// => catch 문을 여러개로 사용가능
//				System.out.println("예외가 발생했습니다.");
//			}
			// 2. 두줄을 각자
//				} catch (ClassNotFoundException e) {
//				System.out.println("ClassNotFoundException 예외가 발생했습니다.");
//				} catch (IOException e) {
//				System.out.println("IOException 예외가 발생했습니다.");
//			} 
			// 3. 두줄을 한 줄로 
			} catch (ClassNotFoundException | IOException e) {
				System.out.println("ClassNotFoundException,IOException 예외가 발생했습니다.");
			
			} catch (Exception e) {
				System.out.println("예외가 발생했습니다.");
			}
				
		}
	
	
// 에러가 발생하면 메소드를 호출하는 곳에서 (method1) 떠넘기게 된다 .
	public void method2() throws ClassNotFoundException, IOException {
		System.out.println("method3() 호출 전");
		
		method3();
		
		System.out.println("method3() 호출 후");
	}

// 에러가 발생하면 메소드를 호출하는 곳에서 (method2) 떠넘기게 된다 .
	public void method3() throws ClassNotFoundException, IOException {
//	public void method3() throws Exception { // 상위에 있는 클래스를 이용한다 
		int random = (int)(Math.random() * 4 + 1);
		
		/*
		 *  CheckedException
		 *    - Exception 클래스를 상속하고 있는 예외들을 CheckedException이라 한다.
		 *    - 컴파일 시 예외 처리 코드가 있는 검사하고 예외 처리 코드가 없으면 컴파일 에러를 발생시킨다.
		 *    	(try -catch, throws)
		 *    
		 *  UnCheckedExceoption
		 *    - RuntimeException을 상속하고 있는 예외들을 UnCheckedExceoption이라 한다. 
		 *    - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는다.
		 * 		
		 */
		
		if (random == 1) {
			throw new ClassNotFoundException();
		} else if(random == 2) {
			throw new IOException();
		} else if (random ==3) {
			throw new ClassCastException(); 
			// runtime exception => 예외처리 코드가 따로 필요없다. unchecked exception
		}
		
		
		
	}
	
}
