package days06;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 5:08:21
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// ****  
		// ****  
		// ****  
		// ****  
		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/
		
		/*
		for (int i = 1; i <= 4 ; i++) {
			System.out.println("****");
		}
		*/
		
		// i=1  j=1,2,3,4
		// i=2  j=1,2,3,4
		// i=3  j=1,2,3,4
		// i=4  j=1,2,3,4
		
		for (int i = 1; i <=4; i++) {		//행의 갯수
//			System.out.println("****");
			for (int j = 1; j <= 4; j++) {	//열(별)의 갯수
				System.out.print("*");
			}
			System.out.println(); 		//행갈이
		}

		
	}	//main

}	//class



/*


*
**
***
****

****
****
**
*

___*
__**
_***
****

****
_***
__**
___*

 이등변삼각형
__*
_***
*****

*
_*
__*
___*
____*

____*
___*
__*
_*
*

*___*
_*_*
__*
_*_*
*___*

마름모

__*
_***
*****
_***
__*

모래시계
 * */