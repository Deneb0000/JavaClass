package days06;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오전 10:44:10
 * @subject
 * @content
			 *1. 한 문자를 입력받아서 
			   한글입니다.
			   알파벳대문자입니다.
			   알파벳소문자입니다.
			   숫자입니다.
			   특수문자입니다.
			   라고 출력하기
			   ( 특수문자는 #$!%@)

 */
public class Ex03_03 {

	public static void main(String[] args) {
		char one;
		Scanner scanner = (new Scanner(System.in));
		System.out.print("한 문자 입력?");
		String strOne = scanner.next();

			if (strOne.matches("[가-힣]")) {
				System.out.println("한글");}
				else if (strOne.matches("[A-Z]")) {System.out.println("영어-대문자");}
				else if (strOne.matches("[a-z]")) {System.out.println("영어-소문자");}
				else if (strOne.matches("\\d")) {System.out.println("숫자");}
				else if (strOne.matches("[!@#$%^&*]") ) {System.out.println("특수문자");}
				else System.out.println("알수없는 문자");
			}
	}
