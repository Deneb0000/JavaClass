package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 2:44:01
 * @subject                   	[S]canner 클래스 =물건, 객체, 개체
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader
		= new BufferedReader(new InputStreamReader( System.in ));
		
		String name;
		byte age = 20; //초기값은 중요x 나중에 다시 할당 받을수 있어서
		
		System.out.print("> 이름 입력 ?");
		name = bufferedReader.readLine();
		
		
		System.out.print("> 나이 입력 ?");
		//Type mismatch: cannot convert from String to byte		
		//타입(형)변환이 필요하다
		//"20" -> 20			
		//String -> byte	Byte.parseByte()
		//String -> int		Integer.parseInt()
		//String-> short	Short.parseShort()
		//String-> long		Long.parseLong()
		//age = bufferedReader.readLine();
//		String strAge = bufferedReader.readLine();
//		age = Byte.parseByte(strAge);
		age = Byte.parseByte(bufferedReader.readLine());
		
		// 문제점 : 나이를 입력이 잘못되면 : java.lang.NumberFormatException 발생
		
		System.out.printf("이름= \" %s \", 나이= %d",name,age);
	}

}
