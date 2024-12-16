package days09;

import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 11. - 오전 9:41:42
 * @subject	만년	달력
 * @content	년도, 월 입력
 *
 */
public class Ex01 {

	public static void main(String[] args) {


		int year,month;
		
		Scanner scanner = new Scanner(System.in);
		int [] ymArr = getInputYM(scanner);	//년도와 월을 가지고 있는 배열 생성
		
		year = ymArr[0];
		month = ymArr[1];
		
		printCalendar(year, month);
	
	}	//main

	public static void printCalendar(int year, int month) {
		
		int dayOfWeek = getDayOfWeek(year, month, 1); // 요일을 얻어오는 함수
		int lastDay = getLastDay(year, month);
		
		/*
				24.07
		-----------------------
		일	월	화 수 목  금  토 
		-----------------------
		1	2	3	4	5	6
		7						13
		14						20
		21						27
		28			31
		-----------------------
		1) 년 월 1일 무슨요일(시작 요일)?	1일-월요일
		2) 년 월 마지막날짜 몇 일 (마지막 날짜)? 31		
*/
		System.out.printf("\t\t\t[%d년 %d월]\n",year, month);
		System.out.println("-".repeat(55));
		String strWeek = "일월화수목금토";
		for (int i = 0; i < strWeek.length(); i++) {
			System.out.printf("\t%c", strWeek.charAt(i));
		}
		System.out.println();
		System.out.println("-".repeat(55));
		//날짜출력
		//공백찍는 for문 : 1의 위치를 잡기 위한
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("\t");
		}
//		System.out.printf("\t%d", 1);
		
			for (int i = 1; i <= lastDay; i++) {
				System.out.printf("\t%d",i);
				if( (dayOfWeek + i ) %7==0 ) System.out.println();
					//dayOfWeek  = 요일만큼공백
			}
		System.out.println();
		System.out.println("-".repeat(55));
		}

	private static int getLastDay(int year, int month) {
		int lastDay=0;
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months [month-2];
		if (Ex02.isLeapYear(year) && month == 2)  lastDay ++;
	
	/*
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay=31;
			break;
		case  4: case 6: case 9: case 11:
			lastDay=30;
			break;
		case 2:
			lastDay = Ex02.isLeapYear(year)? 29 : 28 ;
			break;
		}
		*/
		
		return lastDay;
	}

	private static int getDayOfWeek(int year, int month, int day) {
		//	2020.	5.	1
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays%7; // 0 일 ~6 토요일
		
		System.out.printf("%d. %d. %d [%d]일 (%c요일) \n", year, month, day, totalDays
				, "일월화수목금토".charAt(dayOfWeek));
				
		return dayOfWeek;
	}	//getDayOfWeek

	private static int getTotalDays(int year, int month, int day) {
		// 1. 1 .1 ~ 2020.5.1
		//	365(366) * (2020-1) + 31+28(29)+31+30+1
		// year (2020) 이전 년도 까지의 총날짜수
		int totalDays = 0;
		for (int i = 1; i < year; i++) {
			totalDays += Ex02.isLeapYear(i) ? 366 : 365;
		}
		// 5 					  1월													12월
		// 인덱스값		 		0	 1	 2	  3 	4								11
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1 ; i++) {
			totalDays += months[i];
		}
		if (Ex02.isLeapYear(year)&&month>=3) totalDays++;
		
		totalDays++;
		
		return totalDays;
	}

	private static int[] getInputYM(Scanner scanner) {	//리턴타입이 배열 (두개 이상?)
		System.out.print("년도 월 입력 ?");
		
		int [] ymArr=new int [2];
		
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		ymArr[0] = year;
		ymArr[1] = month;

		return ymArr;
	} //getInputYM

}	//class
