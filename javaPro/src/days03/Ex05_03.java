package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 3:44:49
 * @subject		비교연산자
 * @content		크다, 작다, 같거나 크다, 같거나 작다, 같다, 다르다
 *						비교연산의 결과는 boolean 이다. (true, fales)
 */
public class Ex05_03 {

	public static void main(String[] args) {

		int i = 10, j = 3;
//		System.out.println( i > j ); //true
//		System.out.println( i >= j ); //true
//		System.out.println( i < j ); //true
//		System.out.println( i <= j ); //fales
//		System.out.println( i == j ); //fales
//		System.out.println( i != j );	//true
		
//		주의할 점
		System.out.println( i = j ); //3 i 에 j를 대입한 값이다
//		The operator ! is undefined for the argument type(s) int
		System.out.println( i != j ); //3 i 에 j를 대입한 값이다
		
	}

}
