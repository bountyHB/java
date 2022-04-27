package com.kh.chapter3._Interface;
//3. 오류가 뜨면 add an implements method 를 누른다.
public class Desktop extends Product{
	private boolean allInOne; // 일체 여부 

	public Desktop() {	
	}

	public Desktop(String pCode, String name, String brand, int price, boolean allInOne) {
		super(pCode, name, brand, price); // 갯수와 순서를 꼳 맞춰야 한다. 
		this.allInOne = allInOne; // 구분하기 위해 앞에 this.를 붙였다.
	}
	

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override 
	public String toString() {
		return "Desktop [" + super.toString() + ", allInOne=" + allInOne + "]";
	}

	//4. turnOn() turnOff()가 추가되었다.

	@Override
	public void turnOn() {
		System.out.println("데스크탑을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크탑을 종료합니다.");
	}

}
