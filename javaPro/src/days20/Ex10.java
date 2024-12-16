package days20;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 4:44:36
 * @subject	***열거형 ( enums )
 * @content	1. jdk 1.5 추가문법
 *			2. 서로 관련된 상수를 편리하게 사용하기 위한 것
 *				예)	성별	-	남자, 여자 
 *				 int gender = 1/0;
 *				 boolean gender = true / false;
 *				 char gender = 'm' / 'f';
 *				 String gender = "남자"/"여자";
 *				 표준화 X // 표준화 O -> 유지, 보수, 생상성 향상
 *			3. 열거형 선언 형식
 *			 접근지정자 enum 열거형이름{
 *				상수명,	(- 대문자사용)
 *				상수명,
 *				 :
 *}	 		
 *			4. 열거형이름.상수명
 *			5. 열거형은 컴파일 될 때 클래스로 컴파일 된다
 *			  extands.java.lang.Enum 클래스상속
 *			6. Enum 클래스
 *				ㄴ ordinal()	: 열거형 상수가 정의된 순서를 반환함
 *				ㄴ name()	: 열거형 상수명을 문자열로 반환
 *				ㄴ valueOf()	:  name()와 일치하는 "열거형 상수"반환.
 *
 */
public class Ex10 {

	enum Direction {EAST, SOUTH, WEST, NORTH}
	
	public static void main(String[] args) {
		System.out.println(Card.CLOVER);	//CLOVER
		System.out.println(Card.CLOVER.name()); //CLOVER
		System.out.println(Card.CLOVER.ordinal()); //0
		
		switch (Card.valueOf("HEART")) {
		case CLOVER:
			//
			break;
		case DIAMOND:
			//
			break;
		case HEART:
			//
			break;
		case SPADE:
			//
			break;

		default:
			break;
		}
		
		/*if (Gender.남자) {
			
		}else {
			
		}*/

	} //main

} //class Ex10

class Gender{
	public static final boolean 남자=true;
	public static final boolean 여자=false;
	
}