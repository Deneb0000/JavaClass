package days12;

public class Ex07_02 {

	public static void main(String[] args) {
		//	Call By Name
		//	Call By Value
		//	[Call By Reference]
//		int x =10, y=20;
		
		int [] m = {10,20};
		
		System.out.printf("x=%d, y=%d\n",m[0],m[1]);
		
		swap(m);	//Call By Reference *뭔지 모르겠다 검색 좀 해봐
		
		System.out.printf("x=%d, y=%d\n",m[0],m[1]);
		

	}	//main

	private static void swap(int [] m) {
		int temp	=	m[0];
		m[0]= m[1];
		m[1]= temp;
		
	}//swap

}//class
