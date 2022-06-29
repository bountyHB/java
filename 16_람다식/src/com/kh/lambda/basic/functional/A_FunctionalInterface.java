package com.kh.lambda.basic.functional;

@FunctionalInterface
public interface A_FunctionalInterface {
	// 매개변수와 반환값이 없는 추상 메소드 
	public void method();

//	어노테이션을 붙이면 오류가 나게 된다.
//	어노테이션을 붙이지 않고 메소드가 추가되면 다른 곳에서 람다식 사용이 불가능해진다. 
//	(함수적 인터페이스가 아니기 때문에)
//	public void otherMethod();
}
