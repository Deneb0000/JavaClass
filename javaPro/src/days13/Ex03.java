package days13;

public class Ex03 {

	public static void main(String[] args) {
		// [메서드 매개변수가 참조형인 (클래스) 경우]
		// [메서드 리턴자료형 참조형인 (클래스) 경우]
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		Point p2 = new	Point();
		p2.x =1;
		p2.y =2;
		p2.disPoint();
		
//		p1.plusPoint(p2);
//		
//		p1.disPoint();
//		
		Point p3 = p1.plusPoint (p1,p2);
		p3.disPoint();
		
		
	}	//main

}	//class
