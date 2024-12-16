package days07;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오후 3:08:30
 * @subject		정보처리시험문제에 나옴
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 계차수열
		//	term(항) 1+2+4+7+11+16+22	항의 갯수가 20개 까지의 항
		//	 				1  2  3   4    5    6		계차(difference)
		
		int term = 1;
		int difference = 0;
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			term +=difference;
			System.out.printf("%d+",term);
			difference++;
			sum += term;
		}
		System.out.printf("=%d\n",sum);
	


	}	//main

}	//class
