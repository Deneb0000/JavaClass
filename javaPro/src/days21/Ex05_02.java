package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 11:14:39
 * @subject Ex01.java -> Ex01Copy.java		파일을 복사해보자
 * @content	FileReader 		FileWriter
 *					1문자
 *					버퍼(buffer)
 *			BufferedReader 		BufferedWrited
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//1.
		String sourceFile = ".\\Src\\days21\\Ex01.java";//원본파일
		String copyFile = "";

		int idx = sourceFile.lastIndexOf("\\"); 
		System.out.println(idx);	//12

		String parent = sourceFile.substring(0, idx);
		System.out.println(parent); 
		String child = sourceFile.substring(idx+1);
		System.out.println(child);

		idx =child.indexOf("."); //.위치를 찾겠다
		String  fileName = child.substring(0, idx);
		System.out.println(fileName);
		String ext = child.substring(idx);
		System.out.println(ext);
		fileName += "Copy";

		copyFile = String.format("%s\\%s%s", parent, fileName, ext);
		System.out.println(copyFile);
		fileCopyTextStream (sourceFile,copyFile );

		//파일 copy 해보기

	} //main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		 long start = System.nanoTime();

		
		final int BUFFER_SIZE = 1024;

		try (FileReader reader = new FileReader(sourceFile);
				FileWriter writer = new FileWriter(copyFile);
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);	//한꺼번에 읽고
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);	//한꺼번에 쓰겠다
				){
			
			/*
			 * String line;
			 
			while (line = br.readLine()) != null) {
				bw.write(line);
			}
			*/
			char[] cbuf=new char[BUFFER_SIZE];	//****정확하게 이해하기
			int readCharNumber; //실질적으로 읽어온 캐릭터의 수
			while ((readCharNumber = br.read(cbuf)) != -1) {	//읽어봐서 처리하겠다
				bw.write(cbuf, 0, readCharNumber);
		}
			
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//"자바 파일경로에서 확장자" 검색하기

} //class
