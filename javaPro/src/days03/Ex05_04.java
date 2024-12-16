package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 3:56:00
 * @subject		논리연산자
 * @content		참 / 거짓
 *					1)일반 논리 연산자
 *						ㄱ. &&	일반논리 AND연산자 (논리곱연산자)
 *						두 피연산자가 모두 참일 때만 참이 된다.
 *						true && true => true
 *						true && false => false
 *						false && true => false
 *						false && false => false
 *			
 *						ㄴ. ||		일반논리 OR 연산자
 						둘 다 거짓이면 거짓이다.
 						true || true => true
 						true || false => true
 						false || true => true
 						false || false => true
 
 *						ㄷ. !		부정연산자 or NOT연산자
 *						!참 = > 거짓
 *						!거짓 => 참
						
 *					2)비트 논리 연산자
 						ㄱ. &	비트논리 AND 연산자
 						ㄴ.|	비트논리 OR 연산자
 						ㄷ.^	XOR 연산자		== e[X]clusive 배타적인
 						ㄹ.~	틸드연산자	(비트부정연산자) *단항연산자
 */
public class Ex05_04 {

	public static void main(String[] args) {
	
		//The operator ! is undefined for the argument type(s) int
		// > (비교연산자)가 !(논리)연산자보다 우선순위가 높다
//		System.out.println(!(3>5));
//		
//		// Dead code 처리안하는 코드
//		System.out.println( 3<5 || 100>1 );
//		System.out.println( 3>5 && 100>1 );

		System.out.println(10&3); //	2
		//	10				0000	1010
		//	 3				0000 0011	&
		//					0000	0010		2
		System.out.println(10|3); //		11
		//					0000	1011		11
		System.out.println(10^3); //	9	XOR - 서로 다를때 참
		//					0000	1001		9
		System.out.println(~10); //		-11
		//10				0000	1010
		//					1111 0101
		//					1111	0100
		//					0000 1011 =>	11

		
	}

}
