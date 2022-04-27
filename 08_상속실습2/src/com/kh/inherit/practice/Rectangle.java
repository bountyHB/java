package com.kh.inherit.practice;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [getX()=" + getX() + ", getY()=" + getY() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
	
	
	
	
}
