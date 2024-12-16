package days05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		***[문제1]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(if문 사용)
		[문제2]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(swich문 사용)
		[문제3]	1~10까지의 홀수의 합 ( for문 사용)	
		[문제4]	1~10까지의 홀수의 합 ( while문 사용)	
		[문제5] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
		*/
		Scanner scanner = new Scanner(System.in);
		int kor;
//		boolean flag= false;
//		do {
//			if ( flag ) {
//				System.out.print("입력잘못!!!\n 다시 ");
//			}
//			flag = true;			
			System.out.print("국어점수 입력?");				//열이동 alt + (방향키)
			kor = scanner.nextInt();			
//		} while (!(kor >=0 && kor <=100));
////		} while( kor < 0 || kor > 100);
//		System.out.println(kor);

		//입력한 값들은 항상 [유효성 검사]가 필요하다.
		/*
		if( 90 <= kor && kor<=100) System.out.println("수");
		if( 80 <= kor && kor<89) System.out.println("우");
		if( 70 <= kor && kor<79) System.out.println("미");
		if( 60 <= kor && kor<69) System.out.println("양");
		if( 0 <= kor && kor<59) System.out.println("가");
		*/
			
		if( 90 <= kor ) System.out.println("수");		/*명령실행문이 한개이면 괄호 생략*/
		else if( 80 <= kor ) System.out.println("우");
		else if( 70 <= kor ) System.out.println("미");
		else if( 60 <= kor ) System.out.println("양");
		else if( 0 <= kor ) System.out.println("가");

	
	}

}
