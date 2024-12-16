package days06;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 3:11:20
 * @subject		[이름(Label)이 붙은 반복문]
 * @content		break 라벨명;
 * 				continue 라벨명;
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		//구구단
	//   [2단]                 
		// 2 * 1 = 2              
		// 2 * 2 = 4              
		// 2 * 3 = 6              
		// 2 * 4 = 8              
		// 2 * 1 = 2              
		// 2 * 1 = 2              
		// 2 * 1 = 2              
		// 2 * 9 = 18             
		                          
		// dan=2  2<=9(참)         
		//   ㄴ i=1,2,3..[5]...,9  
		// dan=3  2<=9(참)         
		//   ㄴ i=1,2,3.....,9     
		//  :                     
		                          
		                          
		// [2단]                   
		// 2*1=2                  
		// 2*2=4                  
		// 2*3=6                  
		// 2*9=18                 
		
		//중첩포문(2중for문)
		EXIT: for (int dan = 2; dan <= 9 ; dan++) {
//			System.out.printf("[%d단]\n", dan);
					      for (int i = 1; i <= 9 ; i++) {
//					    	  if(i==5) break EXIT;	//"EXIT는 라벨(이름)	
					    	  if(i==5) continue EXIT;
					    	  System.out.printf("%d*%d=%d\t", dan, i, dan * i);
		      }			
					      System.out.println();		//continue EXIT; 가 오지도 않음 
		}
		/*
	      int dan = 2;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 3;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 4;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      :
	      dan = 9;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      */
		
		

	}	//main

}	//class
