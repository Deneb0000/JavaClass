package days21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

import days21.Ex01.Direction;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오후 2:09:58
 * @subject
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		String content = "package days21;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author dnb\r\n"
				+ " * @date 2024. 7. 29. - 오전 9:00:53\r\n"
				+ " * @subject\r\n"
				+ " * @content\r\n"
				+ " *\r\n"
				+ " */\r\n"
				+ "public class Ex01 {\r\n"
				+ "\r\n"
				+ "	//	enum Direction /*열거형선언 : 컴파일할땐 클래스로 인식하기때문에 대문자*/{ \r\n"
				+ "	//		EAST, SOUTH, WEST, NORTH}\r\n"
				+ "	//}\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400,\"▲\") ;\r\n"
				+ "\r\n"
				+ "		private int value;\r\n"
				+ "		private String symbol;\r\n"
				+ "\r\n"
				+ "		Direction(int value){\r\n"
				+ "			this.value = value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;			\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return this.value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return this.symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "	/*\r\n"
				+ "	 * 컴파일러가 클래스로 변환\r\n"
				+ "	 * class Directio extends Enum{\r\n"
				+ "	 * 	static final Direction EAST = new Direction();\r\n"
				+ "	 * }				ㄴ디렉션으로 선언된 객체\r\n"
				+ "	 * \r\n"
				+ "	 * private String name;\r\n"
				+ "	 * public String name(){\r\n"
				+ "	 * 	return 	this.name;\r\n"
				+ "	 * 	}\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 * \r\n"
				+ "	 * private int ordinal;\r\n"
				+ "	 * public int ordinal(){\r\n"
				+ "	 * 	return this.ordinal;\r\n"
				+ "	 * 	}\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 * \r\n"
				+ "	 * 컴파일하면서 만들어진다\r\n"
				+ "	 * */\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		//		System.out.println(Direction.EAST );	//\"EAST\" 라는 문자열\r\n"
				+ "		//		System.out.println(Direction.EAST.toString() );\r\n"
				+ "		//		System.out.println(Direction.EAST.name() ); // 객체이기때문에 네임도 있다\r\n"
				+ "		//		System.out.println(Direction.EAST.ordinal()); //안에 있는 index(순번)값 /첫번째 값이라 0\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(\r\n"
				+ "					dir.name() + \"/\"\r\n"
				+ "							+dir.ordinal() + \"/\"\r\n"
				+ "							+dir.ordinal() + \"/\"\r\n"
				+ "							+dir.getSymbol() + \"/\"\r\n"
				+ "							+dir.getValue() + \"/\"\r\n"
				+ "					);\r\n"
				+ "			//[열거형(enum) 의 구조 이해]\r\n"
				+ "\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	} //main\r\n"
				+ "\r\n"
				+ "} //class Ex01\r\n"
				+ "";
		//[문제] Ex01.java 파일의 String content
		//21번째 라인의 문자열
		//String line21 변수에 저장한 후 출력
		/*
		String [] datas = content.split("\r\n");
		//datas[0]
		//21번째
		String line21 = datas[20];
		System.out.println(line21);
		*/
		
		//[2]풀이
		//메모리 스트림 StringReader, StringWriter
		/*
		StringReader reader = new StringReader(content);
		BufferedReader br = new BufferedReader(reader);
		for (int i = 0; i < 20; i++) br. readLine();
		String line21 =br.readLine();
		System.out.println(line21);
		*/
		
		//[3]풀이
		//String [] -> Stream<String> -> 20 라인 스킵 -> 21...
		String line21
		= Stream.of(content.split("\r\n")).skip(20).findFirst().get();

		System.out.println(line21);
		//21번째 라인가져오는 코딩

	} //main

} //class
