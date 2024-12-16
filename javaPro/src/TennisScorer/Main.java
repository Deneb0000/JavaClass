package TennisScorer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
	
        try (Scanner scanner = new Scanner(System.in)) {
        	
            int numSets = 0;
            String player1Name;
            String player2Name;

            // Set number 입력 처리
            while (true) {
                System.out.print("세트 수 입력..? (3 or 5): ");
                try {
                    numSets = scanner.nextInt(); //세트 수 입력 받기
                    if (numSets == 3 || numSets == 5) {
                        break;
                    } else {
                        System.out.println("3 or 5 선택!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("숫자(3 or 5) 입력!!");
                    scanner.next(); 
                }
            }

            // 이름 입력 받기
            System.out.print("Player1 이름 입력?: ");
            player1Name = scanner.next();
  
            System.out.print("Player2 이름 입력?: ");
            player2Name = scanner.next();

            // 세트,이름,넘겨주기                                  
            TennisScoreKeeper scoreKeeper = new TennisScoreKeeper(numSets, player1Name, player2Name);

            // 게임 진행
            while (true) {
                System.out.print("pointwinner 선택? (1 or 2): \n\n");
                try {
                    int pointWinner = scanner.nextInt();
                    if (pointWinner == 1 || pointWinner == 2) {
                        scoreKeeper.pointWinner(pointWinner);
                    } else {
                        System.out.println("1 or 2 입력!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력 1 or 2 입력!!");
                    scanner.next(); 
                }
            }
        }  	
}//main

}//class
