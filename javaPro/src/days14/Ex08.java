package days14;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 *				[상속 계층도]]
		 *					Object
		 *	  ↑									↑	
		 *	Point 						Shape 도형클래스
		 *	Ex.03							    ↑
		 *					Circle 원, Triangle 삼각형, 사각형등등
		 * 	
		 * is -a 관계
		 * 원은 도형이다.
		 * 삼격형은 도형이다.
		 * */
		
		//Point p = new Point(1,2);
		
	}	//main

	
}	//class

class Shape{
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
	void 면적계산() {	//상속관계에서 다시 구현 (재정의하겠다) : 오버라이딩
		
	}
	
}//class Shape
class Circle extends Shape{
	//원점, 반지름
//	int x;
//	int y;
	Point center; // has - a 관계
	int r; //radius 반지름

	Circle() {
	}
	
	Circle(int x, int y, int r){
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r){
		this.center = center;
		this.r=r;
	}
	
	@Override
	void 면적계산() {
		//반지름*반지름*3.14
		}
}

class Triangle extends Shape{
	Point[] p = null;
	
	public Triangle(Point[] p ) {
		this.p=p;
	}
	
	void 면적계산() {
		//가로 * 세로 * 1/2
	}
}