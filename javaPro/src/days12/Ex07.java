package days12;

public class Ex07 {

	public static void main(String[] args) {
		//	Call By Name
		//	Call By Value
		//	[Call By Reference]
		int x =10, y=20;
		
		System.out.printf("x=%d, y=%d\n",x,y);
		
		swap(x,y);
		
		System.out.printf("x=%d, y=%d\n",x,y);
		

	}	//main

	private static void swap(int x, int y) {
		int temp	=	x;
		x= y;
		y= temp;
		
	}

}//class
