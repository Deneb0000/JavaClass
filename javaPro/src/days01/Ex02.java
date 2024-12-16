package days01;
//alt + shift + j 
/**
* @author dnb
* @date 2024. 7. 1. - 오후 4:10:57
* @subject 수업 1일차 3번째 예제
* @content	자바 프로그램의 기본 구조 설명
* 					자바 클래스 선언 형식 설명
* 					자바 메소드 (함수) 선언 형식 설명
*
*/
public class Ex02 {

	
	// 1) 기능? 프로그램의 시작/종료 기능
	// 2) 매개변수 ? String[] args X
	// 3) 리턴값은 없기 때문에 리턴자료형 void '돌아온 답정도로 생각하면 될까'
	public static void main(String[] args) {
		/*
		  [1. 자바 프로그램의 기본 구조 설명]
		1)프로그램을 시작하는 물건(객체, 개체,클래스) 필요하다 있어야 한다.
			=시작 개체 Class
		2) 프로그램을 시작(+종료)하는 기능 (메소드, 함수)이 구현되어
			=main() 메소드(method)
			
		  [2. 자바 클래스 선언 형식 설명] 암기 *이해x
		  [접근지정자(public)] [기타제어자] class (_클래스이름*대소문자통일) {
		  *접근지정자+기타제어자 : 모디파이어즈
		  		// {}클래스 몸체(블럭/영역)
		  }
		  
		  
		  [3.자바 메소드(함수=기능) 선헝 형식 설명]
		  	public static[기타제어자] void[리턴자료형] main메서드 이름("매개변수...") {
		  	//
		  	//
		  	[return 리턴값;] '결과값?'
		  	}
		  	
		  	***** 메소드(기능,일) 3가지 파악
		  	1) 기능(일) 파악
		  	2) 매개변수 파악
		  	3) 리턴값( 리턴자료형 )
		*/
		
		// [예] 벽에 시계를 걸기 위해서 못을 친다.
		//		- 물건 : 망치(기능), 못
		// 본인의 이름을 출력하는 코딩.
		// 콘솔창에 출력을 할 수 있는 물건(클래스) : System 클래스'무조건 대문자로 시작'
		System.out.println("김");
		System.out.println("김");
		System.out.println("김");
		System.out.println("김");
		System.out.println("김");
		System.out.println("김");
		//망치.못을 칠수 있는 부분.망치질하다(못);
		//문자의 나열 = 문자열 			"문자열"
		// 한 문자							'이'	'A'
	} //main
	public static void main2(String[] args) {
		System.out.println("o0o?");
		
	}
	
}
