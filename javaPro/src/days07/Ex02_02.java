package days07;

import java.util.Iterator;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오전 10:36:24
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

//		___*
//		__**
//		_***
//		****
		
		for (int i = 1; i <= 4; i++) {
			// 공백 찍는 for
			for (int j = 1 ; j <= 4-i; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}	//for i
		
		System.out.println();
		
//		****
//		_***
//		__**
//		___*
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print('_');
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
	} //main

}	//class