package days07;

public class Ex02 {

	public static void main(String[] args) {
		
//		 i=1   j=1
//			      i=2   j=1,2
//			      i=3   j=1,2,3
//			      i=4   j=1,2,3,4
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <=4 ; i++) {
			for (int j = 4; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		

	}	//main

}	//class