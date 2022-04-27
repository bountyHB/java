package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;
//Number는 integer랑 double이 상속하고 있는 추상클래스. 이렇게 지정해주면 String타입이 올수없게된다.
//public class MyGenerics<T extends Number> {
public class MyGenerics<T> {
	private T[] values;
	
	public MyGenerics() {
	}

	public MyGenerics(T[] values) {
		this.values = values;
	}
	
	// values 에 있는 내용을 출력할 메소드.
	public void print() {
		for (T t : values) {
			System.out.println(t);
		}
	}
	
	// 가지고있는 array를 list로 반환하는 메소드.
	public List<T> toList() {
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);
		}
		
		return list;
	}

}
