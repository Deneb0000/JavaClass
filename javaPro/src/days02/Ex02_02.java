package days02;

/**
 * @author dnb
 * @date 2024. 7. 2. - 오전 11:48:19
 * @subject    변수와 [상수]
 * @content
 *
 */
public class Ex02_02 {

	
	public static void main(String[] args) {
//		String name; //스트링 이름 변수선언 
		
		//ex 수학 관련 코딩.
		//자바 문자열 타입 : String
		//자바 실수 타입 : float, double
		//자바 상수 선언 			*상수는 다른값으로 할당x 변수는 다른값으로 할당o
		final/*상수화*/ double/*실수형 자료형*/ PI/*상수는 모두 대문자로 작업*/ = 3.141592;
		System.out.println(PI+100);
		System.out.println(PI+100);
		System.out.println(PI+100);
		System.out.println(PI+100);
		
//		The final local variable pi cannot be assigned. It must be blank and not using a compound assignment
		//final 로 지정된 PI값은 바꿀수 없다
		//		PI = 3.14;
		
		System.out.println(PI+100);
		System.out.println(PI+100);
		System.out.println(PI+"100");

	}

}
