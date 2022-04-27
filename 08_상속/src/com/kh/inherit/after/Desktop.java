package com.kh.inherit.after;

public class Desktop extends Product{
	private boolean allInOne; // 일체 여부 

	public Desktop() {
		
//		super();    // 생략되어있어도 만들어져있음. 항상 블럭내에서 맨 윗줄에 있어야함.
//		System.out.println("자식 클래스의 기본 생성자");
		
	}

	/*
	 * 부모 인스턴스 필드를 초기화할 수 있는 방법 
	 * 	1. 부모의 setter 메소드를 통해서 초기화
	 * 	  - 부모 클래스에서 setter 메소드를 제공하면 자식 객체에서 부모의 setter 메소드를 통해서 
	 * 		필드의 초기화가 가능하다. (setter는 public 접근 제한자를 갖는다.)
	 * 
	 * 	2. 부모 생성자를 호출해서 초기화 
	 *    - super를 통해서 부모의 필드, 메소드, 생성자에 접근이 가능하다.
	 *    - super([매개값, ...]}을 통해서 자식의 생성자에서 부모의 생성자를 호출할 수 있다.
	 *    
	 * 
	 * 
	 */
	
	public Desktop(String pCode, String name, String brand, int price, boolean allInOne) {
//		1. 방법 
//		super.setpCode(pCode); // 구분하기 위해 앞에 super.를 붙여도 된다.
//		setName(name);
//		setBrand(brand);
//		setPrice(price); // 사용자에게 넘겨받은 값을 부모의 setter를 이용해서 초기화.
	
//		2. 방법 (실무에서는 이 방법을 더 많이 쓴다)
		super(pCode, name, brand, price); // 갯수와 순서를 꼳 맞춰야 한다. 
		
		this.allInOne = allInOne; // 구분하기 위해 앞에 this.를 붙였다.
	}
	

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override // toString에 + super.toString() + 를 추가하여 재정의 함.
	public String toString() {
		return "Desktop [" + super.toString() + ", allInOne=" + allInOne + "]";
	}

}
