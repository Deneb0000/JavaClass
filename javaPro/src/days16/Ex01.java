package days16;

public class Ex01 {

	public static void main(String[] args) {
		/*	[예외 처리(Exception Handling)]
		 * 1. 프로그램 오류(에러)
		 * 	프로그램 오작동 또는 비정상 종료되는 원인
		 * 2. 오류의 발생 시점에 따라
		 * 	1) 컴파일 오류
		 * 		javac.exe Hello.java
		 * 		int i = 10;
		 * 		
		 * 	2) 런타임(실행) 오류
		 * 		java.exe Hello
		 * 		int [] m = null;	// 실행오류
		 *		m[0] = 100;
		 *		
		 *		ㄱ.에러(Error)	-	메모리 부족, 스펙 오버 플로워, 복구할 수 없는 심각한 오류
		 *			Error 클래스 존재함
		 *		ㄴ.예외(Exception)	-	개발자가 수습할 수 있는 비교적 덜 심각한 실행 오류.
		 *			Exception 부모클래스
		 *				ㄴ자식클래스
		 *	
		 *	3) 예외 클래스 상속 계층도
		 *		Object
		 *		
		 *		Throwable (~able : 인터페이스)
		 *
		 *	Exception					Error
		 *									ㄴ OutOfMemoryError
		 *	ㄴRuntimeException 실행예외
		 *		- 개발자의 실수로 발생하는 예외
		 *		NullPointerException
		 *		ClassCastException
		 *		IndexOutOfBoundException
		 *				:
		 *				:
		 *
		 *	ㄴ제외한 Exception 자손클래스
		 * 
		 * 4. 프로그램 실행 시 발생할 수 있는 예기지 못한 예외에 대비한 코드를 작성하는 것
		 * 	-> 예외처리
		 * 	- 프로그램의 비정상적인 종료 막고, 정상 상태를 유지 하기 위한 것.
		 * 	-프로그램(ctrl+f11)이 실행할 때 만약에 예외(Exception)이 발생하면
		 *	 JVM이 "예외처리기(UncaucghExceptionHandler)"가 예외를 받아서
		 *	 예외의 원인을 화면에 출력한다.
		 *
		 * 5. 예외 처리
		 * 	1) try ~ catch문
		 * 	2) throws 문 (우리가 항상 클릭해서 만드는 것)
		 * 
		 * 
		 * */

	} //main

}	//class
