package days03;

public class Ex03 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// 10진수, 8진수, 16진수 값으로 출력
//		System.out.printf("%d\n",i);
//		System.out.printf("%#o\n",i);
//		System.out.printf("%#x\n",i);		/*# : 플래그스*/
//		
//		int money = 23535790;
//		System.out.printf("%,d\n",money);	/*,: 플래그스*/
		
		System.out.println( Integer.toBinaryString(i)); //"1010"
		System.out.println( Integer.toOctalString(i)); //"1010"
		System.out.println( Integer.toHexString(i)); //"1010"

		
	}

}
