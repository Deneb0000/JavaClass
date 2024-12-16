package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오전 10:41:22
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// 대문자 -> 소문자
		// 소문자 -> 대문자
		
		// 'A' 65
		// 'a' 97
		char lowerCase = 'x', upperCase;

		upperCase = (char) ( lowerCase - 32);
		System.out.println( upperCase);
		

	}

}
