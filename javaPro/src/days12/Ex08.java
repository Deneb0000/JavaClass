package days12;

/**
 * @author dnb
 * @date 2024. 7. 16. - 오후 3:44:21
 * @subject		객체(클래스) 배열
 * @content
 *
 *						국어점수 5000명
 *						int kor = 90;
 *						int kor0001 = 100;
 *								:
 *						int kor5000 = 93;
 *						이럴때 배열 (동일한 자료형)
 *
 *						int [] kors = new int [5000];
 *						
 *						Point p1 = new Point();
									:
 *						Point p5000 = new Point();
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// points 는 배열명	객체명x
		Point [] points = new Point[5000];
		
		//클래스배열을 사용할 때 주의할 점
		points[0] = new Point();
		
		points[0].x=10;
		points[0].y=20;
		points[0].disPoint();
		
	}	//main

} //class
