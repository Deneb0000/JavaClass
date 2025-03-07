package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03_06 {

	public static void main(String[] args) {
		//
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//LocalDateTime -> LocalDate, LocalTime
		LocalDate d2 = dt.toLocalDate();
		LocalTime t2 = dt.toLocalTime();
				
		// LocalDate + LocalTime => LocalDateTime 
		LocalDateTime dt2 = d.atTime(t);
		LocalDateTime dt3 = t.atDate(d);
		
		
		
	} //main

} //class
