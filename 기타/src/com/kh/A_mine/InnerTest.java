package com.kh.A_mine;
class AAA { // AAA는 BBB의 외부 클래스 
	int i = 100;
	BBB b = new BBB();
	
	class BBB {     //BBB 는 AAA의 내부 클래스 
		void method () {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근가능
		}	
	}
}

class CCC {
//	BBB b = new BBB();  여기서는 BBB를 사용할 수 없다.
}

public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();  여기서는 BBB를 사용할 수 없다.
//		b.method(); 
		AAA a = new AAA();
		System.out.println(a.i);

	}
}
