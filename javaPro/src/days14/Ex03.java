package days14;

/**
 * @author dnb
 * @date 2024. 7. 18. - 오전 10:28:43
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//객체(클래스) 복사와 복제
		//[생성자(를 통한) 복제]
		Point p1 = new Point(1,2);	//point p2 = p1; 클래스 복사
//		
//		Point p2 =new Point();	//복제
//		p2.x = p1.x;
//		p2.y = p1.y;
//		
//		Point p2 = new Point(p1.x, p1.y);
		
		Point p2 = new Point(p1); // <-[생성자(를 통한) 복제]
		
	}	//main

}	//class

//컴파일러가 자동으로 object 클래스 상속 해버렸다
class Point /*extends Object */{	
	int x, y;					//ㄴ 모든 클래스의 최상위 클래스는 java.lang.Object 이다.
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
}