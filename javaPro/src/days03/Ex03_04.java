package days03;

import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 2:42:57
 * @subject		[S]canner 클래스 
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {

		String name;
		byte kor, eng, mat;
		short tot;
		double avg;

		Scanner scanner = new Scanner(System.in);
		
		// 김인경 98 87 77 
		System.out.print("> 이름, 국어, 영어, 수학 입력?");
		
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();
		
		tot = (short) (kor + eng+ mat);	
		avg =(double) tot / 3;
		
		System.out.printf(" %s\t%d\t%d\t%d\t%d\t%f\n",
				name,kor,eng,mat, tot, avg);
		
	}

}
