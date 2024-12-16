package days16;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 22. - 오전 10:45:00
 * @subject	[예외 고의로 개발자가 발생시키기]
 * @content	throw문 사용
 * 			throws = x
 *			예) 국어 점수를 입력받아서 반환하는 getScore()
 *			메서드 선언
 *				ㄴ국어점수 0~100 아니라면 강제로 예외 박생
 *
 */
public class Ex01_06 {

	public static void main(String[] args) {

		int kor;
		try {
			kor = getScore("국어");
			System.out.println(kor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						
		System.out.println("end");
		
	} //main

	private static int getScore(String subjectName) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.printf("> %s 점수 입력?", subjectName);
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			//강제로 개발자가 예외 발생시키기
			throw new IOException("점수 범위(0~100) 벗었났다.");
		}
		
		
	}

} //class
