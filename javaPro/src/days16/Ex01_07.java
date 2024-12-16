package days16;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 22. - 오전 10:45:00
 * @subject	[예외 고의로 개발자가 발생시키기]
 * @content	throw문 사용
 *			throws 문 x
 */
public class Ex01_07 {

	public static void main(String[] args) {
		int kor;
		try {
			kor = getScore("국어");
			System.out.println(kor);
		} catch (IOException e) {
			// thorw new RuntimeException("XXX");
		}catch (Exception e) {
		}

		System.out.println("end");

	} //main

	private static int getScore(String subjectName) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.printf("> %s 점수 입력 ?", subjectName);
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			// 강제로 개발자가 예외 발생시키기...
			// 사용자 예외 처리 객체
			throw new IOException("점수 범위(0~100) 벗어났다.");
		}
	}

} //class
