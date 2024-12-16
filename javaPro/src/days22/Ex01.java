package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 9:01:12
 * @subject		자바 IO (*끝나면 팀프로젝트 진행 화/수/목 + 금(발표) 끝나면 오라클
 * @content									(람다와 스트림)
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		//  *ㄴ 파일, 디렉토리를 관리(수정, 삭제, 추가 등)하는 클래스
		
//		String pathname =  ".\\src\\days21\\Ex01.java";				
		String pathname =  "C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days21\\Ex01.java";				
		File file = new File(pathname);

		System.out.println( file.getParent()); //.\src\days21
		System.out.println( file.getName()); //Ex01.java
		
		System.out.println( file.getPath()); //.\src\days21\Ex01.java
		System.out.println( file.getAbsolutePath()); // 절대경로 C:\Class\Workspace\JavaClass\javaPro\.\src\days21\Ex01.java
		System.out.println( file.getCanonicalPath()); // 표준경로 C:\Class\Workspace\JavaClass\javaPro\src\days21\Ex01.java
		//결과값이 같다
		
		System.out.println(file.isFile()); //true
		System.out.println(file.isDirectory()); //false
		System.out.println(file.length()); //파일의 크기 1870(byte)
		System.out.println(file.exists()); //파일존재유무 //true 물어보고 삭제하는게 좋잖아
		
		//OS 에서 사용하는 경로 구분자	;
		System.out.println(file.pathSeparator);	
		System.out.println(file.separator);	//OS에서 사용하는 이름 구분자 \
		
		//Ex01.java
		String fileName = file.getName();
		//확장자 - 구하는 메서드가 없다
		String ext; //확장자 저장
		//확장자를 제외한 파일명	 - 구하는 메서드가 없다
		String name;
		//*채워넣기
		
	} //main

} //class Ex01
