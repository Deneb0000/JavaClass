package days16;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex07_03 {

	public static void main(String[] args) {
		/*
	      문제 설명

	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는
	      문자열을 리턴하는 함수, solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 
	      리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	       */

		System.out.println(solution(3));
		System.out.println(solution(4));
		
		IntStream	//┌ 0,1,2
			.range(0,3)
			.mapToObj(i->i%2==0?"수":"박")
			.collect(Collectors.joining());
//		IntStream.rangeClosed(0, 2);

	}//main
	
	private static String solution(int n) {	//119

		return IntStream.range(0, n)
	.mapToObj(i -> i % 2 == 0 ? "수" : "박")
	.collect(Collectors.joining());				//람다식
		
		/*
		StringBuilder answer = new StringBuilder();
		int 몫 = n /2;
		int 나머지 = n %2;
		for (int i = 1 ; i <= 몫 ; i++) answer.append("수박");
		if(나머지 ==1) answer.append("수");
		
		return answer.toString();
		*/

/*	
	 * StringBuilder answer = new StringBuilder();
		boolean sw = true;
		for (int i = 1; i <= n ; i++) {
			if (sw) {
				answer.append("수");
			} else {
				answer.append("박");
			}
			sw = !sw;
		}
		return answer.toString();
*/
		
		/*
		StringBuilder answer = new StringBuilder();
		for (int i = 1; i <= n ; i++) {
			if (i%2==1) {
				answer.append("수");
			} else {
				answer.append("박");
			}
		}
		return answer.toString();
		*/
		
		//		int count = 0;  
//		String a = "수";
//		String b = "박";
//		for (int i = 1; i <= n && i < 10000; i++) {
//			if (i%2 != 0) {
//			System.out.printf("%s",a);	
//			count ++;
//			}else {
//				System.out.printf("%s",b);
//				count ++;
//			}
//		
//		}
//	      return answer;
	   }

}//class
