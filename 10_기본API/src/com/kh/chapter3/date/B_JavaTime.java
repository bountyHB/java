package com.kh.chapter3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B_JavaTime {
	public void method1() {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2022, 4, 19, 9, 40);
		System.out.println(ZonedDateTime.now()); // 2022-04-19T10:07:34.858653+09:00[Asia/Seoul]
		
		System.out.println(now);
		System.out.println(when);
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
 		System.out.println(now.getDayOfYear());
 		System.out.println();
 		
 		LocalDateTime plusDays = now.plusDays(1);
 		LocalDateTime minusMonth = now.minusMonths(2);
 	
 		System.out.println(now);
 		System.out.println(plusDays);
 		System.out.println(minusMonth);
 		System.out.println();
 		
 		// 날짜비교 
 		System.out.println(now.isAfter(plusDays));    // false 
 		System.out.println(now.isBefore(plusDays));   // true 
 		System.out.println(now.isAfter(minusMonth));  // true 
 		System.out.println(now.isBefore(minusMonth)); // false 
 		System.out.println();
 		
// 		LocalDate localDate = LocalDate.now();
// 		LocalDate localDate = LocalDate.of(2022,9,30);
 		LocalDate localDate = now.toLocalDate(); // 날짜 정보만 가져올수있음. 
 		
 		
// 		LocalTime localTime = LocalTime.now();
// 		LocalTime localTime = LocalTime.of(9,30,50);
 		LocalTime localTime = now.toLocalTime(); // 시간 정보만 가져올수있음. 
 		
 		System.out.println(localDate); // 2022-04-19
 		System.out.println(localTime); // 10:12:02.596534 
 		System.out.println();
 		
 		// 문자열을 LocalDate 객체로 파싱 
// 		LocalDate parse = localDate.parse("2022-09-30");
// 		LocalDate parse = localDate.parse("20220930"); // error
 		// 이런식으로 포맷을 지정하는것도 가능하다.
// 		localDate = LocalDate.parse("20220930", DateTimeFormatter.ofPattern("yyyyMMdd"));
 		localDate = LocalDate.parse("20220930", DateTimeFormatter.BASIC_ISO_DATE);
 		
 		System.out.println(localDate); // 2022-09-30
 		System.out.println();
 		
 		
 		// LocalDateTime 객체를 문자열로 변환 
 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
 		
 		System.out.println(now.toString()); // 2022-04-19T10:33:47.383659
 		System.out.println(now.format(formatter)); // 2022년 04월 19일 10시 33분 47초
 		
 		formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
 		System.out.println(now.format(formatter)); // 2022-109 
 		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE)); // 2022-W16-2
// 		System.out.println(now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)); // error
 		
 	
		
	}
}
