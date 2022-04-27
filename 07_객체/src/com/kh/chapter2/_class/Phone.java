package com.kh.chapter2._class;

// 접근 제한자 생략시 default 접근 제한이 적용된다. 
class Phone {
	
	// 필드부 작성.
	private String name;
	private String color;
	private String brand;
	
	// 생성자부 작성.
	public Phone() {
	}

	
	// 메소드 작성. getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

		
	
	
	
	
}
