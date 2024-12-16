package days21;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오후 2:29:09
 * @subject		DataInputStream 사용
 * @content
 *
 */
public class Ex09_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		//student.txt 파일로 저장
		//홍길동,98,89,,,,true
		String fileName = ".\\src\\days21\\student.txt";
		try ( FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis)) {//읽어오겠다
			//순서 똑같이
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat,tot,avg, gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
