package days09;

import java.util.Iterator;

public class Ex05_04 {

	public static void main(String[] args) {
		// int [] kors = new int[270];
		//3학년 2반 17번 학생의 국어
		//kors[226(=210+16)]
		
		// int [][] m = new int[4][6];
		//int [][][] kors = new int [3][3][30] 
		 //int [][][] m = new int[2][3][4];	//	2면 3행 4열
		int [][][]m = {	//2면 3행 4열
				{
					{1,2 ,3 ,4},	
					{5, 6, 7, 8},
					{5, 6, 7, 8}
				},
				{
					{1,2 ,3 ,4},	
					{5, 6, 7, 8},
					{5, 6, 7, 8}
				}
		} ;
		
		 System.out.println(m.length);	//면갯수
		 System.out.println(m[0].length);	// 행갯수
		 System.out.println(m[1].length);
		 System.out.println(m[0][0].length);	//열갯수
		 System.out.println(m[0][1].length);
		 System.out.println(m[0][2].length);
		 System.out.println(m[1][0].length);
		 System.out.println(m[1][1].length);
		 System.out.println(m[1][2].length);
		 
		 dispM(m);
		 
	}	//main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) { //면갯수
			System.out.println(i+"면");
			
			for (int j = 0; j < m[i].length; j++) {	//행갯수
				for (int k = 0; k < m[i][j].length; k++) {	//열갯수
					System.out.printf("m[%d] [%d] [%d] =%d",i,j,k,m[i][j][k]);
				}	// for k
				System.out.println();
			}	// for j
			System.out.println();
		}	//for i
		
	}	//dispM 

}	//class
