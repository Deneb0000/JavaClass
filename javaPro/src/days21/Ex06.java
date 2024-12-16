package days21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 11:14:39
 * @subject Ex01.java		  ->	 Ex01Copy.java		파일을 복사해보자
 * @content	FileInputStream 		FileOutputStream
 *					1문자
 */
public class Ex06 {

	public static void main(String[] args) {
		//1.
		String sourceFile = "C:\\Program Files (x86)\\Kakao\\KakaoTalk\\kakaoTalk.exe";//원본파일
		String copyFile = "C:\\Users\\User\\Documents\\kakao_copy.exe";

		fileCopyBinartSteam(sourceFile, copyFile);

	} //main

	private static void fileCopyBinartSteam(String sourceFile, String copyFile) {
		long start = System.nanoTime();


		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);){
			int code;
			while ((code = fis.read()) !=-1) {
//				System.out.printf("%08d\n",Integer.parseInt(Integer.toBinaryString(code)));
				fos.write(code);
			}//while 통로에 남아있을 경우도 있음
			fos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		// TODO Auto-generated method stub
		try (FileReader reader = new FileReader(sourceFile);
				FileWriter writer = new FileWriter(copyFile);){
			int code;
			while ((code = reader.read()) !=-1) {
				//			System.out.printf("%c",(char)code);
				writer.write(code);
			}//while 통로에 남아있을 경우도 있음
			writer.flush();//이거 없으면 저장안됨, 실제파일에 쓰기작업을 해라
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//"자바 파일경로에서 확장자" 검색하기

} //class
