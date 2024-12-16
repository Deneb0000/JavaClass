package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오전 10:29:18
 * @subject
 * @content
 *
 */

public class Ex01 {

	public static void main(String[] args) {
		// 정수 : byte, shot, int, long
					//0=/=	0l
		// 논리형 : boolean
		// 문자 : char
		// 실수형 : float(4), double(8)
		//				3.14F		3.14(D)		<다른값

		// int
		// 4바이트  [s:부호비트] [] [] []
		
		// float
		//				 1 [E]xponent 지수
		//					[M]antissa 가수	: 소수점을 나타내는 자릿수 (클수록 정밀도가 높다)
		// 4바이트	[1] [E8] [M23]
		//*같은 4바이트라도 저장용도가 다르다
		//double
		//8바이트 [1] [E11] [M52]
		// +-M x 10^E
		
		//(저장하기 위해) 정규화 작업
		//9.1234567 실수
		//1001.000111111001101011011011.....(무한실수)
		//1.001000111111001101011011011.....x 2^3 (무한실수) *double도 오차는 날수있다
		
		

		
	}

}
