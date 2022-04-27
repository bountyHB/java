package com.kh.A_mine;

// 추상 클래스 Unit2
abstract class Unit2 { 
	int x, y;
	abstract void move (int x, int y);
	void stop () {System.out.println("멈춥니다.");}
}
// 인터페이스 Fightable
interface Fightable { // 인터페이스의 모든 메서드는 public abstract
	public void move(int x, int y);  // public abstract가 생략됨 
	public void attack(Fightable f); // public abstract가 생략됨 
	}
// 추상 클래스 Unit2과 인터페이스 Fightable를 상속받느s class Fighter
class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙 :조상(public)보다 접근제어자가 범위가 좁으면 안된다. 
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter gf = new Fighter(); // new 앞에 (Fightable)이 생략 Fighter를 생성해서 반환 
		return gf; //(Fightable)이 생략 
	}
}

public class Fightertest {
	public static void main(String[] args) {
		Fighter gf = new Fighter();
		Fightable f2 = gf.getFightable();
		
		Unit2 u = new Fighter();
		Fightable f = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter()); // Unit2에는 attack()이 없어서 호출 불가
		u.stop();
		
		f.move(200, 400);
		f.attack(new Fighter());
//		f.stop(); // Fightable에는 stop()이 없어서 호출불가 
		
	}
}
