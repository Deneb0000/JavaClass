package days09;

import java.util.Calendar;
import java.util.Date;

/**
 * @author dnb
 * @date 2024. 7. 11. - 오후 12:06:42
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 1. 요일
		// 2. 마지막날짜
		// date 클래스사용
		//	calendar 클래스 사용
		Calendar c = Calendar . getInstance() ;
		c.set(2020, 5-1, 1);
		
		// calendar c=> Date d 변환
		Date d = new Date(c.getTimeInMillis());
		System.out.println(c);
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); //요일가져옴
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay); 	//마지막 날짜 가져옴
		
		
		//date 사용
//		Date	d = new Date(2024-1900,7-1,1); // 날짜
//		System.out.println(d.toLocaleString()); // 취소선 : (버전업되면서) 곧 사라질 메소드 "다른거 써야함"
//		
//		int dayOfWeek =	d.getDay();
//		System.out.println(dayOfWeek); //요일
//		
//		//d.getMonth() 날짜 d의 월을 가져오다 마지막날짜
//		d.setMonth/*다시 설정하겠다*/(d.getMonth()+1); //set : ~을 설정하겠다
//		System.out.println(d.toLocaleString());
//		d.setDate(d.getDate()-1);	//8/1 -일 => 7월 31일
//		System.out.println(d.toLocaleString());
		
	} //main

}	//class
