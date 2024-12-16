package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 11:39:50
 * @subject
 * @content
 *
 */
public class Ex02_06 {

	public static void main(String[] args) {
		//85.86kb
		String parrent = ".\\src\\days22";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
		//10kb씩 잘라서 분리 한다 양성과정(E)_1.xlsx	양성과정(E)2.xlsx	양성과정(E)_3.xlsx
		File file = new File(parrent, child);
		System.out.println(">파일크기:" + file.length()+"(bytes)");

		final int VOLUME = 10*1024; //10kb 파일을 자르고자하는 코딩

		String baseName = getBaseFileName(child); //~~~양성과정(E)
		String ext = getExtension(child); //.xlsx

		FileOutputStream fos = null;	//try
		BufferedOutputStream bos = null;

		int code = 0; //한바이트로 저장할 변수 선언
		int index = 0; // 양성과정(E)_1.xlsx, 양성과정(E)_2.xlsx, 양성과정(E)_3.xlsx
		int i = 0; //읽어온 바이트 수


		try(FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);) {

			while ((code = bis.read()) != -1) {
				if(i % VOLUME == 0) {//10kb 다 찼다는 뜻
					if(i != 0) bos.close(); // 파일을 저장하겠다

					//양성과정(E)_1.xlsx
					child = String.format("%s_%d%s", baseName, ++index, ext); //새로 저장될 파일 이름
					File temp = new File(parrent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}
				bos.write(code);
				
				i++;
			}//while
			
			bos.close(); //빠져나가서 저장 다시 올라갈 필요없다 오지머

		} catch (Exception e) {
			e.printStackTrace();
		}



	} //main

	//확장자를 반환하는 메서드
	public static String getExtension (String fileName){
		int pos = fileName.indexOf(".");
		return fileName.substring(pos);
	}

	//확장자를 제외한 파일명을 반환하는 매서드
	public static String getBaseFileName (String fileName){
		int pos = fileName.indexOf(".");
		return fileName.substring(0,pos);
	}
}//class Ex_02_06
