package days12;

/**
 * @author dnb
 * @date 2024. 7. 16. - 오후 2:26:10
 * @subject		접근지정자 설명
 * @content		1) 클래스 선언
 * 						ㄱ. public	-	패키지 내부 또는 외부 어디서든 상속과 참고자 가능한 상태
 * 						ㄷ. package(default) /안붙을수있다/ - 패키지 내부에서만 상속과 참고 가능
 * 						
 * 						비활성화(선택x)
 * 						-독립적인 클래스를 선언할 때는 사용할 수 없는 접근지정자이다.
 * 						-(중첩 클래스 안에서 사용할 수 있는 접근지정자)
 * 						ㄴ. protected
 * 							- package 접근지정자 + 패키지 외부에는 상속만 가능하다.
 * 						ㄹ. private
 *							- 같은 파일 내에서만 상속, 참조 가능하다. 
 *
*						2)멤버들(필드, 메서드) 선언
*						ㄱ. public
*						ㄴ. protected
*						ㄷ. package
*						ㄹ. private
*
*				[기타제어자]
*				1)클래스 앞에...
*				 	ㄱ. abstract - 추상 클래스
*					ㄴ. final - 최종 클래스 (상속)
*					ㄷ. static 비활성화 x
 */	
public class Ex05 {

	public static void main(String[] args) {
		

	}//main

}//class

//The public type Member must be defined in its own file
class Member{
	protected class Address{
		
	}//Address
}
