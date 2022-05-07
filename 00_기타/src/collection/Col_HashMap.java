package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Col_HashMap {
	public static void main(String[] args) {
		// 1. HashMap 객체 생성
		HashMap hm = new HashMap();
		
		
		// 2. key값과 value 넣기
		hm.put("hello", 100);
		hm.put(10, "tester");
		hm.put(1, new Info("홍길동", 20));
		
		
		// 3. get() 메소드를 이용한 출력
		System.out.println(hm.get(10)); // tester 
		System.out.println(hm.get("hello")); // 100
		System.out.println(hm.get(1)); // Info [name=홍길동, age=20]
		System.out.println(hm.get(123)); // 없는키 : null 출
		System.out.println("==");
		
		
		// 4. keySet() 메소드와 Iterator 메소드를 활용 
		Set keys = hm.keySet();
		Iterator it = keys.iterator();
//		Iterator it = hm.keySet().iterator();
		
		
		// 5. while문을 이용한 출력. hasNext() 메소드와 next() 메소드 필요.
		while (it.hasNext()) {
			System.out.println(it.next());
		} // 1, 10, hello 출력 
		System.out.println("==");
		
		
		// 6. for each문을 이용한 key값 출력.
		for (Object o : keys) {
			System.out.println(o);
		} // 1, 10, hello 출력
		System.out.println("==");
		
		
		// 7. values를 이용한 value값 출력 
		hm.values();

		System.out.println(hm.values());
		System.out.println("==");
		// [Info [name=홍길동, age=20], tester, 100] 출력
		
		
		// 8. for each문을 이용한 value 출력
		Collection values = hm.values();
		for (Object o : values) {
			System.out.println(o);
		}

		
		// 9. key 값을 꺼낸 방법을 이용하려 key와 value를 출력
		it = keys.iterator();
		while (it.hasNext()) {
			Object key = it.next(); // key에 key값을 다 넣어준다. 
			Object value = hm.get(key); // value에 key를 다 넣어준다.
			System.out.println("key : " + key + ", value : " + value);
		}
		/*
		  출력 
		  	key : 1, value : Info [name=홍길동, age=20]
			key : 10, value : tester
			key : hello, value : 100
		 */
	
	}
}
