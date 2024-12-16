package days21;

import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 10:07:01
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// days21 Ex01.java
		// 텍스트파일 -> 문자 스트림
		// 파일		+문자 스티림 = FileReader, FileWriter
		// [File 클래스] : 파일+디렉토리(폴더)을 다루는 여러 기능이 구현된 클래스
		//					        			 ㄴ(생성, 파일삭제, 파일 정보, 파일명 변경 등등)
//		String parent = ".\\src\\days21";
		File parent = new File(".\\src\\days21"); //디렉토리를 나타내는 패런트
		String child = "Ex01.java"; // 그 위에까지의 경로
		File file = new File(parent, child);
		System.out.println(file.length() + "(bytes)");
		System.out.println(file.isDirectory() + "/" + file.isFile()); //디렉토리이니? 파일니?
		
		long ms =  file.lastModified(); //마지막 수정을 나타내는 
		//System.out.println(ms); //1722212007440
		// 년 월 일 시:분:초 출력? 형식화 클래스 필요 : 
		//LocalDateTime dt = LocalDateTime.of(); //밀리 세컨드로 넣을수 없다
		//Date		SDF (심플데이터포맷)	
		//Calender	SDF
		//1. Date로 만들기 ******암기
		Date d = new Date(ms);
//		System.out.println(d.toLocaleString());
		String pattern = "yyyy년 MM월 dd일 hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		try (FileReader reader = new FileReader(file)) { //반드시 파일을 꼭 클로즈해야 불러올수있다
			int code;
			while ((code = reader.read()) != -1 ) {
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} //try

	}//main

}//class
