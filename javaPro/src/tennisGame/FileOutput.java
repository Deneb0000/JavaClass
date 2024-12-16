package tennisGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileOutput {

    private PrintStream originalOut;
    private PrintStream fileOut;

    // 파일 출력 스트림 설정
    public void startFileOutput(String fileName) throws FileNotFoundException {
        originalOut = System.out;
        fileOut = new PrintStream(new File(fileName));
        System.setOut(fileOut);
    }

    // 파일 출력 스트림 종료
    public void stopFileOutput() {
        System.setOut(originalOut);
        if (fileOut != null) {
            fileOut.close();
        }
    }
}
