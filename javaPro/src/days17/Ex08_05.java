package days17;

import java.util.Date;

public class Ex08_05 {

	public static void main(String[] args) {
		// 설문조사
		// 시작일 24.6.25 9:00:00
		// 종료일 24.7.25 18:00:00
		Date start = new Date(2024-1900, 6-1, 25, 9, 0, 0); //설문조사 오픈
		Date end = new Date(2024-1900, 7-1, 25, 18, 0, 0);	// 설문조사 끝
		
		// 1. 24.6.20 12:00:00 	설문시작 전 투표x
		// 2. 24.7.20 12:00:00	설문 진행 중
		Date t1 = new Date(2024-1900, 7-1, 20, 12, 0, 0);	// 설문조사 끝
		
//		if( start.getTime() > t1.getTime()) 전
//		else if( end.getTime() < t1.getTime()) 후
//		else 진행중
		
		// 3. 24.7.25 19:00:00	설문종료 후 투표x
		// 4. 24.8.20 12:00:00	설문종료 후 투표x
		// long tim 으로 
		
//		t1.after(when);	>
//		t1.before(end)	<	날짜 지났냐 안지났냐의 함수
//		t1.equals(start) = 	오버라이딩
		
		
 	} //main

} //class
