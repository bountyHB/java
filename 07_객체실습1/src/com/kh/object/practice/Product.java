package com.kh.object.practice;

public class Product {
	// 필드작성 
	private String id;   // 상품 아이디 
	private String name; // 상품명 
	private String site; // 생산지 
	private int price;   // 가격 
	private double tax;  // 부가세비율 
	// 기본생성자 
	public Product() {
	}
	// 필드생성자 
	public Product(String id, String name, String site, int price, double tax) {
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}
	
	// getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// information 메소드 
	public String information() {
		return  id + " " + name + " " + site + " " +  price + " " +  tax;
	}
	
	// realPrice 메소드 
	public double realPrice() {
		return price + (price * tax);
	}

}
