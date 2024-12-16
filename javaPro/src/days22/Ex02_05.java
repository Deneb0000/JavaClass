package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 10:49:33
 * @subject
 * @content
 *	https://needjarvis.tistory.com/742 //람다와 스트림 사용할때 코딩 이해해두기
 *https://threenation9.tistory.com/38
 */
public class Ex02_05 {

	public static void main(String[] args) throws IOException {
		/*
		 * days22
		 * 	ㄴ 	temp
		 * 		 ㄴ a.txt 파일
		 * 		 ㄴ b.txt 파일
		 * 		 ㄴ subtemp 폴더
		 * 			 ㄴ c.txt 파일
		 * 			
		 * */
		/*
	      String pathname = ".\\src\\days22\\temp\\subtemp";
	      File f = new File(pathname);
	      f.mkdirs();
	      //따로따로 만들필요없다
	      File atxt = new File(".\\src\\days22\\temp\\a.txt");
	      atxt.createNewFile();
	      File btxt = new File(".\\src\\days22\\temp\\b.txt");
	      btxt.createNewFile();
	      File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
	      ctxt.createNewFile();
		 */
		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);
		if(f.exists()) {
			//			System.out.println(f.delete());
			//삭제가 안되는 이유 : 하위 디렉터리나 파일이 없어야 삭제 가능
			//성능은 떨어지지만 재귀 함수를 사용해야 삭제가 가능하다
			scanDelete(f);
			f.delete();
			System.out.println(f.getName()+" 폴더 삭제");
		}
		System.out.println("end");



	}//Ex02_05 

	private static void scanDelete(File f) {
		File[] files = f.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				file.delete();
				System.out.println(file.getName()+" 파일 삭제");
			} else {
				scanDelete(file.getAbsoluteFile());
				file.delete();
				System.out.println(file.getName()+" 폴더 삭제");
			}
		}
	}



}//class Ex02_05
