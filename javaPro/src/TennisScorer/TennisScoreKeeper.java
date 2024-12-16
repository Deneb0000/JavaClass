package TennisScorer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TennisScoreKeeper {

    private int numSets; // 세트 수
    private Player player1;
    private Player player2;
    private Game game; // 게임 변수
    private Set set; // 세트 변수
    private ScoreBoard scoreBoard; // 점수 출력 클래스

    private PrintWriter fileWriter; // 파일 출력 스트림
    private PrintWriter consoleWriter; // 콘솔 출력 스트림

    public TennisScoreKeeper(int numSets, String player1Name, String player2Name) {
        this.numSets = numSets;
        this.player1 = new Player(player1Name, numSets);
        this.player2 = new Player(player2Name, numSets);
        this.set = new Set(player1, player2, 0);
        this.game = new Game(player1, player2, set.getCurrentSet());
        this.scoreBoard = new ScoreBoard();

        try {
            // 파일 출력 스트림 생성(추가 모드로)
            this.fileWriter = new PrintWriter(new FileWriter(".\\src\\TennisScorer\\ResultTennis.txt", true));
            // 콘솔 출력 스트림을 위해 원래 System.out 사용
            this.consoleWriter = new PrintWriter(System.out, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printToFile(String message) {
        if (fileWriter != null) {
            fileWriter.println(message);
        }
    }

    private void printToConsole(String message) {
        if (consoleWriter != null) {
            consoleWriter.println(message);
        }
    }

    // 포인트 승리 처리
    public void pointWinner(int p) {
        game.pointWinner(p);
        set.checkSetWinner();

        // 세트 업데이트 -> 게임 클래스에 반영
        game.setCurrentSet(set.getCurrentSet());

        if (player1.getSetsWon() > numSets / 2 || player2.getSetsWon() > numSets / 2) {
            String resultMessage = "WINNER! : " + (player1.getSetsWon() > player2.getSetsWon() ? player1.getName() : player2.getName());
            printToConsole(resultMessage); // 콘솔에 WINNER! 메시지 출력
            printToFile(resultMessage); // 파일에 WINNER! 메시지 출력

            // 파일 출력 스트림 닫기
            if (fileWriter != null) {
                fileWriter.close();
            }

            System.exit(0);
        }

        String score = scoreBoard.getCurrentScore(player1, player2, set.getCurrentSet());
        printToConsole(score); // 콘솔에 점수 출력
        printToFile(score); // 파일에 점수 출력
    }
}

