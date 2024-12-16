package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Ex02_02 {

	public static void main(String[] args) {
		//try ~ catch 연습
		// C:\Windows\comsetup.log 파일을 읽어와서 출력
		//텍스트파일 읽기/쓰기 작업 -> FileReader/FileWriter
		//1:
		//2:
		//라인번호 출력
		
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		//버퍼기능
		//readLine() 메서드 존재 : 한 라인을 읽어와서 반환하는 메서드
		String fileName = "C:\\Windows\\comsetup.log";
		
		int one=-1;
		
		try {
			reader = new FileReader(fileName);
			bufferedReader = new BufferedReader(reader);
			//보조스트링(2차 스트림)

			String line = null;
			int lineNumber = 1;
			
			
			while ((line = bufferedReader.readLine())!=null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			};
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					bufferedReader.close();
					
					reader = null;
					bufferedReader = null;
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	} //main

}// class
