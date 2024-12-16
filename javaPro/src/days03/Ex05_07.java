package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 5:27:53
 * @subject
 * @content
 *
 */
public class Ex05_07 {

	public static void main(String[] args) {

		// ++ 앞 / 뒤
		int x = 10;
//		int y = ++x;			//x=11, y=11
		int y= x++;			//x=11, y=10
		
		System.out.printf("x=%d, y=%d\n",x ,y);
		
		int m =100;
//		System.out.println(m++ == 100); 	//100 == 100 true
		System.out.println(++m == 100);	// 101 == 100 false
		
		
		/*
		 int n = 10;
		 5증가, 10감소
		 n = n+5;
		 n += 5;
		 
		 n = n-10;
		 n -= 10;
		  */
		
	}

}
