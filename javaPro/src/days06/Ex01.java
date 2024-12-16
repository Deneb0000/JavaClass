package days06;

import java.io.IOException;


public class Ex01 {

	private static int nextByte;

	public static void main(String[] args) throws IOException {
		// 한 문자를 입력받아서 출력
		// BufferedReader, Scanner 클래스 "A" -> charAt() -> ' A'
		// System.in 바로써보기 <
		char one ; 
		System.out.print("> 한 문자 입력 ? ");
		int nextByte = System.in.read();
		System.out.println(nextByte);
/*		one = (char) System.in.read();
		System.out.println(one); */
		
//		System.in.read();		//13		
//		System.in.read();		//10		//스트림 'a' \n \r 까지 3개나 읽어버려서
		System.in.skip( System.in.available() );
		//스킵 : 건너띈다 // 한개만 빼고 제외한다
		
		//복사+붙이기
		System.out.print("> 한 문자 입력 ? ");
		/*
		one = (char) System.in.read();		//read :  1byte값을 읽는다
		System.out.println(one);
		//여기까지 실행하면 끝나버린다 ? 줄바꿈???
		//스트림 'a' \n \r 까지 3개나 읽어버려서 
		*/
		nextByte = System.in.read();
		System.out.println(nextByte);
		
		
	}	//main

}		//class
