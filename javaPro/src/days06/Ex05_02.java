package days06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 2:34:14
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// [람다식과 스트림]
		// 1~100 까지의 임의의 정수		10개 배열 m
		// 10개 정수의 합
		// 갯수
		// 평균
		//	최대값
		// 최소값
		/* 람다식 암기
		IntStream istream = new Random().ints(1,101).limit(10);
		long count = istream.count();		//istream.(메소드
		int sum = istream.sum();
		OptionalDouble odAvg = istream.average();
		double avg = odAvg.getAsDouble();
		OptionalInt oiMax = istream.max();
		int max = oiMax.getAsInt();
		*/
		
		// 두 정수 max, min
		// 세 정수 max, min
		// 10개 정수 max, min
		// IntStream.of(int . . . args)
//		IntStream.of(3,5,2,4,1).max().ifPresent(System.out::println);
		// Ex04_03.java
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random()*100)+1;
		}
		
		/*1
		// int[]m에서 75보다 큰 값.
			for (int i = 0; i < m.length; i++) {
				if (m[i]>75) {
					
				}
				*/
		// 2.
		// int [] -> IntStream	↓람다식
		int [] n = IntStream.of(m).filter(i-> i >75).toArray();
		System.out.println(Arrays .toString(n));
			
	} //main

}	// class
