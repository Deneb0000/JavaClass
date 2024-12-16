package days12;

/**
 * @author dnb
 * @date 2024. 7. 16. - 오후 3:19:39
 * @subject			얕은 복제
 * @content			깊은 복제
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
			//개체(클래스) 복제(Clone)
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.m=	new int[3];
		p1.m[0]=1; p1.m[1]=2;
		p1. disPoint();	// 	>x=10, y=20;
		
		//객체복사
		Point p2 = p1;
		p2.disPoint(); // >x=10, y=20
		
		//객체 복제
		Point p3 = new Point();	//값만 같을뿐 다른놈이다
		p3.x = p1.x;
		p3.y = p1.y;				
		
//		p3.m = p1.m; 얕은 복제
		
		
		p3.m = new int[2];
		p3.m [0] = p1.m[0];
		p3.m [1] = p1.m[1];	//깊은 복제 (자기꺼 다쓰고 있다)
		
		p3.disPoint();
	}	//main

}//class
