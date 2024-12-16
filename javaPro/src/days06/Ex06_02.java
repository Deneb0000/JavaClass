package days06;

public class Ex06_02 {

	public static void main(String[] args) {
		// 구구단 가로 (2단~9단)
		/*
		for (int 단 = 2; 단 <= 9; 단++) {
//			System.out.printf("[%d단]\n", 단);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%d\t",단,i,단*i);
				
			}//for
			System.out.println();//개행
		}//for
		*/
		
		//구구단 세로 (2단~9단)
		for (int i = 1; i <= 9; i++) {
			for (int 단 = 2; 단 <= 9; 단++) {
				System.out.printf("%d*%d=%d\t",단,i,단*i);
				
			}//for
			System.out.println();
		}//for
	}//main

}//class
