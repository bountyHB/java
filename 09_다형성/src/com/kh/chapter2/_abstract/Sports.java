package com.kh.chapter2._abstract;

public abstract class Sports {
	
	// field 
	private int numberOfPlayers; // 참여하는 사람의 수

	// constructor
	public Sports() {
	}

	// field constructor
	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	// getter setter 
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	// 추상 메소드로 스포츠마다 적용될 룰 만들기 (자식 클래스에서 재정의할 예정) 
	public abstract void rule(); // 몸체없이 선언부만 존재.
	
	// 기존 클래스의 메소드. 
//	public void rule() {
//		System.out.println("스포츠는 룰이 존재한다.");
//	}

	
}
