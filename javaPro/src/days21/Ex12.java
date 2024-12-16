package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오후 3:44:13
 * @subject		PipedReader / PipedWriter *이런게 있구나
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		// PipedReader / PipedWriter	:스트림을 다루는 객체
		//	ㄴ 스레드 간에 데이터를 입출력할때 사용하는 스트림
		// [RandomAcessFile] 이름 그대로 원하는 위치에 데이터를 읽고 쓸수 있다. 다른 스트림은 못함
		//  ㄴ 파일의 어느 위치에나 읽기/쓰기가 가능한 장점이 있는 스트림
		//	ㄴ getFilePoint() 파일포인트
		//	  seek(위치)
		//	  readXXX(), writeXXX()

		//[RandomAcessFile] 써보기 
		String s = "I Love normal Java";
		String q = "javabook"; 

		String name = ".\\src\\days21\\random.txt";
		String mode = "rw"; //read + write
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			long fp =  raf.getFilePointer();
			System.out.println("현재 파일 포인터 : "+fp);
			raf.writeBytes(s); //그 위치에 쓰기 작업을 하겠다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//일시정지 + 엔터 계속
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(7);
			raf.writeBytes(q); //7째 위치부터 덮어씌워서 쓰기 작업을 하겠다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//일시정지 + 엔터 계속
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2); 
			String line =  raf.readLine();
			System.out.println(line); // 2번째 부터 읽어라
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	} //main

} //class
