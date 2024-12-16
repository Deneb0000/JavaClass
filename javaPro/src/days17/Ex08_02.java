package days17;

import java.util.Calendar;
import java.util.Date;

public class Ex08_02 {

	public static void main(String[] args) {
		// 2020 . 5
		// 1. 2020 . 5 . 1 무슨 요일?
		// 2. 마지막 날짜?
		
//		Calendar c = Calendar . getInstance();
//		Calendar c2 = Calendar . getInstance();
//		c.set(2020, 5, 1);
//		c2.set(2020, 6, 1);
//		Date d = new Date(c.getFirstDayOfWeek());
//		System.out.println(d.getDate());
//		System.out.println(d.);
		
		int year =2020;
		int month = 5;
		int date =1;
//		
		 /*
	      Date d = new Date();
	      d.setYear(year - 1900);
	      d.setMonth(month -1);
	      d.setDate(date);
	      d.setHours(0);
	      d.setMinutes(0);
	      d.setSeconds(0);
	      */


		  Date d = new Date(year - 1900,month -1 , date);
	      System.out.println(d.toLocaleString());

	      int mod = d.getDay();
	      System.out.println("일월화수목금토".charAt(mod));

	      int lastDay = 0;
	        d.setMonth( d.getMonth() + 1 );
	        System.out.println(d.toLocaleString());
	        d.setDate(  d.getDate() - 1 );
	        System.out.println(d.toLocaleString());
	        lastDay = d.getDate();
	        System.out.println(lastDay);

		

	} // main(

} //class
