package days17;

import java.util.Date;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 3:46:02
 * @subject	달력만들기2
 * @content
 *
 */
public class Ex08_03 {

	public static void main(String[] args) {
		int year =2024;
		int month = 6;
		int date =1;

		int dayOfWeek = getDayOfWeek(year, month,date);//요일을 가져오는 함수 //1(월)
		int lastDay = getLastDay(year, month);
		
		// 24.6.30(시작날짜) ~ 42일
		Date start = new Date(year - 1900,month -1 ,1);
		start.setDate(start.getDate()-dayOfWeek);
//		System.out.println(start.toLocaleString()); //출력체크문
		
		System.out.println("=".repeat(50));
		System.out.println("=".repeat(50));
		for (int i = 1; i <= 42; i++) {
//			System.out.println(start.toLocaleString()); //출력체크문
			int cmonth = start.getMonth()+1;
			if(cmonth==month+1)System.out.printf("[%d]\t", start.getDate());
			 else if(  cmonth == month-1 ) System.out.printf("(%d)\t", start.getDate());
	         else System.out.printf("%d\t", start.getDate());

			//			System.out.println(start.toLocaleString());
//			System.out.printf("%d\t", start.getDate());
			if(i % 7 ==0) System.out.println();
			start.setDate(start.getDate()+1);
		}
		System.out.println();
		System.out.println("=".repeat(50));
	}

	private static int getLastDay(int year, int month) {
		Date d = new Date(year - 1900,month -1 ,1);
		d.setMonth( d.getMonth() + 1 );
		d.setDate(  d.getDate() - 1 );

		return  d.getDate(); //31
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year - 1900, month -1 , date);
		return d.getDate(); // (일)0~(토)6
	} //main

} //class
