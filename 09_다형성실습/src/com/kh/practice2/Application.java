package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animal = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat 객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		animal[0] = (new Dog("요키", "요크셔테리어", 3));
		animal[1] = (new Dog("햇살", "말티즈", 4));
		animal[2] = (new Cat("망고", "샴", "캐나다", "하양"));
		animal[3] = (new Cat("케찹", "치즈냥", "한국", "치즈"));
		animal[4] = (new Cat("마요", "고등어냥", "우리집", "고등고등"));
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의 객체의 speak() 메소드 호출
		for (int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}
}
