package days02;

/**
 * @author dnb
 * @date 2024. 7. 2. - 오후 3:47:06
 * @subject		숫자(정수계열)
 * @content		byte(1), shot(2), int(4), long(8)
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		/*
		 [진법]
		 1. 10진법	-	0 1 2 3 4 5 6 7 8 9
		 2. 2진법	-	0 1
		 3. 8진법	-	0~7
		 4. 16진법	-	0-9 A(10) B(11) C(12) D(13) E(14) F(15)
		 0 1
		 
		 byte(1)		[0]		[1]	2가지표현
		 1byte == 8bit		[부호비트] [] [] [] [] [] [] [] 2^7==128가지
		 	-128 0 127
		 
		 short(2)
		 2byte == 16bit		[부호비트] [] [] [] [] [] [] []		[] [] [] [] [] [] [] []	2^15==32768가지
		 	-32768 0 32767
		 	
		 int(4) == 32bit		2^31= 21억
		 	-21억~21억
		 long(8) == 64bit 2^63 = 900경
		 	-900경~900경
		 */

		// 사람의 나이를 저장할 변수 선언,
		byte age = 10;		//자료형 변수명;
		// 국어점수를 저장할 변수 선언,
		byte krScore;
		
		//접미사		d/D	L/l	
		//10.0
		//10.
		//10D	10d	double type
		
		//10L	10l	long type
		//10		int 		1010(2진수)
		int i = 10;
		//long l = 10L;
		long l = 10;	//원래 10L 이 되어야하는데 // 자동타입변환이 되었다  int => long 형변환
		
		//Type mismatch: cannot convert from double to float. 값이 double로 잡힌다
		//자료형이 맞지않다(자동으로 바뀌지도 않는다)
		//float f= 3.14; -> 3.14f를 붙힌다
		float f= 3.14f;
		double d = 3.14; // 기본이 double이라서 자동으로 d가 붙혀져있다
		
		System.out.printf("%d %d %f %f\n", 100, 100L, 3.14F, 3.14D);
	}

}
