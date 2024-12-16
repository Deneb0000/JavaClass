package days02;

/**
 * @author dnb
 * @date 2024. 7. 2. - 오후 12:36:02
 * @subject 자바 표준 출력 함수
 * @content println(), print(), printf()
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 이름 변수 선언
		// 키를 저장할 변수
		String name;		double  height;
		
		name = "김인경";
		height = 157.08;
		
		// [출력형식]
		// 이름은 "김인경"이고, 키는 157.08cm 이다.
		
//		System.out.print("이름은 ");
//		System.out.print(name);
//		System.out.print("이고, 키는");
//		System.out.print(height);
//		System.out.print("cm 이다.");
//		
//		// + 문자열 연결 연산자
//		System.out.print("이름은"+name+"이고, 키는"+height+"cm 이다.");		
//		
		// 출력형식이 있는 경우 출력하는 메서드 : printf()		+ format(형식)
		// 1)기능 : 출력형식을 갖고 출력됨		2)매개변수		3) 리턴값 PrintStream
//		System.out.printf(String format, Object. . . /가변인자 (길이가 정해지지않음)args );
		// String name => printf(	%s	) conversion컨버젼이라고 한다
		// double name => printf(		%f	) 
		System.out.printf("이름은 \"%s\"이고, 키는 %.2fcm 이다.",			// \" : 이스케이프문자
name, height);
		
	}

}
