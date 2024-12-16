package days21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 11:14:39
 * @subject Ex01.java -> Ex01Copy.java		파일을 복사해보자
 * @content	FileReader 		FileWriter
 *					1문자
 */
public class Ex05 {

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
