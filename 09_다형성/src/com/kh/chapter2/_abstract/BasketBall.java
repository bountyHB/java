package com.kh.chapter2._abstract;

public class BasketBall extends Sports {

	// constructors
	public BasketBall() {
	}
	
	// generate constructors from superclass 
	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	// class 생성시 superclass 선택. 
	@Override
	public void rule() {
		System.out.println("BasketBall 선수의 수는 " + super.getNumberOfPlayers() + 
						   "명, 공을 던져서 링에 넣어야한다.");
	
	}
	
}
