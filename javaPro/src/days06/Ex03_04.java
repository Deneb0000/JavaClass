package days06;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Ex03_04 {

	public static void main(String[] args) {
		int kor ; 
		Scanner scanner = new Scanner(System.in);
		String strKor ;  // ["0"~"100"]
//		String regex = "\\d{1,3}";
		String regex = "\\d{1,2}|100";
		//	[0-9][0-9][0-9]
		// \\d\\d\\d
		// \\d{3}				<- \\d[n] n만큼 출력된다
		// \\d* : 안와도 좋다
		// {n,m}
		int failCount=0;
		do {
			if (failCount!=0) {
				System.out.printf("[%d/3]번 실패!\n", failCount);
				if (failCount ==3) {
					System.out.println("오늘은 더이상 이용할수 없음");
					return;
				}	//if
			} 	//if
			
			System.out.printf("국어 점수 입력?");
			strKor = scanner.next();
			failCount++;
		} while (!strKor. matches(regex));
		kor = Integer.parseInt(strKor);		
		System.out.println(kor);
		

	}	// main

}	//class
