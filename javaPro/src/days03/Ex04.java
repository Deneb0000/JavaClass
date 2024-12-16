package days03;

import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 3:06:04
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// tab 들여쓰기
		// shift + tab 내어쓰기
		// Ctrl + a 전체선택
		// Ctrl + i 자동정리?
		// ctrl + shift + o : import
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");	//useDelimiter:구분자를 쓰겠다
																				// \\s : 스페이스	*:반복횟수
				
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close();

	}

}
