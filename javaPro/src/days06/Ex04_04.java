package days06;
//암기할것있음
import java.util.Random;

public class Ex04_04 {

	public static void main(String[] args) {
/*		// 0~100 국어점수 Math.random() 
		// 1~45 로또번호 Math.random()
		
		//java.util.Random 클래스
		Random rnd = new Random();
		//rnd.nextInt(int bound);
		int kor = rnd.nextInt(101);
		int lotto = rnd.nextInt(45)+1;
//		rnd.nextBoolean() true, false 랜덤하게 참/거짓값을 준다
//		rnd.nextInt();
//		rnd.nextLong();			*/

		//챕처 16. 람다식
		//챕터 17. 스트림 요소 처리
		//						  1<="ints"<101	/ 10개 만들겠다 array배열로
	/*암기	int [] m = new Random().ints(1,101).limit(10).toArray(); */
		
		//			IntStream						OptionalInt													OptioalInt
		int max = new Random().ints(1,101).limit(10).max().getAsInt();
		System.out.println(max);
	}//main

}//class
