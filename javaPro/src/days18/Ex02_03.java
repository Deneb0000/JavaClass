package days18;

import java.text.ChoiceFormat;
import java.text.Format;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오전 11:21:43
 * @subject	ChoiceFormat
 * @content 형식화 클래스
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// Choice 	 Format 형식화 클래스
//		1. 특정 범위에 속하는 값을 문자열로 변화해 준다.
//		2. 불연속적인 범위의 값을 처리하는데 
//			if ,switch를  대신해서 처리할 수 잇다.
//		 예) 입력받은 국어 점수 ->수우미양가
			// 90-100 " 수"
			// 80-89 "우"
		
//		String newPattern = "0#가|60#양|70#미|80#우|90#수";
//		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		
		// 특정 범위
	      double [] limits  = {0, 60, 70, 80, 90};
	      // 문자열
	      String [] formats = { "가","양", "미", "우", "수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		int [] kors = {99, 30, 89, 77, 62};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d(%s)\n",kors[i],cf.format(kors[i]));
		}
		
	}

}
