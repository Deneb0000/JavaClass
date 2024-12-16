package days11;

public class Ex06 {

	public static void main(String[] args) {

		int	[] [] m = new int [5][5];
		
//		fillM2(m);
		fillM(m);
		
		dispM(m); // 출력해주는 함수

	}	//main
/*
	private static void fillM2(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			fillM2(m[i]);	//1차 항배열의 6개
		}
		for (int i = 0; i < m.length; i++) {
			dispLotto(m[i]);	//배열의 배열***
		
	}
*/
	private static void dispM(int[][] m) {
		System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.println(); 
	      
	      for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            System.out.printf("[%02d]", m[i][j]);
	         } // for j
	         System.out.println();
	      } // for i
		
	}

	private static void fillM(int[][] m) {

	      for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            ///      열갯수
	            m[i][j] = m[i].length * i + j +1;
	         } // for j
	         System.out.println();
	      } // for i
	   }
		
	

}	//class
