package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.security.auth.callback.ConfirmationCallback;

/**
 * @author dnb
 * @date 2024. 7. 16. - 오전 9:03:42
 * @subject			3반	각 30명	이름,국,영,수,총,평,등,전교등수 입력, 출력
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;		//행
		final int STUDENT_COUNT = 30;	//열
		
//		String [] [] names = new String[3][30];
		String[][] names = new String[CLASS_COUNT][STUDENT_COUNT];

		//3차원 배열
		//0면 국어, 1면 영어, 2면 수학, 3면 총점, 4면 등수, 5면 전교등
		// 행 - 반(class) 
		// 열 - 학생
		int [][][] infos = new int [6][CLASS_COUNT][STUDENT_COUNT];
		// 2반 19번 학생의 수학점수 			수학2면 행1 열18
		double[][] avgs =new double [CLASS_COUNT][STUDENT_COUNT];
		
		//입력받은 학생수를 저장할 변수 선언
//		int count1 = 0;		int count2 = 0;		int count3 = 0;
//		counts [ban-1] =3
//		counts [ban-1] =5
//		counts [2] =1
//		ban =	1
		int [] counts = new int [CLASS_COUNT];
		//0 - 1반학생수 / 1 - 2반학생수 / 2 - 3반학생수
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		int ban; // 1, 2, 3반
		do {
			//1.반입력
			System.out.printf(">반 입력?");
			ban = scanner. nextInt();
			
			//2. 그 반의 학생 정보 입력?																		1반은 0값(ban-1) counts +1
			System.out.printf(">%d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력?", ban, counts[ban-1]+1);
			
			name = getName(); //scanner.next();
			kor = getScore(); //scanner.nextInt();
			eng =getScore();// scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double) tot /3 ;
			wrank = rank = 1;
			
			names[ban-1][counts[ban-1]] = name;
			infos[0][ban-1][counts[ban-1]] = kor;
			infos[1][ban-1][counts[ban-1]] = eng;
			infos[2][ban-1][counts[ban-1]] = mat;
			infos[3][ban-1][counts[ban-1]] = tot;
			infos[4][ban-1][counts[ban-1]] = rank;
			infos[4][ban-1][counts[ban-1]] = wrank;
			avgs[ban-1][counts[ban-1]] = avg;
			
			counts[ban-1]++;
			
			System.out.print("> 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available()); //공백지움
		} while (Character.toUpperCase(con) == 'Y');
		
		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t 학생 정보 출력 (%d명) \n",총학생수);
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d번 학생 : %d] \n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("[%d]\t	%s\t	%d\t	%d\t%d\t %d\t%.2f\t%d\n",
											i+1,			
											names[i][j],	
											infos[0][i][j],
											infos[1][i][j],
											infos[2][i][j],
											infos[3][i][j],
											avgs[i][j],
											infos[4][i][j],
											infos[5][i][j]);
			}
		}//for i
		
	}	//main
	
	public static int getScore(){
		return (int) (Math.random()*101); //0~100 점수 출력
	} 
	public static String getName() {
		//성 128개
		Random rnd = new Random();
		String [] lastNames = {"김","이","박","최","권","홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];

		//이름 : 2문자
		char [] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) +'가');
		}
		// char[] -> String;
		String firstName = String.valueOf(firstNames);

		name += firstName;

		return name;
	}//getname;

}	//class
