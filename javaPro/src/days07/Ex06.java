package days07;

import com.util.Draw2D;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오후 3:32:07
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		// [메소드(함수) = method, function]
		// 1. 정의 : 프로그래밍에서 "반복되는 명령어들"을 찾아서
		//				별도로 묶어서 필요할 때 마다 재 사용하도록 만든 것.
		// 2. 프로그램의 구조화 -> 유지, 보수 등 관리 용이
		// 3. 함수가 기본이 되는 프로그래밍 기법 - 구조적 프로그래밍
		// 		객체가 기본이 되는 프로그래밍 기법 - 객체 지향적 프로그래밍(OOP)
		// 4. 메소드 (함수) 선언 형식
		//		[접근지정자] [기타 지정자] 리턴자료형 함수명 ([매게변수...]){
		//			실행문
		// 			[return 리턴값;]
		//		}
		

		Draw2D.drawLine(); //메소드를 호출 부분 			호출 != 선언
	    System.out.println("부서명 : 사원명");
	    Draw2D.drawLine(30);
	    System.out.println("영업부 : 이시훈");
	    System.out.println("생산부 : 송세호");
	    System.out.println("총무부 : 김준석");
	    System.out.println("자재부 : 김재민");
	    Draw2D.drawLine('^', 50);

	}	//main


//	public static void drawLine(){	//drawLine()메소드 선언 부분
//	    System.out.println("---------------");			//선 긋기,	100줄
//	}	//drawLine
//	
//	public static void drawLine(int length){	// overloading (중복함수)함수명이 같고 매개변수가 다르면 가능
//		for (int i = 1; i < length/*내가 원하는 길이만큼 주겠다*/; i++) {
//			
//			System.out.print("-");	
//		}
//		System.out.println();
//	}
//	
//		public static void drawLine(char style, int length){		// 리턴값이 다르든 같든 중복함수가 아니다
//			for (int i = 1; i < length; i++) {
//				
//				System.out.print(style);	
//			}
//			System.out.println();
//	}
	
}	//class
