package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오후 12:31:16
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
	    
		   // 1) x는 10보다 크다.  x>10		
	    		 
		
	      // 2) x는 10보다 크고, 20보다 작다.  x>10 && x<20
	    		    		
	      // 3) x는 2의 배수이다.   
			//m이 n으로 나누어 떨어지는지 확인
			// x % 2 == 0
//		int x = 4;
//		System.out.println(x % 2 ==0);		
//		int x = 5;
//		System.out.println(x % 2 ==0);		
		
	    		
	      // 4) x는 2의 배수 또는 3의 배수이다.  
			//x % 2 ==0 || x % 3 ==0
//		int x = 7;
//		System.out.println(x % 2 ==0 || x % 3 ==0); // false
//		x = 9;
//		System.out.println(x % 2 ==0 || x % 3 ==0); // true
	    			    			// &&
	      // 5) x는 2의 배수이지만 6의 배수는 아니다. 
			//x % 2 ==0 && x % 6 != 0
			    		
	      // 6) 한 문자(ch)가  숫자이다.  48<=ch && ch <=57
		// '0' '1' ~ '9'
//		char ch = 'x';
//		ch == '0'	|| ch =='1' || ch =='2' || ... || ch =='9'
		
		//kor 	우 		80 이상 ~ 90 이상
		//kor >=80	&&	kor <90
		// 48<=ch && ch <=57
		// '0'<=ch && ch <='9'
		
	      // 7) 한 문자가 소문자이다. 	97<= ch && ch <=122
//		ch == 'a'	|| ch =='b' || ch =='c' || ... || ch =='z'
		// 'a'<=ch && ch <='z'
	      
	      // 8) 한 문자가 알파벳이다 ( 대문자이거나 또는 소문자  ) 
			// 65 <=ch && ch <=112
		// ('A'<=ch && ch <='Z') || ('a'<=ch && ch <='z')
		
		//The left-hand side of an assignment must be a variable
		//The operator <= is undefined for the argument type(s) boolean, int
		char ch = 'x';
	    // System.out.println( 65 <= (int)ch <= 122 );
//		 System.out.println( 65 <=ch && ch<= 122 ); //x
		
	}

}
