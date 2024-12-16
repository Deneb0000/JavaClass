package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오후 2:01:16
 * @subject		[메모리 스트림]
 * @content		주로 다른 곳에 입,출력 하기 전에 메모리 상에서 데이터를 임시로 저장할 목적으로
 * 				사용하는 스트림
 * 		1) 바이트 스트림
 * 		ByteArray[InputStream] / ByteArray[OutStream]
 * 		2) 문자 스트림
 * 		CharrArray[Reader]/CharrArray[Writer]
 *		3) 문자 스트림	-	자주 쓰임
 *		StringReader / StringWriter
 */
public class Ex07 {

	public static void main(String[] args) {
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		try (ByteArrayInputStream bis = new ByteArrayInputStream(buf);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
			int code;
			while ((code = bis.read()) != -1) {
				System.out.println(code);
				bos.write(code);
			}
			//byte[] -> bis -> bos -> byte[]
			byte[] outBuf = bos.toByteArray();
			System.out.println(outBuf);
		} catch (Exception e) {
			e.printStackTrace();
		}

	} //main

} // class 
