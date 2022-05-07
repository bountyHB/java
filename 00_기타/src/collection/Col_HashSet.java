package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Col_HashSet {
	public static void main(String[] args) {
		// 1. HashSet 객체 생성
		HashSet hs = new HashSet();
		
		
		// 2. add() 메소드를 이용한 값 넣기
		hs.add("hello");
		hs.add("10"); // new Integer(10) auto boxing
		hs.add("20");
		hs.add("30");
		hs.add("20");
	
		
		// 3. while문과 Iterator를 이용한 출력 
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		} // hello, 30, 20, 10 출력
		System.out.println("==");
		
		
		// 3. HashSet이 가지고있는 메서드 활용
		System.out.println(hs.size()); // 4
		System.out.println(hs.isEmpty()); // false
		System.out.println(hs.remove(30)); // false
		System.out.println(hs.contains(30)); // false
		System.out.println(hs.contains("30")); // true, <>를 지정해주지 않아 object로 저장
		System.out.println(hs.size()); //4
		System.out.println("==");
		
		
		// 4. for each문을 이용한 재출력
		it = hs.iterator(); // 위에서 모두 소모했기 때문에 다시 생성 후 출력가능 
		for (Object o : hs) {
			System.out.println(o);
		}// hello, 30, 20, 10 출력
		
	}
}
