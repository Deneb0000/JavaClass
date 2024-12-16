package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오전 10:26:39
 * @subject		
 * @content		(암기)
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		// 소숫점 4번째 자리에서 반올림한 실수값을 얻어오고 싶다.
		// 3.142
		//.1
		//System.out.printf("%.3f",pi);

		//.2
		//String strPi = String.format("%.3f", pi);
			// String -> double	타입 변환
//		
		//.3 알고리즘 문법
		int iPi = (int) (pi * 1000 + 0.5);
		System.out.println((double)iPi/1000 );
	}

}
