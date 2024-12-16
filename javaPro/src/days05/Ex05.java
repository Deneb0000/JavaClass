package days05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		[문제1]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(if문 사용)
		[문제2]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(swich문 사용)
		[문제3]	1~10까지의 홀수의 합 ( for문 사용)	
		***[문제4]	1~10까지의 홀수의 합 ( while문 사용)	
		[문제5] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
		*/
/*		1.풀이
		int sum=0;
		int i=1;
		while (i<=10) {		//참일 경우 계속 반복
			if (i%2 !=0) {
				System.out.printf("%d+",i);
				sum += i;
				}
			i++;
		}
		System.out.printf("=%d",sum);
		*/
		// 2.풀이
		int sum=0;
		int i=1;
		while (i<=10) {		//참일 경우 계속 반복	1<=0 참
			if (i%2 ==0) {	// 1%2 ==0 False
				i++;
				continue; 
				}
			System.out.printf("%d+",i);		//	1+	
			sum += i;		// sum =1
			i++;				// i=2
		}
		System.out.printf("=%d\n",sum);
	}

}
