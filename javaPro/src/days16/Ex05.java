package days16;

import java.util.Arrays;

/**
 * @author dnb
 * @date 2024. 7. 22. - 오후 2:22:42
 * @subject	[문자열 다루는 클래스]
 * @content	1. String
 *			2. StringBuffer
 *			3. StringBuilder
 *			4. StringTokenized
 */
public class Ex05 {

	public static void main(String[] args) {
		String name = "홍길동";
		String name3 = "홍길동";
		name += "님";		//+문자열 연결 연산자
		name += " 안녕!!!";	//+
		
		System.out.println(name);
		
		//String => 클래스 
//		String name2 = new String("홍길동");

		// == 두 문자열 비교 equals(). equalsIgnoreCase()
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1,3));
		System.out.println(name.trim());
//		System.out.println(name.split(regex));
		System.out.println("=".repeat(10));
		System.out.println("aBcD".toUpperCase());
		System.out.println("aBcD".toLowerCase());
		char[]nameArr=name.toCharArray();
		System.out.println(Arrays.toString(nameArr));
		//클래스 메서드(정젹, static)
		String msg = name.format("%s님 %d살", "홍길동",20);
		System.out.println(msg);
		System.out.println();

		// String -> IntStream
		// name.chars()
		
		// 두 문자열 비교 : equals() true / false
		//	0	- 음수 	+ 양수
		System.out.println("aBc".compareTo("abc"));	//.compareTo 같으면 0이 나온다
		
//		name 문자열 속에 "길동"이라는 문자열의 유무 체크
		System.out.println(name.contains("길동"));	//true
		System.out.println(name.contains("시훈"));	//false

		//"홍길동님 안녕!!!"
		System.out.println(name.indexOf("길동"));	//1	몇번째에 있냐?
		System.out.println(name.indexOf("시훈"));	//없으면 -1
		
		System.out.println(name.lastIndexOf("길동"));	//1	끝에서부터 찾냐의 뜻
		
		
	} // main

} // class
