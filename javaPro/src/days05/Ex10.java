package days05;

/** 강사님꺼가져와
 * @author dnb
 * @date 2024. 7. 5. - 오후 5:31:40
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		// ASCII 256가지 출력 + 10개행 + 라인번호
		/*
		// 알파벳 대문자 출력
				for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%1$d[%1$c]\n",i);	//d는 번호 / c는 코드 내용 / i가 한번 사용된 이유는 같은 값이라서		
		*/
		/*
		//알파벳 소문자 출력
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%1$d[%1$c]\n",i);
		*/
		/*
		// 숫자 출력
		for (int i = '0'; i <= '9'; i++) {
			System.out.printf("%1$d[%1$c]\n",i);
		*/
		/*
		//가
		for (int i = '가'; i <= '힣'; i++) {
			System.out.printf("%1$d[%1$c]\n",i);
		*/
		/*
		//한글 자음
		for (int i = 'ㄱ'; i <= 'ㅎ'; i++) {
			System.out.printf("%1$d[%1$c]\n",i);
		}
		*/
		
		//한글 모음
		// if (ch >= 'ㅏ' && ch <= 'ㅣ'){		}
		for (int i = 'ㅏ'; i <= 'ㅣ'; i++) {
			System.out.printf("%1$d[\'%1$c\']\n",i);
		}
	}	//main

}	//class
