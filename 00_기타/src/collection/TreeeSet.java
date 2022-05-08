package collection;

import java.util.TreeSet;

public class TreeeSet {

	public static void main(String[] args) {

		TreeSet<BoxOffice> bo = new TreeSet<>();
		bo.add(new BoxOffice(2, "배드 가이즈", "Pierre Perifel", "Animation"));
		bo.add(new BoxOffice(1, "닥터 스트레인지: 대혼돈의 멀티버스", "Sam Raimi", "Action"));
		bo.add(new BoxOffice(4, "니 부모 얼굴이 보고 싶다", "김지훈", "Drama"));
		bo.add(new BoxOffice(3, "극장판 엉덩이 탐정: 수플레 섬의 비밀", "Zako Akifumi", "Animation"));
		bo.add(new BoxOffice(5, "신비한 동물들과 덤블도어의 비밀", "David Yates", "Fantasy"));
		
		
		// 1. 전체 출력
//		for (BoxOffice boxOffice : bo) {
//			System.out.println(boxOffice);
//		}
		
		// 2. 검색 first(), last(), lower(), higher()
		System.out.println(bo.first());
//		System.out.println(bo.last());
		
		
		
	}

}
