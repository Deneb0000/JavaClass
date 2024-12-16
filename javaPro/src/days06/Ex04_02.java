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
public class Ex04_02 {

	public static void main(String[] args) {
		// 다섯 정수(a, b, c ,d ,e)를 입력받아서 max, min 출력
		int a, b, c, d ,e;
		
		a = (int) (Math.random()*100) +1;	//	1<=	a <=100
		b = (int) (Math.random()*100) +1;
		c = (int) (Math.random()*100) +1;
		d = (int) (Math.random()*100) +1;
		e = (int) (Math.random()*100) +1;
		System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n", a,b,c,d,e);
				
//		int max = Math.max(Math.max(Math.max(a, b),Math.max(c, d)),e);
// 결과값이 제대로 나왔지만 너무 복잡하니깐 강사님꺼를 참고하자		
		
	      int max = Math.max(a, b);
	      max = Math.max(max, c);
	      max = Math.max(max, d);
	      max = Math.max(max, e);

	      System.out.printf("max=%d\n", max);
		 

	}	// main

}	//class
