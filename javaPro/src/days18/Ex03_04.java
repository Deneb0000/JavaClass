package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 2:04:20
 * @subject 	8. 특정 필드(년,월,시,분 등등)를 수정할때 사용하는 메소드
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// String 불변특징
//		String a = "xyz";
//		String b = a.replace('y','와');
//		System.out.println(a);
//		System.out.println(b);
		
		// j.t 핵심클래스 불변 
		// 1) with(), .withXXX
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);	//2024-07-24
		
		ld = ld.withYear(2020);	//연도바꿈
		System.out.println(ld);
		
		ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld);
		
		//월 12 수정
		ld = ld.withMonth(5);
		ld.with(ChronoField.MONTH_OF_YEAR, 12);
		System.out.println(ld);
		
		//5달 빼기
		ld.minusMonths(5);
		System.out.println(ld);
		ld = ld.plusMonths(5);
		System.out.println(ld);
		
		// truncatedTo() : 절삭하다, 끝을 잘라내다
		LocalTime lt = LocalTime.now();
		System.out.println(lt); //14:13:49.923487800
		//시간 보다 작은 단위를 모두 절삭
		lt = lt.truncatedTo(ChronoUnit.HOURS);
		lt = lt.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(lt);
		
		//날짜 + 시간
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); //2024-07-24T14:16:50.010639600
		
		dt=dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt); //2024-07-24T00:00

		
	}

}
