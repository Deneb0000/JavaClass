package days07;

public class Ex01 {

	// 2단 3단 4단
	// 5단 6단 7단
	//	8단 9단
	public static void main(String[] args) {
		for (int k = 1; k <= 3; k++) {
//			System.out.printf("k=%d\n",k);
			//	k=1		j=2;	j<=4
			// 	k=2		j=5; j<=7
			//	k=3		j=8;	j<=9
			//		3*k-1
			for (int j = 3*k-1; j <= 3*k+1 && j != 10 ; j++) {
				System.out.printf("[%d단]\t\t",j);
			}	//for j
			System.out.println();
			
			for (int i = 1; i <= 9; i++) {
				for (int j = 3*k-1 ; j <= 3*k+1 && j != 10; j++) {
					System.out.printf("%dx%d=%d\t",j,i,i*j);
				} //for j
				System.out.println();
			} // for i
			System.out.println();
		} // for k	
		
		
	}	//main

}	//class
