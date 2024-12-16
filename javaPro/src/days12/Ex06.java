package days12;

/**
 * @author dnb
 * @date 2024. 7. 16. - 오후 2:51:33
 * @subject		[객체(클래스) 복사와 객체(클래스) 복제]
 * @content						Copy					Clone
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.color = "red";
		System.out.println(t1.color);
		//객체 복사 (copy)
		Tv t2 = t1;
		t2.color = "blue";
		System.out.println(t1.color);
		
		tvText(t1);
		System.out.println(t1.color);
		
		//이해
		int [] m = {1,2,3};
		mTest(m);
		System.out.println(m[1]);
		
	}	//main

	private static void mTest(int[] n) {
		n[1] = 100;
		
	}

	private static void tvText(Tv t) { // Tv t = t1; 객체복사
		t.color = "Green";
		
	}//tvText

}	//class
