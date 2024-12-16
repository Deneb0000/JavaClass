package days17;

import java.util.Date;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 3:14:58
 * @subject 날짜 + 시간을 다루는 클래스
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. 날짜 + 시간을 다루는 클래스, 형식화 클래스
		 * 	jdk 1.0 java.util.Data
		 * 	jdk 1.1 java.util.Calendar
		 * 						ㄴ GregorianCalendar
		 * 	jdk 1.8	java.tim 패키지 + 하위 패키지
		 * 				다양한 날짜/시간 클래스 추가.
		 * 
		 * 2. 컬렉션 프레임워크
		 * 3. 자바 IO(입출력)
		 * 4. 열거형, 제네릭
		 * 월/화/수 + 목
		 * 5. 람다식 + 스트림
		 * */

		
		
		Date d = new Date();
		
		Date d2 = new Date(	d.getTime() );
		System.out.println(d2.toLocaleString());
		
		
		//1900.1.1 00:00:00~ ms long 형으로 반환하는 메서드
//		//d.getTime();
		
		//년, 월, 일, 시간, 분, 초 ,ms
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getHours()); //시간
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDay());	//0일요일 ~6토요일
		
		System.out.println(d.toString());
		System.out.println(d); 
		System.out.println(d.toLocaleString()); //Local~ : 그 지역
		System.out.println(d.toGMTString()); 
		
	}//main

}//class
