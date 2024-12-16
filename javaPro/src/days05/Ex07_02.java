package days05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author dnb
 * @date 2024. 7. 5. - 오후 2:51:26
 * @subject  컴퓨터 - 사용자(USER)
 * @content  [ 가위(1), 바위(2), 보(3) 게임 ]
 *           컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 *           사용자는 1~3  입력.
 *           0~100점수		:
 *           1~45 로또번호	:
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		int com, user;
		
		Scanner scanner = new Scanner(System.in);
		//유저
		com = (int)(Math.random()*3)+1;
		//컴퓨터
		System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
		user = scanner.nextInt();

		String strUser = "가위";
		if (user ==2) strUser = "바위";
		else if (user==3) strUser = "보";
		
		String strCom = "가위";
		if (com ==2) strCom = "바위";
		else if (com==3) strCom = "보";
		//						[0]	[1]	[2]	  [3]
		String [] rps = {"", "가위", "바위", "보"};
		
		System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user]);
		//사용자 코딩
		
switch (user - com) {
      case 0:
         // 무승부
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

	}  //main
	
}

