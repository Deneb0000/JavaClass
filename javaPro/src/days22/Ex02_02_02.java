package days22;

import java.io.File;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 9:44:39
 * @subject
 * @content
 *
 */
public class Ex02_02_02 {

	public static void main(String[] args) {

		//days21 폴더 안에서 자바파일(.java)만 조회
		String pathname = ".\\src\\days21";
	/*	File parent = new File(pathname);
		String [] list = parent.list(); //하위 디렉토리
		for (int i = 0; i < list.length; i++) {
			
//			System.out.print(list[i]+"/");
			File child = new File(parent, list[i]);
			if(child.isFile()==true){
				if(child.getName()== ".java")
					System.out.println(child.getPath());;
				//이름중에 java가 있으면 트루
				
			}
			*/
			
		File file = new File(pathname);
		File [] list = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isFile()) {
				String fileName = f.getName();
//				matches(".*\\.java$")
			if(	fileName.endsWith(".java")) { //.java로 끝나는것 
			System.out.println(fileName);}
			}
		}


	} //main

} //class Ex02_02 
