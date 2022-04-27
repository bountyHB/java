package com.kh.chapter2.set.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Music implements Comparable<Music>{
	private String title;
	private String artist;
	private int ranking;
	
	@Override
	public int compareTo(Music music) {
		// 랭킹 순서대로 정렬하는 코드
		return (this.ranking > music.ranking) ? 1 : (this.ranking == music.ranking) ? 0 : -1;
	}
}
