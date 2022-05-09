package com.kh.practice2.model.vo;

public class Dog extends Animal {

	public String place = "애견카페";
	private int weight;
	
	public Dog() {
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}
	
}
