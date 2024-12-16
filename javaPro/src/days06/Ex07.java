package days06;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// days05, Ex07_02.java
		
		int com, user;
		
		Scanner scanner = new Scanner(System.in);
		char con = 'y';	//'y' 'Y'
		String regex = "[1-3]";	//정규표현식
		String strUser;
		
		do {			
			com = (int)(Math.random()*3)+1;
			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
				strUser = scanner.next();
				
			} while (!strUser.matches(regex));
			
			user = Integer.parseInt(strUser);

		String [] rps = {"", "가위", "바위", "보"};
		
		System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user]);
	
		switch (user - com) {
		case 0:
         System.out.println("무승부");
         break;
		case 1: case -2:
         // 사람 승리
         System.out.println("사용자 승리");
         break;
		default:
         // 컴퓨터 승리
         System.out.println("컴퓨터 승리");
         break;
		}
			System.out.print("다시 게임할거냐?"); //계속여부
			con = (char) System.in.read();
			System.in.skip(System.in.available() ); //13, 10 제거
		} while (con == 'y' || con == 'Y');
		
		System.out.println("가위바위보 게임종료");

	}

}
