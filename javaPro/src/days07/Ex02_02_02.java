package days07;

import java.util.Iterator;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오전 10:36:24
 * @subject
 * @content
 *
 */
public class Ex02_02_02 {

	public static void main(String[] args) {
	     //              공    별
//      ___*   i=1      3     1
//      __**   i=2      2     2
//      _***   i=3      1     3
//      ****   i=4      0     4
      
		for (int i = 1; i <= 4; i++) { // 행갯수
	         for (int j = 1; j <= 4 ; j++) { // 열갯수
	            System.out.print(i+j>=5?"*":"_");
	            /*
	            if (i+j<=5) {
	               System.out.print("*");
	            } else {
	               System.out.print("_");
	            }
	            */
	         }
	         System.out.println();
	      }

		System.out.println();
		
//      ****   i=1  0   4	1.1	1.2~4	3~5
//      _***   i=2  1   3	2.2	2.3~4	5~6
//      __**   i=3  2   2	3.3	3.4		7
//      ___*   i=4  3   1	4.4	4			8

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i<=j?"*":"_");
				}
			System.out.println();
			}
		
		
	} //main

}	//class