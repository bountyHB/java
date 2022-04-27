package com.kh.chapter1.list.compare;

import java.util.Comparator;

import com.kh.chapter1.list.vo.Music;

public class ArtistAcending implements Comparator<Music> {

	
	/*
	 *  반환되는 정수값을 가지고 정렬의 기준을 잡는다. 
	 *    - 두 개의 매개값으로 전달된 객체를 비교한다. 
	 *    - 비교해서 같으면 0을 반환하고,
	 *      첫 번째 객체가 뒤에 있어야하면 양의 정수를 반환하고, 
	 *      첫 번째 객체가 앞에 있어야하면 음의 정수를 반환한다.
	 *    
	 */
	@Override
	public int compare(Music music1, Music music2) {
		// 앞의 매개변수가 크면 1 같으면 0 뒤가크면 -1
		// String 클래스에 구현되어 있는 compareTo() 메소드를 사용한다.
		int result = music1.getArtist().compareTo(music2.getArtist());
		// 만약 이름이 같은경우, 랭킹순으로 하고싶다면, 랭킹에서 쓴 코드를 복붙한다.
		// => 다른 클래스이기 때문에 getter로 불러옴. 
		if (result == 0) {
			result = (music1.getRanking() > music2.getRanking()) ? 1 : 
						(music1.getRanking() == music2.getRanking()) ? 0 : -1;
			}
		return result;
	}

}