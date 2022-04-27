package com.kh.chapter1;

import com.kh.chapter1.encapsulation.Student;

public class Application {
	/*
	 * 추상화 캡슐화
	 * 
	 * 1. 추상화
	 *  - 프로그램에서 사용할 객체들이 가진 공통의 특성을 파악하고 불필요한 특성을 제거하는 과정을 말한다.
	 *  - 최종적으로는 선정된 속성들을 가지고 어떠한 자료형으로,
	 *    어떠한 필드명으로 사용할지 정리해서 코드로 작성하는 것을 말한다.
	 *  
	 * 2. 캡슐화
	 *  - 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법을 말한다. 
	 *  - 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것을 말한다. 
	 *  - 객체의 데이터에 직접 접근을 막고, 
	 *    데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공하는 방법을 말한다.  
	 *  
	 */
	
	public static void main(String[] args) {
		
		// 문인수 학생 객체 만들기
		int sNum1 = 1001;
		String name1 = "문인수";
		int age1 = 20;
		int math1 = 90;
		int eng1 = 80;
		int sum1 = (math1 + eng1);
		double avg1 = (sum1 / 2);
		
		// 홍길동 학생 객체 만들기
		int sNum2 = 1001;
		String name2 = "홍길동";
		int age2 = 28;
		int math2 = 70;
		int eng2 = 65;
		int sum2 = (math2 + eng2);
		double avg2 = (sum2 / 2);
	
		// Student 클래스를 new 연산자를 통해서 Heap 영역에 인스턴스(객체)로 생성 
//		Student moon = new Student(); // 인스턴스 (객체) 셍성
//		Student hong = new Student();  
		
		// 필드에 직접 접근해서 초기화 
//		moon.sNum = 1001;
//		moon.name = "문인수";
//		moon.age = 20;
//		moon.math = 90;
//		moon.eng = 80;
//		
//		hong.sNum = 1002;
//		hong.name = "홍길동";
//		hong.age = 28;
//		hong.math = 70;
//		hong.eng = 65;
		
		// 필드에 직접 접근해서 값을 출력 
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
//				moon.name, moon.math, moon.eng, moon.sum(), moon.avg());
//		
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
//				hong.name, hong.math, hong.eng, hong.sum(), hong.avg());
		
		// encapsulation 을 import
		Student moon = new Student();
		Student hong = new Student();
		
		/*
		 * 잠깐 tips
		 * 같은 student 이름을 다진 abstraction의 클래스를 사용하고 싶을때...
		 * 패키지 이름까지 다 적어서 불러온다.
		 * 동일한 이름의 클래스는 동시에 import 를 할 수 없기 때문이다.
		 */

//		com.kh.chapter1.abstraction.Student moon2 = new com.kh.chapter1.abstraction.Student();
		
		// encapsulation이 된 moon 클래스는 이전처럼 시도해봐도 아무런 메소드가 입력되지 않는다.
		// private 는 encapsulation 클래스 내에서만 사용가능하기 때문이다.
		// getter 나 setter 를 이용하여 간접적으로 접근이 가능하다.
		
		// 아래와 같이 직접 접근이 불가능하다.
//		moon.sNum = 1001;
//		moon.name = "문인수";
//		moon.age = 20;

		// 캡슐화 작업으로 인해 필드에 직접 접근을 막았다면 간접적으로 접근을 할 수 있도록 메소드를 제공한다.
		
		// setter 사용하여 입력
		moon.setsNum(1001);
		moon.setName("문인수");
		moon.setAge(20);
		moon.setMath(90);
		moon.setEng(80);
		
		hong.setsNum(1002);
		hong.setName("홍길동");
		hong.setAge(28);
		hong.setMath(80);
		hong.setEng(65);
		
		// getter 사용하여 출력
		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
		moon.getName(), moon.getMath(), moon.getEng(), moon.sum(), moon.avg());

		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
		hong.getName(), hong.getMath(), hong.getEng(), hong.sum(), hong.avg());		
		
		// getter 없이 사용 가능하다.
		System.out.println(moon.information()); 
	
	}
	
	
	
	

}