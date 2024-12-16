package days13;

public class Point2 {
	//filed
	private int x ;
	private int y  ;
	
	//constructor
	public Point2(int a, int b) {
		//필드초기화
		x=a;
		y=b;
	}
	
	public Point2() {	//디폴트생성자
		// TODO Auto-generated constructor stub
	}
		

	//getter / setter	[Alt + Shift + s]
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	//method
	public void disPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}

	public void plusPoint(Point2 p) {
		//x 호출한개체x
		x= x + p.x;
		x= y + p.y;
}//point
	
	
	public Point2 plusPoint(Point2 p1, Point2 p2) {
		int x= p1.x + p2.x;
		int y= p1.y + p2.y;
		
		//The constructor Point2() is undefined	//생성자가 1개라도 선언하면 컴파이러는 추가하지 않는다
		Point2 p = new Point2();
		p.x = x;
		p.y = y;

		//		Point2 p = new Point2(x,y);	//혹은 디폴트 생성자는 추가해야한다

		return p;

	}
}