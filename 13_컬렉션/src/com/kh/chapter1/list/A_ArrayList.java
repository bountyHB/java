package com.kh.chapter1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.chapter1.list.compare.ArtistAcending;
import com.kh.chapter1.list.vo.Music;

public class A_ArrayList {
	// ArrayList를 생성하고 저장, 출력 테스트 	
	public void method1() {
		// ArrayList 객체 생성. 저장공간은 저절로 늘어나기 때문에 따로 지정할 필요가없다.
		List list = new ArrayList();
		// 배열도 object 클래스로 만들면 모든 타입을 저장 가능하다.
//		Object[] array = {"안녕", 1 ,LocalDateTime.now()};
		
//		list[0] = "aaa"; // 이전 배열에 값을 넣는법.
		
		// 객체를 저장할 때는 add() 메소드를 사용한다.
		list.add("안녕하세요"); // string 
		list.add(LocalDateTime.now()); // 클래스와 메소드.
		list.add(3.14); // 오토 박싱이 적용되어 기본형도 저장이 가능.
		list.add(false); 
		list.add('a');
		
		// 각각의 요소들의 toString 요소들을 보여준다.
		System.out.println("list : " + list);
		System.out.println("list : " + list.size());	
		System.out.println("===========");

		// 인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
		// List에서 객체를 꺼내서 대입하려면 해당 자료형에 맞게 형 변환을 해야한다.
//		String str = list.get(0); // Error. 실제 객체는 문자열이더라도 리턴타입이 object이기 때문이다.
		String str = (String)list.get(0); // OK. 형 변환을 하여 가져와 주었다.
		LocalDateTime now = (LocalDateTime)list.get(1);
		double num = (double)list.get(2);
		
		
		// 반복문을 통해서도 처리가 가능하다. (for 문)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); 
		}
		
		// for each 문 /왼쪽엔 요소들을 저장할 참조변수. 오른쪽은 요소를 저장하고있는 객체. 
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("===========");
		
		// 객체의 중복 저장을 허용한다.
		list.add("안녕하세요");
		System.out.println("list : " + list);
		
		// null 저장을 허용한다. 
		list.add(null);
		list.add(null);
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치에 객체를 추가할 수 있다. 
		list.add(2, 125000);
		System.out.println("list : " + list);
		
		// 원하는 인덱스 위치의 객체를 변경할 수 있다. 
		list.set(1, 8);
		System.out.println("list : " + list);
		System.out.println("===========");

		// 삭제하기
		list.remove(2); // 인덱스 번호로 지우기 
		System.out.println("list : " + list);

		list.remove("안녕하세요"); // 안녕하세요가 2개이면, 가장 앞의 값만 지워진다. 
		list.remove("안녕하세요"); // 두번 호출하면 둘 다 지울 수 있다. 
		list.remove(Integer.valueOf(8)); // 정수값으로 지우고 싶다면 wrapper클래스로 boxing해서 정수객체로 넘겨야한다.
		System.out.println("list : " + list);
		System.out.println("list.isEmpty : " + list.isEmpty()); // false 
		
		// List에 저장된 객체를 모두 삭제할 때는 clear() 메소드를 사용한다. => 요소만 삭제
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list.isEmpty : " + list.isEmpty()); // true
		
		
	}

	// ArrayList에 문자열, 정수를 저장, 정렬 테스트
	public void method2() {

		/*
		 * 	컬렉션에서 제네릭스(<>)를 사용하는 이유 
		 *    - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다. 
		 *    - 컬렉션에 저장된 객체를 꺼내올때 매번 형변환 작업을 할 필요가 없다.
		 * 
		 * 
		 *  리스트의 정렬
		 *    - Wrapper 객체, 문자열의 경우엔 Comparable 인터페이스가 내부적으로 구현되어 있어서
		 *    	Collections.sort()를 통해서 정렬이 가능하다.
		 *    - 사용자가 작성하는 클래스의 객체도 Collections.sort()를 통해서 정렬이 가능하게 하고 싶다
		 * 		Comparable 인터페이스를 구현하면 된다.
		 * 
		 */
		
		// <> 안에는 자료형(클래스타입)만 가능하다. int => Integer
		// <> 는 type parameter 지정. 
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<>(); // 뒤에는 생략가능하다 : 타입추론
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		// Integer e;
		// e = 7; 과 같다. => 타입이 다른데도 대입이되는것은 오토박싱이 일어났기 때문이다.
		list2.add(7);
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("============================================");

		// 오름차순으로 리스트를 정렬
		// Comparable 인터페이스를 구현하고 있는 요소를 가지고 있는 리스트를 인자로 전달한다.
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("============================================");
		
		// 내림차순으로 리스트를 정렬
		// sort()메소드를 통해서 오름차순으로 정렬 후에 reverse()메소드를 호출하여 내림차순으로 정렬.
		Collections.reverse(list);
		Collections.reverse(list2);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		
	}

	// ArrayList에 Music 객체를 저장, 정렬 테스트
	public void method3() {
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("Love Dive", "IVE", 1));
		list.add(new Music("TOMBOY", "I-DLE", 3));
		list.add(new Music("나는 트로트가 싫어요", "임창정", 6));
		list.add(new Music("소주 한잔", "임창정", 5));
		list.add(new Music("Feel My Rhythm", "레드벨벳", 4));
		list.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
		System.out.println(list);
		
		// 정렬을 할 기준이 없다. 제목 - 가수 이름 - 순위 ??
//		Collections.sort(list); // error. 기준이 없기 때문에. 

		// music 클래스에서 comparable 인터페이스 메소드 오버라이딩 전에는 0으로 반환하게 되어있다.
		// 0으로 반환하면 배열에 입력한 그대로 출력.
		System.out.println("==================================================");
		for (Music music : list) {
			System.out.println(music);
		}

		// 오름차순으로 리스트를 정렬하는 메소드 
		// 1. 하나의 매게변수를 받는 sort() 메소드는 comparable 인터페이스를 구현하고 있는 요소를 가지는 리스트를 전달해야 한다. 
		System.out.println("==================================================");
		Collections.sort(list);
//		System.out.println(list); 
		
		// for each 문으로 보기 편하게 출력 가능 
		for (Music music : list) {
			System.out.println(music);
		}
		
		// 2. 두 개의 매개변수를 받는 sort() 메소드는 첫 번째 인사는 리스트 객체,
		//    두 번째 인자는 리스트 내의 각 요소(객체)를 비교하는데 사용하게 될 Comparator 인터페이스의 구현 객체를 넘겨준다.
		System.out.println("==================================================");
		Collections.sort(list, new ArtistAcending());
		for (Music music : list) {
			System.out.println(music);
		}
		

		// 익명 구현 객체를 사용하는 방법 
		// 두번째 매개변수에 추상메서드를 /익명 구현 객체를/ 넣어버린다.
		System.out.println("==================================================");
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		for (Music music : list) {
			System.out.println(music);
		}
		
		// 익명 구현 객체
		// => 인터페이스가 가지고있는 추상메서드를 바로 중괄호를 열어서 구현해주는것.
//		Comparator<Music> comparator = new Comparator<Music>() {
//			@Override
//			public int compare(Music o1, Music o2) {
//				return o1.getTitle().compareTo(o2.getTitle());
//			}
//		};
		
		
		// 람다식 사용하는 방법 => JDK 8.0 부터 
		System.out.println("==================================================");
		Collections.sort(list, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
	}
}