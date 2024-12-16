package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오전 11:06:40
 * @subject		DecimalFormat
 * @content		숫자 형식화 
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws ParseException {
		// DecimalFormat
		/*
		int money = 3276500;	//"3,276,500" 3자리마다 , 찍고싶으면 문자열로 바꿔야한다
		String smoney = String.format("%,d", money);
		System.out.println(smoney); 	//3,276,500
		*/
		
		/*
		int money = 3276500;
//		String pattern = "#,###"; //3자리마다 ,를 찍겠다
//		String pattern = "#,###.00"; //3자리마다 ,를 찍겠다
		String pattern = "\u00A4#,###.00"; //\u00A4를 붙히겠다 //₩3,276,500.00
		DecimalFormat df = new DecimalFormat(pattern);
		String smoney = df.format(money);
		System.out.println(smoney);
		*/
		
		String s = "3,123.23";
		/*
		s =s.replace(",", ""); //, 제거
		System.out.println(s);
		double d = Double.parseDouble(s);
		System.out.println(d);
		*/
		
		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		double d = (double) df.parse(s);
		System.out.println(d);
		
		
		
		
		
	} //main

} //class
