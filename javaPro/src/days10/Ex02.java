package days10;

public class Ex02 {

	public static void main(String[] args) {
//		int [] m = new int[6];
//		  m[0]=1;m[1]=2;m[2]=3;m[3]=4;m[4]=5;m[5]=6; 
		
//		int [] m = {1,2,3,4,5,6};
		
//		int [][] m = new int [2][3];
//		m [0][0] = 1; m[0][1]=2; m[0][2]=3;
//		m [1][0] = 1; m[1][1]=2; m[1][2]=3;
//		배열초기화로
		int [][] m = {
							{1,2,3},
							{4,5,6}
							};
//		m.length			2
//		m[0].length		3
		for (int i = 0; i < m.length; i++) {	//행갯수
			for (int j = 0; j < m[i].length; j++) {	//열갯수
				System.out.printf("m[%d][%d]=%d",i , j,m[i][j]);
			}//for i
		}//for j
		
	}//main

}//class
