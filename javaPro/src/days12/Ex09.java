package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;
	//30명씩 저장해야해
	
	static final int STUDENT_COUNT = 30;
	
	static Student [] students = new Student[STUDENT_COUNT];
	
	Scanner scanner = new Scanner(System.in);
	static int count = 0; //입력받은 학생수
	static char con = 'y' ; // 입력을 계속할지 물어보는 변수
	
	public static void main(String[] args) throws IOException {
		// dyas10. Ex01_02.java -> 클래스 배열 사용 코딩 수정
		//	Student.java
		studentInfomationInput();
		studentInfomationOutput();	

	}	//main

	private static void studentInfomationOutput() {
		System.out.printf("총 학생수 : %d\n", count);
		System.out.println("번호\t 이름\t 국어 \t 수학\t 영어\t total \t 평균");
		
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t ",i+1);
			students[i].dispInfo();
		}
	}
	public static void studentInfomationInput() throws IOException {
		do {
			System.out.printf(">%d번 학생 이름, 국, 영, 수 입력?", count+1);
			
			name = getName(); //scanner.next();
			kor = getScore(); //scanner.nextInt();
			eng =getScore();// scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double) tot /3 ;
			rank = 1;
			
			students[count] = new Student();
			students[count].name =name;
			students[count].kor=kor;
			students[count].eng=eng;
			students[count].mat=mat;
			students[count].tot=tot;
			students[count].avg = avg;
			students[count].rank=rank;
			
			count ++;
			//입력 계속?
			System.out.print("> 학생 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available()); //공백지움
//		} while (con == 'y'||con=='Y' );
		} while (Character.toUpperCase(con) == 'Y' );	//대문자로 바꿔주는 함수
		processRank();
	}
	private static void processRank() {
		//  i =0; j==0, 1,2,3
		for (int i = 0; i < count; i++) {		//행
			//ranks [i]=1;
			students[i]. rank=1;
			for (int j = 0; j < count; j++) {	//열
				if(students[i].tot < students[j].tot) students[j].rank++;
											
			}
			
		}
		
	}

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
	}

}//class
