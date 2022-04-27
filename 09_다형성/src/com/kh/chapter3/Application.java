package com.kh.chapter3;

import com.kh.chapter3._Interface.Basic;
import com.kh.chapter3._Interface.Desktop;
import com.kh.chapter3._Interface.SmartPhone;

public class Application {

	public static void main(String[] args) {
		// 인터페이스는 객체 생성이 불가능하다. 
		// 인터페이스를 구현하는 자식 클래스를 통해서 생성해야 한다. 
//		Basic basic = new Basic();
		
		// 인터페이스는 객체 생성이 안될 뿐 참조변수로 사용이 가능하다. 
		// 다형성을 적용해서 인터페이스를 구현하는 객체를 생성해서 참조할 수 있다. 
		Basic desktop = new Desktop("a1111", "아이맥 24인치", "애플", 2000000, true);
		Basic phone = new SmartPhone("a2222", "아이폰12 미니", "애플", 960000, "KT");

		System.out.println(desktop);
		System.out.println(phone);
		
		
		desktop.turnOn();
		desktop.turnOff();
		phone.turnOn();
		phone.turnOff();
		
	}
	
	

}
