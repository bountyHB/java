package com.kh.chapter3.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chapter3.map.vo.Snack;

public class A_HashMap {
	// HashMap을 생성하고 저장, 출력 테스트
	public void method1() {
		Map<String, Snack> map = new HashMap<>();
		
		// 저장 순서 유지 X, 키값 중복 X (단, 중복된 키값으로 저장하면 기존에 있던 값을 덮어쓴다.)
		map.put("다이제", new Snack("초코맛", 1000));
		map.put("칸쵸", new Snack("바나나맛", 250));
		map.put("프링글스", new Snack("오리지널", 500));
		map.put("프링글스", new Snack("어니언맛", 500));
		map.put("허니버터칩", new Snack("꿀버터맛", 520));
		map.put("꼬북칩", new Snack("콘소메맛", 1200));
		map.put("꼬북칩", new Snack("시나몬초코", 1200));
		
		System.out.println(map);
		System.out.println();

		// Map 컬렉션에서 key에 해당하는 Value를 얻어오는 메소드 
		// get() 메소드에 키 값을 넣으면 value를 리턴한다.
		Snack snack =  map.get("다이제");
		
		System.out.println(snack);
		System.out.println();
		
		// Map 컬렉션에 담겨있는 객체들의 개수를 얻어오는 메소드 
		// size() 메소드를 출력 
		System.out.println("개수 : " + map.size());
		System.out.println();
		
		// Map 컬렉션에서 키값에 해당하는 Entry 객체를 삭제하는 메소드 
		map.remove("허니버터칩");
		
		System.out.println(map);
		System.out.println("개수 : " + map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
		// Maps 컬렉션에 담겨있는 모든 Entry 객체를 삭제하는 메소드 
		map.clear();
		
		System.out.println(map);
		System.out.println("개수 : " + map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
		
		
		
	}

	// HashMap의 Entry 객체에 접근해서 
	public void method2() {
		Map<String, Snack> map = new HashMap<>();
		
		map.put("다이제", new Snack("초코맛", 1000));
		map.put("칸쵸", new Snack("바나나맛", 250));
		map.put("프링글스", new Snack("오리지널", 500));
		map.put("허니버터칩", new Snack("꿀버터맛", 520));
		map.put("꼬북칩", new Snack("콘소메맛", 1200));
		
		// Map은 인덱스의 개념이 없어서 반복문을 사용할 수 없다.
//		for (int i = 0; i < map.size(); i++) {
//		}
		
		// Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for문을 사용할 수 없다. 
//		for (Entry<String, Snack> entry : map) {
//		}
		
		// List랑 Map은 구조가 달라서 ArrayList에 담아서 사용할 수 없다. 
//		List<Entry<String, Snack>> list = new ArrayList<>(map);
		
		
		// 1. keyset() 메소드를 이용하는 방법 
		Set<String> set = map.keySet();
		
		// foreach 로 출력
		for (String key : set) {
			System.out.printf("key : %s, value : %s\n", key, map.get(key));
		}
		System.out.println();
		
		// 2. entrySet() 메소드를 이용하는 방법 => for each 문 연습해보기 
		Set<Entry<String, Snack>> entryset = map.entrySet();
		Iterator<Entry<String, Snack>> iterator = entryset.iterator();
		
		// while로 출력 
		while (iterator.hasNext()) {
//			Map.Entry<java.lang.String, com.kh.chapter3.map.vo.Snack> entry = (Map.Entry<java.lang.String, com.kh.chapter3.map.vo.Snack>) iterator
//					.next();
			Entry<String, Snack> entry = iterator.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			// 위를 한줄로 
			System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());
			
		}
		System.out.println();
		
	}
}
