package collection;

import java.util.ArrayList;

public class Col_ArrayList {
	public static void main(String[] args) {
		// 1. ArrayList 객체생성 => 배열처럼 사용
		ArrayList<Integer> al = new ArrayList<>();
		
		
		// 2. add() 메소드를 이용한 값 넣기
		al.add(100);
		al.add(100);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);

		
		// 3. 인덱스 지정후 추가
		al.add(2, 700);
		System.out.println(al); // [100, 100, 700, 300, 400, 500, 600]
		
		
		// 4. 인덱스 지정 삭제
		al.remove(6);
		System.out.println(al); // [100, 100, 700, 300, 400, 500]
		
		
		// 5. for문을 이용한 출력 - size()메서드 
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		} // 100 100 700 300 400 500 
		
	}
}
