package days21;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import javax.sound.midi.Sequence;

public class Ex10 {

	private static int code;

	public static void main(String[] args) throws IOException {
		/*
		 * [SequenceInputStream]
		 * 순차적인 입력용 바이트 스트림
		 * ㄴ순차적인 : 하나의 파일 용량이 너무 커서 여러 개의 파일로 분리했다고 가정하면 그 분리된 파일을
		 * 			 여러 개의 입력스트림으로 만들고 연속적으로 그 입력스트림을 연결해서 하나의 스트림처럼
		 * 			 데이터를 처리할 수 있는 바이트 스트림
		 * 
		 * 			 예)
		 * 			  a.dat
		 * 				ㄴa_1.dat		stream
		 * 				ㄴa_2.dat       stream
		 * 				ㄴa_3.dat       stream
		 * 					:          
		 * 				ㄴa_100.dat     stream
		 * 				
		 * */

		byte [] a = {1,2,3};
		byte [] b = {4,5,6};
		byte [] c = {7,8,9};

		//바이트를 다루는 메모리 스트림 3개 ...
		// byte[] ->  ByteArrayInputStream 메모리 스트림
		ByteArrayInputStream a_bis = new ByteArrayInputStream(a);
		ByteArrayInputStream b_bis = new ByteArrayInputStream(b);
		ByteArrayInputStream c_bis = new ByteArrayInputStream(c);

		/*
		//SequenceInputStream
		SequenceInputStream sis1 = new SequenceInputStream(a_bis, b_bis); 
		SequenceInputStream sis2 = new SequenceInputStream(sis1, c_bis); 
		 */

		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(a_bis);
		v.add(b_bis);
		v.add(c_bis);

		Enumeration<ByteArrayInputStream> e =  v.elements(); // 벡터-순서유지

		SequenceInputStream sis = new SequenceInputStream(e);

		//출력
		while ((code = sis.read()) != -1) {
			System.out.println(code);
		}
		//안볼지도모르는 코딩 그래도 알아두자
		
	} //main

} //class
