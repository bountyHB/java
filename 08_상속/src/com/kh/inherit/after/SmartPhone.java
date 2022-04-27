package com.kh.inherit.after;

public class SmartPhone extends Product {
	private String mobileAgency; // 통신사 
	
	public SmartPhone() {
	}

	// source → generate constructor from superclass
	public SmartPhone(String pCode, String name, String brand, int price, String mobileAgency) {
		super(pCode, name, brand, price);
		
		this.mobileAgency = mobileAgency;
	}
	

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override // toString에 + super.toString() + 를 추가하여 재정의 함.
	public String toString() {
		return "SmartPhone [" + super.toString() + ", mobileAgency=" + mobileAgency + "]";
	}

	
	





}
