package com.kh.chapter1.encapsulation;

// 캡술화 적용 후 
public class Student {
	// 필드 (속성)
	// 캡슐화를 적용시키기 위해서 접근 제한자를 private으로 변경한다.
	private int sNum; // 학번 
	private String name; // 이름 
	private int age; // 나이 
	private int math; // 수학점수  
	private int eng; // 영어점수  
	
	// 메소드 (기능) -> 데이터가 아닌 기능이기 때문에 public 상태로 둔다.
	public int sum() {
		return math + eng;  // 반환하는 값 
	}
	
	public double avg() {
		return (sum() / 2.0); // 같은 클래스내에 sum이 있기에 바로 호출가능하다.
	}

	/*
	 * 1. Getter 메소드
	 *  - 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용해야 한다.
	 *  - 하나의 필드의 값을 반환해 주는 기능을 하는 메소드이다.
	 *  - 메소드 이름은 getXXX와 같이 붙여주게 된다. (카멜케이스로 작성해야 한다.)
	 *  - 필드값을 반환해주기 때문에 매개값이 필요가 없.
	 *  - 필드값을 반환해야기 때문에 반환하려는 필드의 값의 자료형이 반환형으로 와야한다.
	 *  
	 *  
	 * 2. Setter 메소드 
	 *  - 외부에서 접근이 가능해야 하기 때문에 접근 제한자를 public으로 사용해야 한다.
	 *  - 검증된 유효한 값만 데이터로 저장하는 역할을 한다.
	 *  - 메소드 이름은 setXXX와 같이 붙여주게 된다. (카멜케이스로 작성해야 한다.)
	 *  - 별도의 반환형이 필요하지 않다.
	 * 
	 */
	
//	public int getsNum() { // getSNum 메소드를 수행하면 필드값을 외부에다가 전달해주는 역할을 해야함 
//		                   // 반환하고자 하는 값을 가지고 있는 필드의 자료형인 int로 적는다. 
//		return sNum; 	   // 여기선 sNum이 하나이므로 자동적으로 필드를 가르키게 된다.(this를 붙여도 상관없다)
//	}
//	
//	public void setsNum(int sNum) { // 외부에서 값을 받아다가 필드의 값을 수정하는 역할. -> 반환하는 값이 없다.
//									// 매개값(그쪽에서 보내는 값)을 받아올 변수(매개변수)를 괄호안에 적는다.
//			this.sNum = sNum; // 들어온 값을 필드로 back. 
//			// 필드에 있는 변수와 매개변수의 이름이 동일하면, 블럭 안에서 사용된 매개변수가 우선이다. 
//			// 그래서 필드의 sNum 앞에 this. 를 붙여준다. (this. => 객체자신이라는 뜻.)
//	}
//	//getter, setter 를 만드는것이 귀찮다면 자동으로 만드는 방법이 있다.
//	//1. 마우스 우클릭 -> source -> generate getters setters
	
	
	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age >= 1) ? age : 1; // 삼항연산자.(age >= 1) ? age : 1 로 조건을 걸다.
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math >= 0) {
			if (math > 100) {
				this.math = 100;	
			} else {
				this.math = math;
			}
		}else {
			this.math = 0;
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = (eng >= 0) ? eng : 0;
	}
	
	
	
	public String information () { // 객체에 대한 정보를 문자열로 만들어서 주는 메소드.
		return "학번 : " + this.sNum + ", 이름 : " + this.name + ", 수학 점수 : " + this.math +
				", 영어 점수 : " + this.eng + ", 총점 : " + this.sum() + ", 평균 : " + this.avg();
	}
	
	
	
	
	
	
	
	
}
