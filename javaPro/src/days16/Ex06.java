package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {

		String fileName = "SS21.txt";
//		System.out.println(System.getProperty("user.dir"));
		String [] nameArr = getFileContent(fileName);
		
		String content = "<oi><li>"+String.join("</li><li>", nameArr)+"</li></ol>";

		System.out.println(content);


	} //main

	private static String [] getFileContent(String fileName) {
		FileReader reader = null;
		BufferedReader bufferedReader = null;
	
		int one=-1;
		String [] nameArr = new String[10];
		
		
		try {
			reader = new FileReader(fileName);
			bufferedReader = new BufferedReader(reader);
			//보조스트링(2차 스트림)

			String line = null;
			int index = 0;
			while ((line = bufferedReader.readLine())!=null) {
				nameArr[index++]= line;
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
		return nameArr; }
	
}// class
