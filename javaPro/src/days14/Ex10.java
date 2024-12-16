package days14;

//static import문
import static java.lang.Math.random;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 	1. 패키지 (package)
		 *	 	- 서로 관련 있는 클래스, 인터페이스들의 묶음
		 * 	2. 클래스 효율적인 관리
		 * 3. 예)
		 * 			java.io 패키지
		 * 			java.net 패키지
		 * 				:
		 * 			java.util 패키지
		 * 4. 패키지명 + 동일한 이름의 클래스
		 * 		패키지명을 충돌을 막기 위해서는 도메인명 == 패키지명으로 사용
		 * 		naver.com => com.naver.프로젝트명
		 * 5. 패키지명 == 물리적으로 디렉터리(폴더) 생성
		 * 		java.io 패키지명		java 폴더
		 * 										ㄴio 폴더 생성
		 * 6. 자바파일의 첫 문장에 package 패키지명;
		 * 7. 패키지명은 소문자로 작명한다.
		 * 8. 다른 패키지의 클래스를 사용할 때는 import문을 사용해서 클래스가포함된 패키지명을 적어준다.
		 * 9. 풀네임(full name)을 적으세요..
		 * 			ㄴ 패키지명.클래스명
		 * 10. import문이 없는 경우에는 ctrl + shift + o 자동으로 import문 완성
		 * 11. import java.io.*;
		 * 		java.io 패키지 안의 모든 클래스를 import 하겠다.
		 * 			예) com.sist
		 * 						ㄴ Student.class
		 * 				 com.sist.class5
		 * 						ㄴ Member.class
		 * 				import com. sist.*; => 'com.sist'만 참조
		 *
		 * 12. import javaj.lang.*; 컴파일러가 자동 추가
		 * 
		 * */

		System.out.println(Math.PI); //*import javaj.lang.*; 컴파일러가 자동 추가
		System.out.println(/*Math.*/random());	//static import문을 사용하면 
	}	//main

}	//class
