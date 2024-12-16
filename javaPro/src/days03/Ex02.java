package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Ctrl + Shift + O : 필요한 임포트 구문은 남겨주고 필요없는건 없애준다
//import java.lang.*; 다른 패키지에서 써야하면 import를 써야하는데 System, String은 아니다

// Import java.io.*; 을 사용해도 되는데 필요없는 클래스까지 불러올수 있다.

/**
 * @author dnb
 * @date 2024. 7. 3. - 오전 10:51:30
 * @subject	
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 이름을 표준입력장치(키보드)로 부터 입력받아서 출력
		// 키보드 입력 -> System.in 바이트값으로 읽는다 -> 문자변환 -> 문자열 변환
		BufferedReader br =	new BufferedReader/*문자열 변환*/(new InputStreamReader( System.in )/*문자로 변환시킴*/);
		//(암기)
		
		//Unhandled exception type IOException	*exception : errer (핸들링하지 않은 에러가 있다)
//		String name = br.readLine(); //readLine(); : 매개변수를 안줘도된다
		System.out.print("> 이름 입력 ? ");
		String name = br.readLine(); 

		System.out.println(name);
		
		
	}

}
