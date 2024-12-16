package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex03_09 {

	public static void main(String[] args) {
		// Period = 날짜 - 날짜
		// Duration = 시간 - 시간
		// 예) 수료일 - 오늘날짜 = 날짜 간격?
		LocalDate ed = LocalDate.of(2024, 12, 14+1);	//+1 Period가 수료날짜를 포함하지않아서
		LocalDate td = LocalDate.now();
		Period p = Period.between(td, ed);
		System.out.println(p); // P4M21D 4달 21일 남았다는 뜻
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		//  18: 0 : 0 퇴근 시간까지의 남은 시간 파악 
		LocalTime et = LocalTime.of(18, 0);
		System.out.println(et);	//18:00
		LocalTime tt = LocalTime .now();
		System.out.println(tt);
		Duration d = Duration.between(tt, et);
		System.out.println(d);
		System.out.println(d.getNano());
		System.out.println(d.getSeconds()/60); //분
		System.out.println(d.getSeconds()/60/60); //시간
		System.out.println(d.toHoursPart()); //시간
		
		
		
	}

}
