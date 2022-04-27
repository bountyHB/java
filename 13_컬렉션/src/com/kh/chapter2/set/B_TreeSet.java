package com.kh.chapter2.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter2.set.vo.Music;

public class B_TreeSet {
	// TreeSet을 생성하고 저장, 출력 테스트 
	public void method1() {
		TreeSet<String> ts = new TreeSet<>();
		// Set<String> ts = new TreeSet<>(); 으로 하게되면 Treeset에서 제공하는 검색기능 사용 못함.
		
		// 중복제거, 객체를 오름차순으로 정렬, null 저장 안됨 
		ts.add("하하하");
//		ts.add(null);
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");
//		ts.add(null);
		ts.add("하하하");

//		null값 넣은채로 출력하면 nullPointException 발생.
//		정렬할 때는 compareTo() 메소드를 확인하게 되는데 ,  null.compareTo()=> 로 인해 예외발생.
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());

	}

	// TreeSet에 Music 객체를 저장, 출력 테스트  
	public void method2() {
		Set<Music> set = new TreeSet<>(new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
		// 이전에는 Music 객체에 정의되어 있는 compareTo로 정렬하는데, 
		// 매개값으로 Comparator 인터페이스를 구현하는 객체(익명구현객체)를 1회성으로 넣어 재정렬 했다.
		// 매개값으로 넣은것이 우선으로 정렬된다. 
		
		
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
		for (Music music : set) {
			System.out.println(music);
		}
	}
}
