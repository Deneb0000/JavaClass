package days05;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		/*
		[문제1]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(if문 사용)
		***[문제2]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(swich문 사용)
		[문제3]	1~10까지의 홀수의 합 ( for문 사용)	
		[문제4]	1~10까지의 홀수의 합 ( while문 사용)	
		[문제5] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
		*/

		Scanner scanner = new Scanner(System.in);
		int kor;
		boolean flag= false;
		do {
			if ( flag ) {
				System.out.print("입력잘못!!!\n 다시 ");
			}
			flag = true;			
			System.out.print("국어점수 입력?");				//열이동 alt + (방향키)
			kor = scanner.nextInt();			
		} while (!(kor >=0 && kor <=100));
////		} while( kor < 0 || kor > 100);
//		System.out.println(kor);

		//입력한 값들은 항상 [유효성 검사]가 필요하다.
			char grade ;
			
			switch (kor/10) {
			case 10:							// jdk 14.ver case 10 , 9:
			case 9:		
				grade = '수';
				break;
			case 8:		
				grade = '우';
				break;
			case 7:			
				grade = '미';
				break;
			case 6:		
				grade = '양';
				break;
			default:
				grade = '가';
				break;
			}//switch
			System.out.printf("%d : %c\n", kor, grade);

	}
}
		