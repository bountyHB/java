package com.kh.chapter4;

import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {

		String[] strArray = {"홍길동", "가나다", "라마바", "사아자", "차파타"};
		Integer[] intArray = {11, 22, 33, 44, 55}; // auto-boxing으로 new int가 생략된다.
		Double [] doubleArray = {11.1, 22.2, 33.3, 44.4, 55.5};
		
//		MyGenerics myGenerics = new MyGenerics(strArray); 
//		MyGenerics myGenerics = new MyGenerics(intArray); 
//		MyGenerics myGenerics = new MyGenerics(doubleArray); 
		
		// 제네릭스를 바꿀때마다 MyGenerics 클래스의 t가 각 String, Integer, Double로 변화한다.
		// type parameter를 쓰면 하나의 생성자로 여러 데이터를 받아서 처리할수 있게 만들어 준다.
		
		// 1. 객체 생성 
//		MyGenerics<String> myGenerics = new MyGenerics<>(strArray);
//		MyGenerics<Integer> myGenerics = new MyGenerics<>(intArray);
		MyGenerics<Double> myGenerics = new MyGenerics<>(doubleArray);
		
		// 2. print 메소드 실행 
		myGenerics.print();
		
		// 3. list 객체 생성후 tolist 메소드 실행 
//		List<String> list = myGenerics.toList();
//		List<Integer> list = myGenerics.toList();
		List<Double> list = myGenerics.toList();
		
		System.out.println(list);
		
	}
}
