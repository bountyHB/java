package com.kh.chapter3.assiststream;

import java.io.Serializable;
	// 1. 직렬화하기 위해서는 implements Serializable 추가 필요 (딱히 구현내용 없고 마커역할)
public class Member implements Serializable {
	// 2. Add generated serial version ID라는 오류가 뜨면 추가한다.(마커 역할)
	// 생략해도 컴파일 시 생성되는데, 컴파일마다 주소가 변화하기 때문에 명시적으로 우선 넣어주어야한다.
	// 직렬화 후에 역직렬화를 할 때 같은 주소여야 하기 때문이다.
	private static final long serialVersionUID = -5236124721796700179L;
	private String id;
	// transient : 직렬화에서 제외하고 싶은 필드 앞에붙이면 된다 => null로 나옴.
	private transient String pwd;
	private String name;
	private int age;
	private transient double point;
	
	
	public Member() {
	}

	
	public Member(String id, String pwd, String name, int age, double point) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.point = point;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", point=" + point + "]";
	}
	
	// getter setter 는 필요 없음
	
	
}
