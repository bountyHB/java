package collection;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapStore {

	public static void main(String[] args) {

		TreeMap<Integer,DepartmentStore> store = new TreeMap<>();
		
		store.put(1, new DepartmentStore("화장품", "카페"));
		store.put(2, new DepartmentStore("여성", "의류", "신발"));
		store.put(4, new DepartmentStore("극장", "식당", "카페", "공원", "고객센터"));
		store.put(3, new DepartmentStore("남성", "의류", "신발", "잡화"));
		store.put(-2, new DepartmentStore("지하주차장"));
		store.put(-1, new DepartmentStore("지하주차장"));
				
		// 검색기능_순위로 영화 이름 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.print("층 : ");
		int he = sc.nextInt(); 
		System.out.println(he + "층에는" + store.get(he) + "가 위치해 있습니다.");
		
		System.out.print("입력한 순위보다 한단계 높은 순위를 출력 : ");
		he = sc.nextInt();
		System.out.println(store.lowerEntry(he));

		System.out.print("입력한 순위보다 한단계 낮은 순위를 출력 : ");
		he = sc.nextInt();
		System.out.println(store.higherEntry(he));
		
		
		System.out.println("현재 박스오피스 1위 : " + store.firstEntry());
		System.out.println("현재 박스오피스 5위 : " + store.lastEntry());

		
		
		
	}

}
