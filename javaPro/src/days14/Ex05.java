package days14;

public class Ex05 {

	public static void main(String[] args) {
		// [상속관계 (is-a관계)]
		// -상속(inheritance)
		//	기존 클래스를 재사용하여 새로운 클래스를 선언하는 것.
		//					멤버들을 물려받는거다
		//-장점 : 코드 재사용 -> 생산성 향상, 유지보수 용이		┎부모 클래스(수퍼클래스)
		//[접근지정자] [기타지정자] class 클래스명 extends Super 클래스 {
//					멤버(필드,메서드)
//		}
		
//		Point3D p1 = new Point3D(1, 2, 3);
//		System.out.println(p1.x);
		new Point3D(1, 2, 3);
		
	}	//main

}	//class

/*
class Point3D{
	int x;
	int y;
	int z;
	
	Point3D(){}
	Point3D(int x, int y, int z){
		this.x =x;
		this.y=y;
		this.z=z;
	}
}
*/

class Point3D extends Point2D{	//point2D에 상속받겠다 / extends : 확장(연장)된
//	int x;
//	int y;		쓰지않아도 물려받는다
	int z;
	
	Point3D(){
		System.out.println("Point3D 객체 생성 - 디폴트생성자 호출됨.");

	}		//생성자는 상속되지않는다
	Point3D(int x, int y, int z){
		//부모(super) 클래스로 부터 물려받은 필드 초기화		
//		this.x =x;
//		this.y=y;
		super(x, y); //부모의 매개변수 호출하여 xy초기화한다
				
		this.z=z;
		System.out.println("Point3D 객체 생성 - 3 호출됨.");

	}
}

//기존 클래스
class Point2D{
	int x;
	int y;
	
	Point2D(){
		System.out.println("Point2D 객체 생성 - 디폴트생성자 호출됨.");
	}
	Point2D(int x, int y){
		this.x =x;
		this.y=y;
		System.out.println("Point2D 객체 생성 - 2 호출됨.");

	}
}
