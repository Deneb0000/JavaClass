package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오후 3:40:15
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		// [문제] 1~10 까지의 합을 출력
		// 1+2+3+4+5+6+7+8+9+10=55
		// for문
		/*
		int sum = 0;		//총합을 저장할 변수
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d+",i);
			sum += i; // sum = sum +i;		// 누적시켜서 할당하겠다			
		} 
		System.out.printf("=%d\n",sum);
		 */
		
		// [문제] 1~10 까지의 합을 출력
		// 1+2+3+4+5+6+7+8+9+10=55
		// while 문
//		int sum =0;
	/*	int i = 1;
		while (i <=10) {
			if (i==10) break;
			System.out.printf("%d+",i);
		} //while
	오답*/
		int i =1, sum = 0;
		while (i<=10) {
			System.out.printf("%d+",i);	//1+
			sum += i;
			i++;	//	2
			}
		System.out.printf("=%d\n",sum);
		
		
		
	}

}
