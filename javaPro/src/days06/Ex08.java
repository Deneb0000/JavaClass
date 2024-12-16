package days06;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 4:19:33
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		// [순서도]
		//	1-2+3-4+5 . . . -8+9-10=-5
		// 홀수 일때는 sum += i 		%d-
		// 짝수 일때는 sum -= i 		%d+
		
		int sum = 0;
		/*1.풀이
		 * for (int i = 1; i <= 10; i++) {
		 		if (i%2 == 0) {
				System.out.printf("%d+",i);
				sum -= i;
			} else {
				System.out.printf("%d-",i);
				sum += i;	
			}	//else
		}	//for
		System.out.printf("=%d\n", sum);
		*/
		
		// 2.풀이
		/*  for (int i = 1; i <= 10; i++) {
			  System.out.printf(i%2==0?"%d+":"%d-",i);
			  sum += i%2 == 0? -i:i;
		  } //for
		System.out.printf("=%d\n", sum);
		*/
		
		//3.풀이 (내일시험) ***최고의 코딩 : swich 변수
		boolean sw = false;
		for (int i = 1; i <= 10 ; i++) {
			if (!sw) {
				System.out.printf("%d-",i);
				sum += i;	
			}else {
				System.out.printf("%d+",i);
				sum -= i;
			} //else
			sw = !sw;
		}
		System.out.printf("=%d\n", sum);
	}	//main

}	//class
