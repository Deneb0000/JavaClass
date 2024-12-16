package days10;

public class Ex03 {

	public static void main(String[] args) {
		double result = pow(2,3);
		System.out.println(result);
		result = pow(2,-3);
		System.out.println(result);
		result = recursivePow(2,3);
		System.out.println(result);
		result = recursivePow(2,-3);
		System.out.println(result);

	}//class

	public static double recursivePow(int i, int j) {
		if (j < 0) return 1/recursivePow(i, -j);	//음수일때
		if (j>i) return i * recursivePow(i, j-1);
		else if (j==0) return 1;
		else 	return i;
	}
	private static double pow(int i, int j) {
		// 2^3=2*2*2
		//2^-3=1/2^3=1/(2*2*2)
		
		double result = 1;
		int exp = Math.abs(j);				//abs : 절대값를 구하는 메서드	|3| =3, |-3|=3
		for (int k = 0; k <exp; k++) {
			result *= i;
		}
		return j>0? result:1/result;		
	}

}//main
