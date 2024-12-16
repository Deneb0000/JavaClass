package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 12:26:24
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld); //2024-07-24
		//년
//		int year = ld.get(ChronoField.YEAR);
		int year = ld.getYear();
		System.out.println(year);
		//월
//		int month = ld.get(ChronoField.MONTH_OF_YEAR);
		int month = ld.getMonthValue();
		System.out.println(month);
		//일
//		int date = ld.get(ChronoField.DAY_OF_MONTH);
		int date = ld.getDayOfMonth();
		System.out.println(date);
		//요일
//		int day = ld.get(ChronoField.DAY_OF_WEEK);	//월1 ~일7
													//Date 일(0)~토(6)
													//Calendar 일(1) ~ 토(7)
		DayOfWeek day = ld.getDayOfWeek();
		System.out.println(day);	//WEDNESDAY			↑
		System.out.println(day.getValue()); //3 //getValue() : 수치 알려줌
		
		//시간정보
		LocalTime lt = LocalTime.now();
		//시
//		int h = lt.get(ChronoField.HOUR_OF_DAY);
		int h = lt.getHour();
		System.out.println(h);
		//분
//		int m = lt.get(ChronoField.MINUTE_OF_HOUR);
		int m = lt.getMinute();
		System.out.println(m);
		//초
//		int s = lt.get(ChronoField.SECOND_OF_MINUTE);
		int s = lt.getSecond();
		System.out.println(s);
		 // 밀리초
	      int ms = lt.get(ChronoField.MILLI_OF_SECOND);
	      System.out.println(ms);

		//나노
	      int ns = lt.getNano();
	      System.out.println( ns );
	} //main

} //class
