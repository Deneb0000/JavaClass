package days07;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오후 3:47:57
 * @subject		메소드(함수) 사용 예제
 * @content		두 정수의 합을 구해서 출력
 *						함수 선언	-	1) 두 정수의 합을 구하는 (기능)
 *										2) 두 정수 (매개변수)
 *										3) 합 (리턴값)
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int a= 10;
		int b =20;
		int c;
		
		c= hap(a,b);
		System.out.printf("%d+%d=%d\n",a,b,c);
		
		//The method hap(int, int) in the type Ex06_02 is not applicable for the arguments (int, int, int)
		// 						매개변수 2개																					매개변수3개
		c= hap(1,2,3);
//		c= hap(1,2,3,4);
		System.out.println(c);
	
	}	//main

	private static int hap(int i, int j, int k) {
		return i+j+k;
	}

	public static int hap(int a, int b) {
		/*int result = a+b;
		return result;
		return 수식 */
		
		return a+b/*수식*/;
	}

} //class
