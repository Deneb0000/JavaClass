package days06;

import java.util.Scanner;

//이것도확인
/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 12:18:55
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// 세 정수(a,b,c)를 입력받아서 max, min 출력
		int a, b, c;
		System.out.print(">세 정수 a, b, c 입력?");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		 /*
	      int max = a > b ?  a : b;
	      max =  max > c ? max : c;

	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
	      */
	      int max = Math.max( Math.max(a, b), c);

	      int abMin = Math.min(a, b);
	      int min = Math.min( c , abMin);

	}	// main

}	//class
