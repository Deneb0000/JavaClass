package days17;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		// jdk 1.0	java.util.Date 클래스
		//						ㄴjava.sql.Date;
		
		// jdk 1.1 	java.util.Calendar 클래스
		Calendar c = Calendar.getInstance(); //그래골리안 캘린더로 객체 생성가능
//		System.out.println(c.toString());
		//년
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		//월
		System.out.println(c.get(Calendar.MONTH)+1);
		//일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//시간
		System.out.println(c.get(Calendar.HOUR));		//	1-11 	12시간
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//0-11 24시간
		//분
		System.out.println(c.get(Calendar.MINUTE));
		//초
		System.out.println(c.get(Calendar.SECOND));
		//밀초
		System.out.println(c.get(Calendar.MILLISECOND));
		//요일
		//date 0(일) 1(월) 2(화)  . . . 6(토)
		//Calendar 1(일) 2(월) 3(화) . . . 7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//마지막 날짜
		
		
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.AM_PM));

	} // main

} //class
