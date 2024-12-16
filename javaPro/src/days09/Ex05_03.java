package days09;

import java.util.Arrays;

public class Ex05_03 {

	public static void main(String[] args) {
		// 1차원 배열	- 	열
		/*
		int [] m = new int [24];
		System.out.println(m.length); 	//배열크기
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d",i,m[i]);
		}
		*/
		//2차원 배열 - 행+열
		/*
		int [][] m = new int [4] [6] ; // 4행 6열 (24개의 방)
		System.out.println(m.length); 	// 2차원 배열 m.length  행갯수
		System.out.println(m[0].length); 	// 0행의 열갯수
		System.out.println(m[1].length); 	// 1행의 열갯수
		System.out.println(m[2].length); 	// 2행의 열갯수
		System.out.println(m[3].length); 	// 3행의 열갯수
		
		m[0] [0]=100;
		dispM(m);
		*/
		
		//1차원 배열의 초기화
//		int [] m = {1, 2, 3, 4, 5, 6, 7, 8};
		//2차원 배열의 초기화
		/*
		int [] [] m = new int [2] [4];
		m[0][0]=1; m[0][1]=2; m[0][2]=3; m[0][3]=4;
		m[1][0]=5; m[1][1]=6; m[1][2]=7; m[1][3]=8;
		*/
		
		int [][] m = {
								{1,2 ,3 ,4},		//2차원 배열의 초기화2
								{5, 6, 7, 8}
							};
		dispM(m);
	} //main

	private static void dispM(int[][] m) {	//매개변수 : 2차원으로 받겠다
		for (int i = 0; i < m.length; i++) {	//행갯수
//			for (int j = 0; j < m[i].length; j++) {
//				System.out.printf("m[%d][%d]=%d ",i, j, m[i][j]);
//			}
		System.out.println(Arrays.toString(m[i]));
		
			System.out.println();
		}
		
	}

}
