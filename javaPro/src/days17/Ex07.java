package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 2:38:50
 * @subject	정규표현식 활용
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*1. 정규 표현식(regular expression == regex) 정규식
		 * 	-미리 정의 된 기호
		 * 	- 문자열 속에 원하는 패터(조건)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		 * 	- boolean String.matches(regex)
		 * 	- java.util.regex 패키지
		 * 		ㄴ Pattern 클래스
		 * 		ㄴ Matcher 클래스
		 * 
		 * */

		String [] data = {
	            "bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
	                , "combat", "count", "date", "disc", "fx"
	                };
		
		//1) c 문자로 시작하는 무자열 찾아서 출력
		
//		String regex = "^c.*"; //^c c로 시작을하고 
		String regex = "c.*"; 
		
		for (int i = 0; i < data.length; i++) {
//			if(data[i].startsWith("c")) //c로 시작하냐?
//				System.out.println(data[i]);
			if(data[i].matches(regex))
				System.out.println(data[i]);
			
		}
		
//		String regex ="c.*";
	      regex ="c[a-zA-Z]*";
	      regex ="c[a-zA-Z0-9]*";
	      regex ="c\\w*";  // [a-zA-Z0-9]  == \\w
	      regex ="c.";	// .아무문자 한문자
	      regex ="c\\.";
	      regex ="c[0-9]";
	      regex ="c\\d";
	      regex ="c.*t";	// c로 시작하고 t로 끝난다
	      regex ="c[^0-9]";	// c 다음으로 숫자 아닌것
	      regex ="c\\D";   // [^0-9] == \\D
	      regex ="(b|c).{2}";	//  총 3글자인데 b아님 c 로 시작
	      regex ="[bc].{2}";	// == "(b|c).{2}"
	      regex ="[bcd].{2,3}";	// {2,3} 2글자나 3글자
	      regex ="[b-d].{2,3}";
	      // bcd 문자는 제외한 알파벳 대소문자
	      regex ="[A-Za-z&&[^b-d]].*";  // *  0개 이상 
	      regex ="[A-Za-z&&[^b-d]].+";  // *  1개 이상 
	      regex ="[A-Za-z&&[^b-d]].?";  // ?  0,1
		
	      //패턴객체 p
	      Pattern p = Pattern. compile(regex);
	      for (int i = 0; i < data.length; i++) {
	    	  //패턴 객체 m
	    	 Matcher m = p.matcher(data[i]);
	    	 if (m.matches()) System.out.println(data[i]);
		}
	     
	      //[문제] 비밀번호 입력?
	      //	비밀번호가 길이 8~15 문자
	      //			숫자 1개 이상
	      //			서문자 1개 이상
	      //			대문자 1개 이상
	      //			특수문자 1개 이상 #@$%
	      // String regex = "???";
	}

}
