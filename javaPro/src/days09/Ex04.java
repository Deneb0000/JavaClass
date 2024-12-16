package days09;

/**
 * @author dnb
 * @date 2024. 7. 11. - 오후 2:36:58
 * @subject	정수	2진수 출력	(	int		)
 * @content			8진수 출력
 *							16진수 출력
 */
public class Ex04 {

	public static void main(String[] args) {
		//	10	=>	00000000	00000000	00000000	00001010	
		int n = 10;
		int share, reminder;
		
		int [] binaryArr = new int[32];
		//System.out.println(Arrays . toStrin(binaryArr));
	
				
		int index = binaryArr.length-1; //제일 끝방
		
		while (n!=0) {
			share = n/2;
			reminder = n%2;
			binaryArr[index--] = reminder;	
//			System.out.printf("%d",reminder);
			n = share;			
		}
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if(i%8==7) System.out.print("");
		}
		
		System.out.println();
		
	}	//main

}	//class
