package days04;

public class Ex09 {

	public static void main(String[] args) {

		// [break 문] 빠져나갈때 사용된다
//		for (int i = 1; i <=10; i++) {
//			
//			
//		}//
//		
		int i =1;
		while (i<=10) {
		if (i==6) break;	
//		if (i==6) continue;	
		System.out.printf("%d\t",i);
			i++;
		} //while

//		int i =1;
//		while (i<=10) {
//			if (i==6) break;
//			System.out.printf("%d+",i);
//		} //while 무한루프
		
	}

}
