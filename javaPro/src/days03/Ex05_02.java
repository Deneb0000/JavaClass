package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 3:32:59
 * @subject		산술연산자 설명			1)산술연산자	:	+
 * @content		+	-	*	/	%:나머지를 구하는 연산자
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 주의할 점
		// 1. 정수 / 0
		// java.lang.ArithmeticException : / by zero	산술적 예외가 발생했다 
//		System.out.println(10/0);
		// 2. 실수(소수) / 0		Infinity 
//		System.out.println(10.0/0);
//		System.out.println( Double.isInfinite (10.0/0));	//is : 묻는것
		//		실수 % 0	NaN = Not a Number 리터럴
//		System.out.println(10.0 % 0);
//		System.out.println( Double.isNaN (10.0%0));

		
		int i = 10, j = 3;
		System.out.println( i + j ); // 13
		System.out.println( i - j ); // 7
		System.out.println( i * j ); // 30
		System.out.println( i / j ); // 3	몫을 구하는 연산자		int 연산이라서 소숫점x
		System.out.println( i % j ); // 1	나머지를 구하는 연산자	int 연산이라서 소숫점x
		System.out.println( (double) i / j ); // 3.33333...	

		
		
	}

}
