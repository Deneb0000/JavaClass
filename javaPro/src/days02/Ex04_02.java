package days02;

/**
 * @author dnb
 * @date 2024. 7. 2. - 오후 2:36:03
 * @subject (암기)
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// [10]	[20]
		//	  x	      y
		/*
		 int x =10;
		 int y =20;
		 */
		
		//콤마연산자
		int x = 10, y = 20;
		System.out.printf	("교환 전 > x=%d, y=%d\n", x, y);
/*
	 y=x;
	 x=y;			둘다 10이되버린다
 */
	// 두 기억공간의 값을 바꾸기 -> 임시기억공간이 필요하다. 여기선 그 공간을 temp로 잡았다
		{
		int temp;		//10
		temp = x;
		x=y;
		y=temp;
		}
		
		System.out.printf	("교환 후 > x=%d, y=%d\n", x, y);
				
	}  //main

} //class
