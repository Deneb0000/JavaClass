package days21;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오후 2:29:09
 * @subject		DataOutputStream 사용
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// [DataInputStream / DataOutStream]
		// 바이트 스트림
		// 자바의 기본형 8가지를 읽기/ 쓰기
		String name = "홍길동";
		int kor=98, eng=89, mat=20;
		int tot = kor + eng+ mat;
		double avg = (double) tot/3;
		boolean gender = true;

		//student.txt 파일로 저장
		//홍길동,98,89,,,,true
		String fileName = ".\\src\\days21\\student.txt";
		try (FileOutputStream fos = new FileOutputStream(fileName); 
				DataOutputStream dos = new DataOutputStream/*보조스트림 : 파일아웃스트림 요구*/(fos)) {

			dos.writeUTF("홍길동");
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();

			String info = String.format("%s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat,tot,avg, gender);
//			FileWriter.append(info);
//			FileWriter.flush();
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
