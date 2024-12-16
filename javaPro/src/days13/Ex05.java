package days13;

/**
 * @author dnb
 * @date 2024. 7. 17. - 오후 12:34:46
 * @subject		[생성자(constructor)]
 * @content		1. 일종의 메서드이다
 * 						2. 메서드명 == 클래스명
 * 3. 리턴자료형x	(void 자체도 없다 : 리턴할일이 100%없다)
 * 4. 역할 : 필드 초기화
 * 5. 호출시기 : 인위적으로 호출x
 * 					객체 생성할 때 자동으로 호출.
 * 					new Tv();
 * 6. 오버로딩 가능함(아래쪽에 써놨음)
 * 7. 디폴트 생성자 (default constructor)
 * 		:매개변수가 없는 생성자.
 * 8.	생성자는 상속되지 않는다. **안배운건데 암기
 * 9. 생성자는 접근지정자는 사용가능 , 기타제어자는 사용불가
 * 10. 컴파일러에 의해서 생성자가 1개도 없는 경우에
 * 		컴파일러가 자동으로 디폴트 생성자를 생성한다.	(-여태 문제가 없었던 이유)
 */
public class Ex05 {
	
	public Ex05() {		//생성자
	}
	public Ex05(String msg) {		//생성자-오버로드
	}
	/*접근지정자 기타제어자 리턴자료형 함(매개...) {
		re
	}*/
	

	public static void main(String[] args) {
	
		/*
		Point2 p1 = new Point2 (10, 20);
		p1.disPoint();
		
		Point2 p2 = new	Point2(1, 2);
		p2.disPoint();
		
//		p1.plusPoint(p2);
//		
//		p1.disPoint();
//		
		Point p3 = p1.plusPoint (p1,p2);
		p3.disPoint();
		
*/
		
		//객체(클래스) 배열
		Point2 [] points = {
				new Point2 (10, 20),
				new	Point2(1, 2)
		};
	}

}
