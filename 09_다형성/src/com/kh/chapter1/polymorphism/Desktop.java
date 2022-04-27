package com.kh.chapter1.polymorphism;

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

}
