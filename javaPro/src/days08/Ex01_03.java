package days08;

import java.util.Random;

public class Ex01_03 {

	public static void main(String[] args) {
		new Random()		//**암기
			.ints(1, 46)		//  1~45 정수
			.distinct()			// 중복제거
			.limit(6)			// 6개(수 아님)
			.forEach(System.out::println);	//메서드 참조
				// forEach ( lotto -> system. out. println(lotto)
	}

}
