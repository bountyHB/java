package collection.practice;

import java.util.HashSet;

import collection.Info;

public class Practice02 {

	public static void main(String[] args) {
		HashSet<Info> infos = new HashSet();
		
		Info info1 = new Info("홍길동", 20);
		Info info2 = new Info("김삿갓", 30);
		Info info3 = new Info("이산", 40);
		Info info4 = new Info("홍길동", 20);
		
		System.out.println(info1 == info4); // false
		System.out.println("==");
		
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		
		for (Info info : infos) {
			System.out.println(info);
		}
		/* 중복값임에도 HashSet 에는 넣어졌다.
		 Info [name=홍길동, age=20]
		 Info [name=김삿갓, age=30]
		 Info [name=이산, age=40]
		 Info [name=홍길동, age=20]
		 */
		
		/*
		 * HashSet에서는 데이터 중복을 확인할때 
		 * 1. hashcode로 확인 후 중복값이라 확인되면 
		 * 2. 다시 equals로 확인하게 된다. 
		 * 따라서 위 메소드를 오버라이딩 하지 않았다면, 다른 데이터라 판단하게 된다.
		 * => Integer 나 String 같은 경우엔, 클래스 내에서 오버라이딩 되어있어 상관없다.
		 */
	}
}
