package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 11:07:47
 * @subject	파일 라이트 쓰기 작업 코딩 고치기
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//1.문제점 파일 객체를 한번만 만들기
		String parent = ".\\src\\days21"; // 저장할 경로
		String child;//저장할 변수
		char con = 'y';
		String content;//저장할 내용 입력받을 변수

		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("1. 저장할 파일명 입력?");
			child = scanner.next();

			File file = new File(parent,child);

			try (FileWriter writer = new FileWriter(file)){ //바깥으로 나오다!
				do {
					System.out.print("2. 저장할 문자열 (Data) 입력?");
					content = scanner.next();
					writer.write(content + "\r\n"); //"\r\n" 개행
					System.out.print("입력 계속 ?");
					con = (char) System.in.read();
					System.in.skip(System.in.available());
				} while (Character.toUpperCase(con) == 'Y');
			} catch (Exception e) {
				e.printStackTrace();
			}



		} // main

	} //  class

}