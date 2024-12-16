package days05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		[문제1]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(if문 사용)
		[문제2]	국어점수를 입력 받아서 수 / 우 / 미 / 양 / 가 출력	(swich문 사용)
		 ***[문제3]	1~10까지의 홀수의 합 ( for문 사용)	
		[문제4]	1~10까지의 홀수의 합 ( while문 사용)	
		[문제5] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
		 */
		int sum=0;
		for (int i = 1; i <= 10; i+=2) {			// if문 까지 쓰지않아도 된다
			System.out.printf("%d+",i);			// 짝수의 합은 i=2로만 바꾸면 될껄?
			sum += i;
		}
		System.out.printf("=%d",sum);


	}

}
