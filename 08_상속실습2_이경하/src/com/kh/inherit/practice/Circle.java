package com.kh.inherit.practice;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw() {
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [getX()=" + getX() + ", getY()=" + getY() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", radius=" + radius + "]";
	}
	
	
	
	
	
	
	
	
}
