package days04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {

		Scanner scanner = (new Scanner (System.in));
				
	      String name;
	      byte age;
	      char grade;

	      System.out.print("이름, 나이, 등급 입력하세요 ?");
	      name = scanner.next();
   		  age = scanner.nextByte();
   		  grade = scanner.next().charAt(0);
 

	      System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'"
	            , name , age, grade);



	}

}
