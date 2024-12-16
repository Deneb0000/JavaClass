package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05_02 {

	public static void main(String[] args) {
		//day16.Ex01.java 읽어와서
		//"예외" 문자열이 있는 위치값을 모두 출력...
//		String fileName="C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days16\\Ex01.java";		
		String fileName=".\\src\\days16\\Ex01.java";		
		String content = getFileContent(fileName);
		System.out.println(content);

		/*
		//days11.Ex03.java m배열에서 n(71) 모든 위치값...
		int index, fromIndex = 0;
		while ((index = content.indexOf("예외",fromIndex)) != -1) {	//-1이 나왔다는건 끝까지 돌았다.
			System.out.println(index);
			fromIndex = index+1;
		}
		*/
		
		//예외 문자열을 모두 찾아서 삭제
//		content =	content.replace("예외", "[예외]");		
//		content =	content.replace("예외", " ");		
//		
//		//"홍길[가-힣]"
//		content = content.replaceAll("예외", "[예외]");
		
		
		System.out.println(content);
		
	}//main

	private static String getFileContent(String fileName) {
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		//버퍼기능
		//readLine() 메서드 존재 : 한 라인을 읽어와서 반환하는 메서드
//		String fileName = "C:\\Windows\\comsetup.log";
		
		int one=-1;
		String content = "";
		
		
		try {
			reader = new FileReader(fileName);
			bufferedReader = new BufferedReader(reader);
			//보조스트링(2차 스트림)

			String line = null;
			int lineNumber = 1;
			
			
			while ((line = bufferedReader.readLine())!=null) {
//				System.out.printf("%d : %s\n", lineNumber++, line);
				content+= line;
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
		return content; }

}// class
