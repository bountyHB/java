package com.kh.chapter1.polymorphism;

public class Tv extends Product{
	private int inch; // 인치 

	public Tv() {
	}

	public Tv(String pCode, String name, String brand, int price, int inch) {
		super(pCode, name, brand, price);
		this.inch = inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [" + super.toString() + ", inch=" + inch + "]";
	}

	public int getInch() {
		return inch;
	}

	
}
