package days03;

/**
 * @author dnb
 * @date 2024. 7. 3. - 오후 12:42:32
 * @subject		타입(형) 변환
 * @content		1) 자동 형 변환
 *					 		-	큰 자료형 값 = 작은 자료형 값
 * 						2) 강제 형 변환
 *
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		int no = 15;
		System.out.printf("%d\n", no);
		System.out.printf("%04d\n", no);		//4자리에 빈자리에 0을 채우겠다
		System.out.printf("%4d\n", no);
		System.out.printf("%-4d\n", no);
		System.out.println("-".repeat(10));
		
		
		String name = "홍길동";
		System.out.printf("[%10s]\n", name);		//오른쪽정렬
		System.out.printf("[%-10s]\n", name);	//왼쪽정렬
		
		//float pi = 3.14;		//3.14 => double *자동형변환이 일어나지 않는다.
		//float pi = (float) 3.14;
		float pi = 3.14F;
				
		//자동형변환
		int i = 100;	// [] [] [] []
		long l = i; //int 형 인데 오류가 안난다 : 자동으로 다뀌니깐*/ 	// [] [] [] [] [] [] [] []
		
		//자동형변환
		long k = l/*long*/ + i/*인트*/ ;		//큰자료형 + 작은자료형 => 큰자료형
				
		
		i = (int) 100L;	//좌측이 작아서 우측형이 못들어간다 *강제형변환을 사용해야한다
		// (int) 강제 형변환 : 자동 형 변환안되는 상황 	(변환하고자하는 타입) cast 연산자
		//cast 강제 형 변환
		
		//	( 3 + 5 ) * 2 = 16 ()최우선 연산자

		//
	
	}

	private static Object repeat(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
