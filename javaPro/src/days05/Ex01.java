package days05;

import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 5. - 오전 9:00:14
 * @subject		아침테스트
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
//		1. 대문자를 소문자로 변환하는 코딩을 하세요. 
//		문자 : 정수 계열	'a' 97
//	   char uc/*대문자*/ = 'A';  //65 + 32 => 소문자
//	   char lc/*소문자*/ =(char) (uc +32) ;

//		2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
		
//		int sum=0;
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf(i==10?"%d":"%d+",i);
////			if (i==10) {
////				System.out.printf("%d",i);				
////			} else {
////				System.out.printf("%d+",i);
////			}
//			sum += i;			
//		}
//		System.out.printf("=%d\n",sum);

		
		//		7. [입력형식]
//				   팀원들을 입력하세요 ? 홍길동,이시훈, 송세호
//				   [출력형식]
//				   1. 팀원 : 홍길동
//				   2. 팀원 : 이시훈
//				   3. 팀원 : 송세호
//				   
//				   라고 출력하는 코딩을 하세요.  
		@SuppressWarnings("resource")	//p556
		Scanner scanner = new Scanner(System.in);
	   System.out.print("팀원들을 입력하세요 ?");
	   String data = scanner.nextLine();
	   String regex = "\\s*,\\s*";
	   String [] names= data.split(regex);
	   
//	   System.out.printf("1. 팀원 : %s\n",names[0]);
//	   System.out.printf("2. 팀원 : %s\n", names[1]);
//	   System.out.printf("3. 팀원 : %s\n",names[3]);
	   
	   for (int i = 0; i < names.length; i++) {
	         System.out.printf("%d. 팀원 : %s\n", i+1,  names[i]);
	   }
  }

}
