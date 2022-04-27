package com.kh.inherit.before;

public class Desktop {
	
	private String pCode; // 상품 코드 
	private String name; // 상품명 
	private String brand; // 브랜드 
	private int price; // 가격 
	private boolean allInOne; // 일체 여부 

	public Desktop () {
	}
	
	// (souce → generate constructor using fields)
	public Desktop(String pCode, String name, String brand, int price, boolean allInOne) {
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.allInOne = allInOne;
	}

	@Override // 필드들을 조합해서 하나의 문자열을 만들어줌. (source → generate to string)
	public String toString() {
		return "Desktop [pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price + ", allInOne="
				+ allInOne + "]";
	}
	
 
	
	
	
	
}
