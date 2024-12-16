package days08;

/**
 * @author dnb
 * @date 2024. 7. 10. - 오전 11:24:27
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// [주민등록번호]
		//	6. 검증
		String rrn= "941201-2099999";

		if (isCheckRRN(rrn)) {// is : true / false
			System.out.println("올바른 주민등록번호이다.");
		} else {
			System.out.println("잘못된 주민등록번호이다.");
		}  
		
	}	//main

	public static boolean isCheckRRN(String rrn) {
//		ABCDEF-GHIJKLX
//	2*a+3*b+4*c+5*d+6*e+7*f+8*g+9*h+2*i+3*j+4*k+5*l)%11)%10;
//	2*a+3*b+4*c+5*d+6*e+7*f+8*g+9*h+2*i+3*j+4*k+5*l
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};		// 규칙이 없는곳에 배열		*0은 주민등록상 -
		int T = 0;
		for (int i = 0; i <= 12; i++) {
			if (i ==  6) continue; // '-'
			T +=  m[i]* ( rrn.charAt(i)-'0');	//'8' 56
		}
		int X = rrn.charAt(13)-'0';
		return X == (11-T&11)%10 ;
	}
	/*
	public static boolean isCheckRRN(String rrn) {
//		ABCDEF-GHIJKLX
		//X=(11−(2A+3B+4C+5D+6E+7F+8G+9H+2I+3J+4K+5L)mod11)mod10	// mod : 나머지 연산자(=%)
		
		int a = rrn.charAt(0)-'0';	//'8' 56
		int b = rrn.charAt(1)-'0';	//'8' 56
		int c = rrn.charAt(2)-'0';	//'8' 56
		int d = rrn.charAt(3)-'0';	//'8' 56
		int e = rrn.charAt(4)-'0';	//'8' 56
		int f = rrn.charAt(5)-'0';	//'8' 56
		//	-
		int g = rrn.charAt(7)-'0';	//'8' 56
		int h = rrn.charAt(8)-'0';	//'8' 56
		int i = rrn.charAt(9)-'0';	//'8' 56
		int j = rrn.charAt(10)-'0';	//'8' 56
		int k = rrn.charAt(11)-'0';	//'8' 56
		int l = rrn.charAt(12)-'0';	//'8' 56
		int x = rrn.charAt(13)-'0';	//'8' 56
		
		return x == (11-(2*a+3*b+4*c+5*d+6*e+7*f+8*g+9*h+2*i+3*j+4*k+5*l)%11)%10;
		
//		int a =Integer.parseInt(rrn.substring(0, 1));
		
		
		int a = Integer.parseInt (rrn.substring(0, 1));
		int b = Integer.parseInt (rrn.substring(1, 2));
		int c = Integer.parseInt (rrn.substring(2, 3));
		int d = Integer.parseInt (rrn.substring(3, 4));
		int e = Integer.parseInt (rrn.substring(4, 5));
		int f = Integer.parseInt (rrn.substring(5, 6));
		int g = Integer.parseInt (rrn.substring(6, 7));
		int h = Integer.parseInt (rrn.substring(7, 8));
		int i = Integer.parseInt (rrn.substring(8, 9));
		int j = Integer.parseInt (rrn.substring(9, 10));
		int k = Integer.parseInt (rrn.substring(10, 11));
		int l = Integer.parseInt (rrn.substring(11, 12));
		int m = (2*a+3*b+4*c+5*d+6*e+7*f+8*g+9*h+2*i+3*j+4*k+5*l);
		int isCheckRRN = (11-m%11)%10;
		
		System.out.println(isCheckRRN);
			
	}*/

}	//class
