package days21;

import java.util.Scanner;

import lombok.Getter;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 9:14:02
 * @subject	어노테이션
 * @content
 *
 */

@Getter		//"(다른 프로그램)컴파일러야
			// (미리 약속된 형식)getter 매서드 자동으로 추가해라" 라는 뜻
public class Ex02 {
	
//	@Override
//	컴파일러에게 오버라이딩 한 메서드이다... 알려주는 것이 어노테이션의 역할
	public static void main(String[] args) {
		/*
		 * 
		 * [어노테이션(Annotation)]
		 * 1. 사전적 의미 : 주석
		 * 2. 정의*** : 프로그램의 소스 코드 안에 다른 프로그램을 위해서 미리 약속된 형식을 포함 시키는 것
		 * 			 *약속된 의미*
		 * 3. jdk에서 기본적으로 재공하는 어노테이션 : 표준 어노테이션 (롬복x)
		 * 4. 표준 어노테이션의 종류
		 * 	1) @Override
		 * 	2) @Deprecated : (취소선), 생성자, 필드, 매서드가 앞으로 없어질 예정이다
							 (다음패치때 사라진다)
		 * 	3) @SuppressWarnings : 컴파일러의 특정 경고 메시지가 나타나지 않게하는 것
									(ex. 스캐너 사용할때 나옴)
									"unused", "resource"						
		 * 	4) @FunctionInterface : 함수형 인터페이스 (람다할때 나온다)
		 * 	5) @SageVarargs : 제네릭 타입의 가변인자에 사용
		 * 	6) @Native : C언어 메서드 -> 자바 코딩 사용 //C 언어라 잘 사용안할듯 
		 *  
		 *  또 다른 어노테이션에 사용되는 어노테이션 : 메타 어노테이션
		 *  @Target, @Documentes, @Inherited, @Retention, @Repeatable
		 * 
		 * */
		
		//The value of the local variable scanner is not used
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);

	} //main

} //class Ex02 
