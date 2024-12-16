package days09;

public class Ex03_04 {

	public static void main(String[] args) {
		// [문제]
		// 거듭제곱 == 누승 ==멱 == power(pow)
		//	2의 3제곱	2=밑수 3=지수	=밑수(2를) 지수(3)만큼 반복해서 곱하는 것.
		// 2^3 = 2*2*2
		
		double result = pow(2, 3);	//8
//		double result = pow(2, -3);	//0.125
		System.out.println(result);

	}	//main

	private static double pow(int i, int j) {	//일반함수
		// i=밑수 j=지수
		double result = 1;
		int exp = j <0? -j : j;
		for (int k = 0; k <exp; k++) {
			result *= i;
		}
		return j>0? result:1/result;
		
		/*int result;
		for (int k = 0; k <= j; k++) {
			result *= i;
		}
		
		return result;*/
	}
	private static int recursivePow(int i, int j) {	//재귀함수
		// TODO Auto-generated method stub
		return 0;
	}

}	//class
