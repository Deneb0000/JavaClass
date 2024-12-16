package days11;

public class Qq {

	public static void main(String[] args) {

		int [][] m = new int[5][5];                     

		magicSquare(m);                                          
		//fillM6(m);                                    
		//fillM5(m);                                    
		//fillM4(m);                                    
		//fillM2(m);                                    
		fillM(m);   
		fillM2(m);
		fillM3(m);                                    
		magicSquare(m);                               
		dispM(m);                                       



	} // main                                           

	private static void magicSquare(int[][] m) {        
		/*          02                                       
[17][24][01][08][15]                                
[23][05][07][14][16]                                
[04][06][13][20][22]                                
[10][12][19][21][03]                                
[11][18][25][02][09]                                
		 */                              
		// 1. 0행 2열		1			//m[0][2];
		// 2-1. 출력값이 5의 배수 o : 행만 증가		
		// 2. 출력값이 5의 배수	x : 행 감소 + 열 증가
		//			ㄴ if 행이 범위에 벗어남 -> 가장 큰 행값으로 처리
		//			ㄴ if 열이 범위에서 벗어남 - > 가장 작은 열값으로 처리
		
//		for (int i = 0; i < m.length; i++) { // 행갯수
//	         for (int j = 0; j < m[i].length; j++) { // 열갯수
//	        	 if(i%5==0) i++;
//	        	 else if (condition)
//	            System.out.printf("[%02d]", m[i][j]);
//	         } // for j
//	         System.out.println();
//	      } // for i		
//		System.out.println();
//		
//	} // magicSquare              
		int n = 1;
		int row=0 , col=m[0].length/2; //행의 위치값, 열의 위치값
		while (n<=25) {
			m [row][col] = n;
			if (n%5==0) {
				row++;
			} else {
				col ++;
				row--;
				if(row == -1) row = m.length-1;
				if(col == 5) col = 0;
			}
			n++;
		} //while
		System.out.println();
		
	} // magicSquare                                    

		
		

	// 대각선                                              
	//	[01][02][04][07][11]                            
	//	[03][05][08][12][16]                            
	//	[06][09][13][17][20]                            
	//	[10][14][18][21][23]                            
	//	[15][19][22][24][25]                            
	private static void fillM6(int[][] m) {             
		// [골뱅이]                                            
		/*                                                  
[01][02][03][04][05]     0 1회전 행고정, 열증가 (5번)                        
[16][17][18][19][06]     1 2회전 열고정, 행증가 (4번)                        
[15][24][15][20][07]     2 3회전 행고정, 열감소 (4번)                      
[14][23][22][21][08]     3 4회전 열고정, 행증가 (3번)                        
[13][12][11][10][09]     4 5회전	행고정, 열증가 (3번)
                        			 5 6회전	열고정,행증가(2번)
                        			 6	7회전 행고정, 열감소(2번)
                        			 7	8회전 열고정, 행감소(1번)
                        			 	9회전 행고정, 열증가(1번)
                    
                   반복회수 =5
                   스위치변수 +1(증가)	-1(감소)     			 	
                  1회전 행고정, 열증가/감소(5번)
                  반복횟수 --;
                  2회전 열고정, 행증가/감소(4번)
		 */                                                  
		// TODO Auto-generated method stub              

	}                                                   

	private static void fillM5(int[][] m) {             
		// TODO Auto-generated method stub              

	}                                                   

	/* 지그재그                                             
[01][02][03][04][05]                                
[10][09][08][07][06]                                
[11][12][13][14][15]                                
[20][19][18][17][16]                                
[21][22][23][24][25]                                
	 */                                                  
	private static void fillM4(int[][] m) {             

	}                                                   

	/*                                                  
[05][10][15][20][25]                                
[04][09][14][19][24]                                
[03][08][13][18][23]                                
[02][07][12][17][22]                                
[01][06][11][16][21]                                
	 */                                                  
	private static void fillM3(int[][] m) {             
		// TODO Auto-generated method stub              

	}                                                   

	/*                                                  
[25][24][23][22][21]                                
[20][19][18][17][16]                                
[15][14][13][12][11]                                
[10][09][08][07][06]                                
[05][04][03][02][01]                                
	 */                                                  
	private static void fillM2(int[][] m) {    
		//끝방부터 채우는 법
//		for (int i = 0, value = 25; i < m.length; i++) { // 행갯수
//			for (int j = 0; j < m[i].length; j++) { // 열갯수
////				m[i][j]= value--;
//				m[i][j] = 25 - (m[i].length * i + j +1)+1;
//				System.out.printf("[%02d]", m[i][j]);
//			} // for j
//			System.out.println();
//		} // for i		
//		System.out.println();
		
		//앞에서부터 채우는 방법
		for (int i = 0, value = 25; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[4-i][4-j] = m[i].length * i + j +1;
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i		
		System.out.println();

	}                                                   

	private static void fillM(int[][] m) {

	      for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            ///      열갯수
	            m[i][j] = m[i].length * i + j +1;
	         } // for j
//	         System.out.println();
	      } // for i
	   }
	
	private static void dispM(int[][] m) {
	 for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            System.out.printf("[%02d]", m[i][j]);
	         } // for j
	         System.out.println();
	      } // for i		
	}//disM

}//class


