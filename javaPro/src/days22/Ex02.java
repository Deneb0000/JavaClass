package days22;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 9:16:42
 * @subject		하위 폴더, 파일 조회
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		String currentDirectory =	System.getProperty("user.dir");
		//		System.out.println(currentDirectory); //C:\Class\Workspace\JavaClass\javaPro
		File parent = new File(currentDirectory);
		//		System.out.println(parent.isDirectory()); //true

		//하위 폴더, 파일 조회 ...
		//		String [] parent.list();		//하위 디렉토리 + 파일의 목록을 반환하는 메서드
		//		String [] parent.list(filter)	//필터링된 하위 디렉토리 + 파일목록
		//		File [] parent.listFiles()		//
		//		File [] parent.listFiles(filter)//

		/*
		String [] list = parent.list(); //하위 디렉토리
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+"/");
			File child = new File(parent, list[i]);
			System.out.println(child.isFile()? "파일":"폴더");
			}//for
		 */

		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			String name = child.getName();
			System.out.printf("%s\t%s\t%s\t%d\n",
					child.isFile()? "파일":"[폴더]",name,sdf.format(child.lastModified()),
							child.length());
		}
		


	} //main

} //class Ex02 {

