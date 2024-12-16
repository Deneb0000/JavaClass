package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 12:26:46
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) throws IOException {

		//1
//		int i = 2147483647;
		int i = Integer.MAX_VALUE;
		int j = 100;
		
		System.out.println(i);
		long k = (long) i+j;
		System.out.printf("%d+%d=%d\n",i,j,k);
		//=> 2147483647+100=-2147483549 ????

		//String 이름
		//byte 국어, 영어, 수학
		//short 총점, double 평균 계산
		//[출력형식] 홍길동 90 89 91 270 90.00
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name;
//		byte kor, eng, mat;
//		short tot;
//		double avg;
//		
//		System.out.print("> 이름 입력 ?");
//		name = br.readLine();
//		System.out.print("> 국어 입력 ?");
//		kor = Byte.parseByte(br.readLine());
//		System.out.print("> 영어 입력 ?");
//		eng = Byte.parseByte(br.readLine());
//		System.out.print("> 수학 입력 ?");
//		mat = Byte.parseByte(br.readLine());
//		
//		//Type mismatch: cannot convert from i'nt to short
//		//t'ot = kor + eng+ mat;		// +덧셈연산자 //byte + byte + byte =/=byte =int (cpu가 그렇게 처리)
//		tot = (short) (kor + eng+ mat);	
//		avg =(double) tot / 3;	// / 나눗셈연산자
//		
//		System.out.printf(" %s\t%d\t%d\t%d\t%d\t%f\n",
//				name,kor,eng,mat, tot, avg);
	
	}

}
