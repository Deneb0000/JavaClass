package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 10:16:43
 * @subject
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// 검색해서 해당되는 곳 찾아주는 작업
		// Line		Text	Path
		String pathname = ".\\src\\days21";
		String keyword = "DataInputStream";
		File parent = new File(pathname);

		File [] list = parent.listFiles((dir, name) -> name.endsWith(".java"));

		File child = null;
		int line = 0; //라인번호
		String text = null;
		String path = null;
		String fileName = null;
		String strLine = null;

		for (int i = 0; i < list.length; i++) {
			child = list[i];
			fileName = child.getName();
			line =1;

			try(FileReader reder = new FileReader(child);
					BufferedReader br = new BufferedReader(reder);
					){
				while ((strLine =br.readLine()) != null) {
					if(strLine.contains(keyword)) {
						strLine = strLine.replaceAll(keyword, "***"+keyword+"***");
						//								ㄴ찾고자하는 문자열만 앞뒤에 별3개 붙히기
						System.out.printf("%d\t%s\t%s\n", line, strLine,fileName);
					} //if
					line++;	
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
		} //for


	}//main

}//Ex02_03
