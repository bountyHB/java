package com.kh.chapter3._Interface;
// 3. 오류가 뜨면 add an implements method 를 누른다.
public class SmartPhone extends Product  {
	private String mobileAgency; // 통신사 
	
	public SmartPhone() {
	}

	public SmartPhone(String pCode, String name, String brand, int price, String mobileAgency) {
		super(pCode, name, brand, price);
		
		this.mobileAgency = mobileAgency;
	}


	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override 
	public String toString() {
		return "SmartPhone [" + super.toString() + ", mobileAgency=" + mobileAgency + "]";
	}

	//4. turnOn() turnOff()가 추가되었다.
	
	@Override
	public void turnOn() {
		System.out.println("스마트 폰을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 폰을 종료니다.");
	}


}
