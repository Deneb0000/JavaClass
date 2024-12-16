package days12;

public class Ex03_02 {

	public static void main(String[] args) {
/*		int [] m = null;
		//The local variable m may not have been initialized : 초기화해야한다.
		//java.lang.NullPointerException	
		:	개체사용때 자주나는 오류 "참조하는곳이 없다(인스턴스가 생성되어있지 않다)"
		System.out.println(m[0]);
			*/
		
		Tv t1 = null;
//		System.out.println(t1.channel );
		
		t1 = new Tv();
		t1 = null;
		tvTest(t1);

	}	//main

	private static void tvTest(Tv t1) {
		System.out.println(t1.channel );
	}	//tvTest

}	//class
