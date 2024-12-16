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
public class Ex03 {

	public static void main(String[] args) {
		char one;
		Scanner scanner = (new Scanner(System.in));
		System.out.print("한 문자 입력?");
		one=scanner.next(). charAt(0);

			if ('가' <= one && '힣' >= one) {
				System.out.println("한글");}
				else if ('A' <= one && 'Z' >=one) {System.out.println("영어-대문자");}
				else if ('a' <= one && 'z' >=one) {System.out.println("영어-소문자");}
				else if ('0' <= one && '9' >=one) {System.out.println("숫자");}
				else if (one == '!' || one == '?' || one == '~' ) {System.out.println("영어-대문자");}
				else System.out.println("알수없는 문자");
			}//main
	}//class
