package days22;

import java.io.File;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오전 10:33:25
 * @subject
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		String parent = ".\\src\\days22";
		//days22 폴더 안에 upload 폴더의 유무한 후, 없을 경우에 폴더를 생성하는 코딩
		File uploadDir = new File(parent, "uploade");
//		System.out.println(uploadDir.exists()); //존재물어봄 ->false
		if (!uploadDir.exists()) /*폴더가 없다면*/{
			//days22\\ upload\\temp
			//uploadDir.mkdir(); //디렉토리를 만들다
			//uploadDir.mkdirs();	//만들어지면 true 만들어지지않으면 false
			System.out.println(uploadDir.mkdirs());
		}else {//폴더가 있을경우
			// upload 폴더 삭제
			System.out.println(uploadDir.delete());
			// uploadDir.deleteOnExit // 임시폴더 삭제
		}
		

	} //main

} //Ex02_04
