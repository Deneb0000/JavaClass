package days08;

/**
 * @author dnb
 * @date 2024. 7. 10. - 오후 5:17:24
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int x = 10, y = 20;
	      System.out.printf("> 1. main  x=%d, y=%d\n", x, y);
	      /*
	      int temp = x;
	      x = y;
	      y = temp;
	       */
	      swap(x,y);		//3.Call By Reference		내용을 넘기는게 아니라 그릇 자체를 넘겨야한다 
	      System.out.printf("> 2. main  x=%d, y=%d\n", x, y);
	      

	}	//main

	public static void swap(int x, int y) {
		 System.out.printf("> 1. swap  x=%d, y=%d\n", x, y);
		int temp = x;
	      x = y;
	      y = temp;
	      System.out.printf("> 2. swap  x=%d, y=%d\n", x, y);
		
	}

}	//class
