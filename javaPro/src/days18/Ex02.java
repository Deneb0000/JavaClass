package days18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오전 10:36:54
 * @subject		형식화(format) 클래스
 * @content	1. SimpleDateFormat
 *			2. Decimal	 Format
 *			3. Choice 	 Format
 *			4. Message	 Format
 */
public class Ex02 {

	public static void main(String[] args) throws ParseException {
		
		/*
		Calendar c= Calendar.getInstance();
		Date d= c.getTime(); //calendar을 date로 변환시켜서 포맷에 넣을려고
		String pattern = "yyyy.MM.dd (E) hh:mm:ss";//mm = 분
		// ┌간편한 날짜 형식
		SimpleDateFormat sdf =  new SimpleDateFormat();
		String s = sdf.format(d);
		System.out.println(s);
		*/
		
//		String s = "24. 7. 24. 오전 10:47"; //날짜형태를 띈 문자열을 날짜로 바꾸기
		/*
		String s = "2024/07/24"; //날짜형태를 띈 문자열을 날짜로 바꾸기
		Date d = new Date(s);
		System.out.println(d.toLocaleString());
		*/

		String s = "2024/07/24"; //날짜형태를 띈 문자열을 날짜로 바꾸기
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf =  new SimpleDateFormat();
		Date d = sdf.parse(s);
		System.out.println(d.toLocaleString());
		
		
		//date d -> Calendar c 바꾸는 코딩
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
	} //main

} //class
