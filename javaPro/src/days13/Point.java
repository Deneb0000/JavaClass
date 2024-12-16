package days13;

public class Point {
	//filed
	public int x = 0 ;
	public int y = 0 ;
	
	public Point(int x, int y) {
		this.x  = x;
		this.y = y;
	}

	public Point() {
	}
	
	//p1.plusPoint()
	public Point plusPoint (int temp) {
		Point p = new Point( this.x+temp, this.y + temp);
		thisTest(this);	//매개변수
		return this; // 리턴값으로 사용되는 this의 3번째 용도
	}

	private void thisTest(Point p) {
		p.disPoint();
		
	}

	//method
	// p1. disPoint();	this[p1의 주소]
	// p2. disPoint();	this[p2의 주소]
	public void disPoint() {
		System.out.printf("> x=%d, y=%d\n",this. x, this. y);
	}

	public void plusPoint(Point p) {
		//x 호출한개체x
		this.x = x + p.x;
		x= y + p.y;
	
}//point
public Point plusPoint(Point p1, Point p2) {
	int x= p1.x + p2.x;
	int y= p1.y + p2.y;
	Point p = new Point();
	p.x = x;
	p.y = y;
	
	return p;
}	
}
