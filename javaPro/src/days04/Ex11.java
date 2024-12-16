package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오후 4:11:45
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		// continue 문
		// [for 문] 
		/*실행문이 하나일때는 생략가능
		 * 
		 */
//		int sum = 0;
//		for ( int i =1	;i<=10	;i++ ) {		// for (;;) { 무한루프를 돌리겠다
//			if( i==5) continue;
//			System.out.printf("%d+",i);
//			sum += i;			
//		} //for
//		System.out.printf("=%d",sum);

		// [while] 문
//		1.
		int i = 1, sum=0;
		while (i<=10) {
			if (i !=5) {
				System.out.printf("%d+",i);
				sum += i;
				i++;
			}
		}	//while
		System.out.printf("=%d", sum);
		
//		2.
//		int i = 1, sum=0;
//		while (i<=10) {		// 5<=10 참
//			if(i==5) {
//				i++;
//				continue;
//			} //if
//			System.out.printf("%d+",i);		// 4+
//			sum += i;
//			i++;
//	
//		}	//while
//		System.out.printf("=%d", sum);
//		3.
//		int i = 0, sum=0;
//		while (++i<=10) {		// ++i 전위형 증가를 먼저 한다음에 비교 1<=10
//			if(i==5) continue;
//			System.out.printf("%d+",i);		// 1+
//			sum += i;		//1
//		}	//while
//		System.out.printf("=%d", sum);
		
		
	}	//main

}	//class
