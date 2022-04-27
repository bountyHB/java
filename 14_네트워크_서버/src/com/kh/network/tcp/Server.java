package com.kh.network.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.network.receriver.Receiver;

/*
 * 서버용 TCP 소켓 프로그래밍 순서
 * 
 * 1. 서버의 포트 번호 정한다.
 * 2. 서버용 소켓 객체를 생성한다.
 * 3. 클라이언트에서 접속 요청이 올 때까지 기다린다.
 * 4. 클라이언트로부터 접속 요청이 오면 요청 수락 후 해당 클라이언트와 연결된 소켓 객체 생성한다.
 * 5. 연결된 클라이언트와 입출력 스트림 생성한다.
 * 6. 보조 스트림을 통해 스트림의 성능을 개선한다.
 * 7. 스트림을 통해 데이터를 읽고 쓴다.
 * 8. 통신을 종료한다.
 */

public class Server {
	public void start() {
		// 1. 서버의 포트 번호 지정 
		// 	- 0 ~ 1023은 시스템 포트 번호 
		// 	- 1024 ~ 65535의 포트 번호를 사용하는 것을 추천  
		int port = 30027;
		String message = null;
		
		// 2. 서버용 소켓 객체를 생성한다. 
//		ServerSocket server = null;
		
		// 포트 바인딩, 포트번호 지정 
		try (ServerSocket server = new ServerSocket(port)){
			System.out.println("서버 시작..");

			while (true) {  // 계속해서 요청할 수 있도록 반복문을 사용한다. (한번 실행후 닫히기 때문)
			
			// 3. 클라이언트에서 접속 요청이 올 때까지 기다린다.
			// 4. 클라이언트로부터 접속 요청이 오면 요청 수락 후 해당 클라이언트와 연결된 소켓 객체 생성한다.
			System.out.println("클라이언트 대기중..");
			
			Socket client = server.accept(); // 클라이언트로부터 요청이 오는걸 기다림.
											 // 그 후 client 에 입력시켜 줄것임. 
			System.out.println("클라이언트 연결 됨..");
			
			// 추가 구문. receiver가 작업스레드 . runnable을 구현. 
			// 메인 스레드는 요청을 받아서 수락되면 새로운 소켓을 만들어서 스레드 생성해서 넘기는 역할만 하게됨 
			// 기존에 있던 아래 5 ~ 8구간은 다른 스레드에서 처리하도록 멀티로 넘김.
			new Thread(new Receiver(client)).start(); 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}