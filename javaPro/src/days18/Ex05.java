package days18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student2;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 4:50:09
 * @subject
 * @content
 *
 */
public class Ex05 {


	public static void main(String[] args) throws IOException {
		// 한 반 30명 학생 성적처리.
		// ㄱ. 배열 선언	string [] names = new String[30];
		// ***ㄴ. 클래스 배열선언	Student [] s = new Student[30];
		// ㄷ. 클래스 배열x -> ArrayList 사용 + Student 요소
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		//30명씩 저장해야해

		final int STUDENT_COUNT = 30;
		ArrayList list = new ArrayList(STUDENT_COUNT); // 자동증감된다

		Scanner scanner = new Scanner(System.in);

		char con = 'y' ; // 입력을 계속할지 물어보는 변수

		do {
			System.out.printf(">%d번 학생 이름, 국, 영, 수 입력?", list.size()+1);

			name = getName(); //scanner.next();
			kor = getScore(); //scanner.nextInt();
			eng =getScore();// scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double) tot /3 ;
			rank = 1;

			/*
			Student s = new Student();
			s.name =name;
			s.kor=kor;
			s.eng=eng;
			s.mat=mat;
			s.tot=tot;
			s.avg = avg;
			s.rank=rank;
			 */
			Student2 s = new Student2(name, kor, eng, mat, tot, rank, avg); 

			list.add(s);	//array list에 한개씩 들어가진다

			//입력 계속?
			System.out.print("> 학생 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available()); //공백지움
			//		} while (con == 'y'||con=='Y' );
		} while (Character.toUpperCase(con) == 'Y' );	//대문자로 바꿔주는 함수
		
		System.out.printf("총 학생수 : %d\n",list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student2 s = (Student2) ir.next();
			System.out.println(s);

		}
	}		//main

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

}
