package com.kh.A_mine;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 스트림을 생성 
//		intStream.forEach(System.out::print); // forEach()최종연산 
//		
//		// Stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream(); // list로부터 stream을 생성 
//		intStream.forEach(System.out::print);
		
		String[] strArr = new String[] {"a","b","c"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		
		
		strStream.forEach(System.out::println);
		
	}

}
