package days18;

import java.io.FileReader;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
	/*
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("입력한 연도 : "+year);
		
		
		try {
			for (int i = 1; i <= 12; i++) {
				int m = getLastDay(year, i);
				System.out.printf("%d월 : %d일\n",i,m);
			}			
		} catch (Exception e) {
		}//catch
		
		*/


//		String file = ".\\src\\days17\\Ex01.java";
//		int[][]counts = new int [3][];
//		counts[0] = new int [26];	//A
//		counts[1] = new int [26];	//a
//		counts[2] = new int [9];	//0
//		
//		try() {	
//		} catch (Exception e) {
//		}
		
		
		
	} //main
	
	private static int getLastDay(int year, int i) {
		/*
		Calendar c = Calendar.getInstance();	//오늘날짜 개체
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONDAY, Month-1);
		c.set(Calendar.DATE, 1);
		*/
		
		/*
		Calendar c = new GregorianCalendar(year, month-1,1);
		return c.getActualMaximum(Calendar.DATE); //날짜중 가장큰 날짜
		*/
		
		
		Date d = new Date(year - 1900,i -1 ,1);
		d.setMonth( d.getMonth() + 1 );
		d.setDate(  d.getDate() - 1 );

		return  d.getDate(); //31
	}


} //class
