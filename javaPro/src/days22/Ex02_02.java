package days22;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 9:44:39
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

		//days21 폴더 안에서 자바파일(.java)만 조회
		String pathname = ".\\src\\days21";
		
		
		File file = new File(pathname);
/*
		File [] list =  file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		*/
		
		File [] list = file.listFiles((d, n) -> n.endsWith(".java"));
		
		for (int i = 0; i < list.length; i++) {
			File f =list[i];
			System.out.println(f.getName());
		}


	} //main

} //class Ex02_02 _02
