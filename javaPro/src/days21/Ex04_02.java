package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 10:39:47
 * @subject	파일 라이트 쓰기 작업해보기
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 실행 후 
		// 1. 저장할 파일명 입력? test.txt 엔터
		// 2. 저장할 문자열 (Data) 입력? 문자열 입력 ... 엔터
		//	입력 계속 ? y, n 
		String parent = ".\\src\\days21"; // 저장할 경로
		String child;//저장할 변수
		char con = 'y';
		String content;//저장할 내용 입력받을 변수
		
		try(Scanner scanner = new Scanner(System.in)){
		System.out.print("1. 저장할 파일명 입력?");
		child = scanner.next();
		
		File file = new File(parent,child);
		
		do {
			try (FileWriter writer = new FileWriter(file, true)){ //append 덮어쓰기x 파일이 존재하면 끝에다가 추가하겠다는 뜻
				System.out.print("2. 저장할 문자열 (Data) 입력?");
				content = scanner.next();
				writer.write(content);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.print("입력 계속 ?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			} while (Character.toUpperCase(con) == 'Y');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // main

} //  class
