package days17;

import java.util.Date;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 4:21:12
 * @subject	날짜간 계산하기
 * @content
 *
 */
public class Ex08_04 {

	public static void main(String[] args) {
		// 개강일로부터 지금(현재)까지 지난 일수 계산.
		Date o = new Date(2024-1900, 7-1, 1, 9, 0, 0);
		//2024. 7. 1. 오전 9:00:00
		//System.out.println(o.toLocaleString());
		Date t = new Date();
//		System.out.println(t.toLocaleString());

		long diffMs =  t.getTime() - o.getTime(); // 두 날짜 사이의 차이
//		System.out.println(diffMs + "ms");
//		System.out.println(diffMs/1000 + "s");
//		System.out.println(diffMs/1000/60 + "m");
//		System.out.println(diffMs/1000/60/60 + "h");
//		System.out.println(diffMs/1000/60/60/24 + "d");
		
		//?
//		long d = (diffMs/1000/60/60/24);
//		long h = /1000/60/60
//		/1000/60
//		s/1000
		
		d_day(t,o);
		
		

	}	//main

	private static void d_day(Date t/*오늘날짜*/, Date o/*개강한날짜*/) {
		long diffMs =  t.getTime() - o.getTime();
		
		long [] tArr = {1000*60*60*24, 1000*60*60,1000*60, 1000};
		
		
		long d = diffMs / (1000*60*60*24);
		diffMs = diffMs % (1000*60*60*24);
		System.out.print(d+"d ");

		long h = diffMs / (1000*60*60);
		diffMs = diffMs % (1000*60*60);
		System.out.print(h+"h ");
		
		long m = diffMs / (1000*60);
		diffMs = diffMs % (1000*60);
		System.out.print(m+"m ");
		
		long s = diffMs / (1000);
		long ms = diffMs = diffMs % (1000);
		System.out.print(s+"s: "+ms+"ms");
		
		try {
	         System.out.println("\n\n\n\n");
	         Thread.sleep(10);
//	         d_day(new Date() ,o); //재귀함수
	         
	      } catch (InterruptedException e) { 
	         e.printStackTrace();
	      }
	}

}	//class
