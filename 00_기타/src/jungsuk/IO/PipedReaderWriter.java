package jungsuk.IO;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

// 실행클래스 
public class PipedReaderWriter {

	public static void main(String[] args) {
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		// PipendREader와 PipedWriter를 연결한다. 
		inThread.start();
		outThread.start();
	}
}

// InputThread
class InputThread extends Thread {
	
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	// StringWriter는 CharArrayWritter처럼 메모리를 사용하는 스트림인데
	// 내부적으로 String Buffer를 가지고 있어서 출력하는 내용이 여기에 저장된다.
	
	InputThread(String name){
		super(name); // Thread(String name);
	}
	
	// run()
	public void run() {
		try {
			int data = 0;
			while((data = input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public PipedReader getInput() {
		return input;
	}
	
	// connect()
	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

// OutputThread
class OutputThread extends Thread {
	
	PipedWriter output = new PipedWriter();

	public OutputThread(String name) {
		super(name); // Thread(String name);
	}

	// run()
	public void run() {
		try {
			String msg = "hello";
			System.out.println(getName() + " sent : " + msg);
			output.write(msg);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public PipedWriter getOutput() {
		return output;
	}
	
	// connect()
	public void connect(PipedReader input) {
		try {
			output.connect(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}