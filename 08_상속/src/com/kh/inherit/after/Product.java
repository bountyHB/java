package com.kh.inherit.after;

public class Product {
	private String pCode; // 상품 코드 
	private String name; // 상품명 
	private String brand; // 브랜드 
	private int price; // 가격 

	public Product() {
//	System.out.println("부모 클래스의 기본 생성자");
	}

	public Product(String pCode, String name, String brand, int price) {
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	@Override
	public String toString() {
		return "pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price;
	}

//	안의 내용을 바꿔서 출력하고 싶으면 setter를 살려서 할 수 있음.
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
