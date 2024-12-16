package days17;

import java.util.Arrays;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오전 11:43:41
 * @subject	https://school.programmers.co.kr/learn/courses/30/lessons/120913?language=java
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		String[] answer = solution("abc1Addfggg4556b",	6);
		System.out.println(Arrays.toString(answer));
		answer = solution("abcdef123",	3);
		System.out.println(Arrays.toString(answer));

	} //main

	 public static String[] solution(String my_str, int n) {

		 int length = (int) Math.ceil/*올림해주는*/((double) my_str.length()/n) ;	//배열크기 
		 String[] answer = new String[length];

		 /* 1번 풀이
//		 String[] answer = {};
		 int beginIndex = 0, endIndex = n;
		 //	        my_str.substring(beginIndex, endIndex);
		 //		 answer[0] = my_str.substring(0, 6);
		 //		 answer[1] = my_str.substring(6, 12);
		 //		 answer[2] = my_str.substring(12, 18);
		 //		 answer[i] = my_str.substring(i*n, (i+1)*n);
		 int my_strLength = my_str.length();
		 for (int i = 0; i < length; i++) {
			 beginIndex = i*n;
			 endIndex = (i+1)*n;
			 if(endIndex > my_str.length()) endIndex = my_strLength;
			 answer[i] = my_str.substring(beginIndex, endIndex);
		 }
		 */

		 int i;
		 for (i = 0; i < length -1 ; i++) {
			answer [i] = my_str.substring(i*n, (i+1)*n);
		}
		 answer[i] = my_str.substring(i*n);
		 return answer;
	 }
	
	
} //class
