package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 5:48:43
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		int year =2024;
		int month = 6;
		int date =1;

		//getDayOfWeek : 0(일)~6(토) 요일값 
		int dayOfWeek = getDayOfWeek(year, month,date);//요일을 가져오는 함수 //1(월)
		int lastDay = getLastDay(year, month);
		
		// 24.6.30(시작날짜) ~ 42일
		Calendar start = new GregorianCalendar(year, month-1,1);
		start.add(Calendar.DATE, -dayOfWeek);//현재날짜 -요일만큼
//		start.add(년, 1);
//		start.add(월, 1);

//		Calendar -> Date 형변환
//		Date -> Calendar  형변환
		Date sd =  start.getTime();
//		System.out.println(sd.toLocaleString()); //지난달마지막일수
		
		System.out.println("=".repeat(50));
		System.out.println("=".repeat(50));
		for (int i = 1; i <= 42; i++) {
			int cmonth = start.get(Calendar.MONTH)+1;
			if(cmonth==month+1)System.out.printf("[%d]\t", start.get(Calendar.DATE));
			 else if(  cmonth == month-1 ) System.out.printf("(%d)\t", start.get(Calendar.DATE));
	         else System.out.printf("%d\t", start.get(Calendar.DATE));

			//			System.out.println(start.toLocaleString());
			
			if(i % 7 ==0) System.out.println();
			start.add(Calendar.DATE, 1);
		}
		System.out.println();
		System.out.println("=".repeat(50));
	}

	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1,1);
		return c.getActualMaximum(Calendar.DATE); //날짜중 가장큰 날짜
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Calendar c = new GregorianCalendar(year, month-1,1);
		return c.get(Calendar.DAY_OF_WEEK)-1;
		
	} //main


}
