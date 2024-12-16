package days07;

public class Ex02_03_02 {

	public static void main(String[] args) {
//      이등변삼각형
//      __*  				1.3
//      _*** 			2.2	2.4
//      *****		3.1			3.5
     //           				  
		for (int i = 1; i <=3; i++) {		//행갯수
			for (int j = 1; j <=5; j++) {
//				System.out.print(i+j>=4?"*":"_");
//				System.out.print(i-j<=2?"*":"_");
				System.out.printf(i+j>=4 && j-i <=2?"*":"_");
			}
			System.out.println();
		}

	}	//main

}	//class
