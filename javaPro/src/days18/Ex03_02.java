package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 12:13:18
 * @subject	LocalDate의 객체생성
 * @content	날짜와 시간
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		LocalDate/*날짜만*/ ld = LocalDate. now();
//		System.out.println(ld.toString());
		LocalDate ld2 = LocalDate.of(2024, 7, 24);
		System.out.println(ld2);
	
	
		LocalTime lt = LocalTime .now();
		System.out.println(lt); //12:16:59.650163800
		LocalTime lt2 = LocalTime .of(12, 16, 32); //시간, 분, 초
		System.out.println(lt2);

		LocalDateTime ldt = LocalDateTime .now();
		System.out.println(ldt); //2024-07-24T12:18:34.785664400
		
		LocalDateTime ldt2 = LocalDateTime .of(ld, lt);
		System.out.println(ldt2);
		
	} //main

} //class
