package days02;

/**
 * @author dnb
 * @date 2024. 7. 2. - 오후 4:32:26
 * @subject		진법변환 설명
 * @content		문자를 나타내는 자료형
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		char ch = 'A' ;
		//문자코드표		: ascii 코드표		A:65			a:97
		
		// String	%s
		// float, double %f
		// byte, short, int, long		%d	%o	%x	%X
		// boolean %b	%B
		// char %c	%C
		System.out.printf("\'%c\' - %d\n", ch, (int)ch);
		System.out.printf("\'%c\' - %d\n", 'Z', (int)'Z');
		System.out.printf("\'%c\' - %d\n", 'a', (int)'a');
		System.out.printf("\'%c\' - %d\n", 'z', (int)'z');
		System.out.printf("\'%c\' - %d\n", '0', (int)'0');
		System.out.printf("\'%c\' - %d\n", '9', (int)'9');
		//한글
		System.out.printf("\'%c\' - %d\n", '가', (int)'가');
		System.out.printf("\'%c\' - %d\n", '힣', (int)'힣');
		
		char c = 'A';
		char c2 = 65;
		char c3 = 0x0041;
												//Invalid unicode
		char c4 = '\u0041' ; 			/* \\u : 유니코드 문자 */
		
		// [진법전환]
		//63
		// 128	64		32		16		8	4	2	1
		// 	 0		 0		 1		 1		1	1	1	1
		// 0011 1111
		// 00 111 111
		//  077						8진수	
		// 0011 1111
		//	  3		  F(15)		0x3f			16진수
	}

}
