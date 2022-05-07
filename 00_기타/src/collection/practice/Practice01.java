package collection.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int size = hs.size();
			System.out.print("입력(현재길이:" + size + "):");
			int inputData = scanner.nextInt();
			
			// 중복이라는 표시를 하지 않아도 HashSet은 원래 중복값을 가질 수 없음.
			if (hs.contains(inputData)) {
				System.out.println("중복!");
				continue;
			}
			hs.add(inputData);
//			System.out.println(hs.iterator());
			print(hs.iterator());
		}
	}
	
	// print 메서드 생성함.
	private static void print(Iterator<Integer> it) {
		while (it.hasNext()) {
			Integer element = it.next();
			System.out.println(element + ",");
		}
	}
}
