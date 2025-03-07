package days18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex03_08 {

	public static void main(String[] args) {
		// 
		LocalDate d = LocalDate .now();
		System.out.println(d);//2024-07-24

		// [SDF], DF, CF, MF
		//2024년07월24일
		/*
		String pattern = "yyyy년 MM월 dd일" ;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String sd = dtf.format(d);
		System.out.println(sd);
		*/

		String sd = "2024년 07월 24일";
//		String sd = "2024/07/24";
//		String sd = "2024.07.24";
		/*
		String sd = "2024-07-24";
		LocalDate d2 = LocalDate.parse(sd);
		System.out.println(d2);
		*/
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d2 = LocalDate.parse(sd, dtf);
		System.out.println(d2);
		
	}

}
