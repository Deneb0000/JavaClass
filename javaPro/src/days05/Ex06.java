package days05;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		[문제1]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(if문 사용)
		[문제2]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(swich문 사용)
		[문제3]	1~10까지의 홀수의 합 ( for문 사용)	
		[문제4]	1~10까지의 홀수의 합 ( while문 사용)	
		***[문제5] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
*/
		Scanner scanner = new Scanner(System.in);
		int n, m;
		System.out.print(">두 정수 n, m 입력?");
		n = scanner.nextInt();
		m= scanner.nextInt();
		int sum = 0;
//		1번풀이
  	/*	if (m>n) {
			
		} else {

		}
		
		for (int i = n ; i <= m; i++) {
			System.out.printf("%d+",i);			
			sum += i;
		}
		System.out.printf("=%d\n",sum);
		*/
		
		// 2번풀이
	/*	  if (n>m) {
			int temp = n;
			n=m;
			m=temp;
		} 
		for (int i = n ; i <= m; i++) {
			System.out.printf("%d+",i);			
			sum += i;
		}
		System.out.printf("=%d\n",sum);
		*/
		 
		//3번풀이
	/*	int min = n > m? m:n;
		int max = Math.max(n, m);
	for (int i = min ; i <= max; i++) {
		System.out.printf("%d+",i);			
		sum += i;
	}
	System.out.printf("=%d\n",sum); */	
		 
	}

}
