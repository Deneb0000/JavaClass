package days08;

/**
 * @author dnb
 * @date 2024. 7. 10. - 오후 5:07:14
 * @subject	
 * @content		메서드 호출
 *						매개변수 + 메서드 호출 방법
 *						1)	Call By Name
 *						2)	Call By Value
 *						3)	Call By Reference
 */
public class Ex05 {

	public static void main(String[] args) {
		//메서드 호출
		//drawLine(); //1)Call By Name -매개변수가 없음
		
		//2)Call by Value - 매개변수(10,20)을 넣어서 부름
		int a = 10, b= 20;
		System.out.println(hap(a, b));		
		
	}	// main
//메서드 선언 부분
	public static int hap(int a, int b) {
		return a+ b;	//호출한곳에 리턴값을갖고 올라간다
	}
	public static void drawLine() {
		System.out.println("-------------");
	}
	
}	//class
