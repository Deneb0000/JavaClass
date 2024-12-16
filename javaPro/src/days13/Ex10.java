package days13;

public class Ex10 {
	
	//필드
	String name = "홍길동";	//명시적 초기화
	static double rate = 0.0;
	int [] m;
	
	//디폴트 생성자
	Ex10(){
		name = "디폴트";
	}
	
	public static void main(String[] args) {
		Ex10 obj = new Ex10();
		System.out.println(obj.name);
		
		int age;
		//1. 지역변수 : 반드시 초기화해야 사용할수 있다.
		
		//2. 클래스 변수
		//		인스턴스 변수
		//	각 타입 별 기본 값으로 설정.
		// boolean false
		// byte, short, int	0
		//			long 	0L
		// flat	0.0F
		// double 	0.0	0.0D
		//모든 참조 타입 	null
		//3. 멤버 변수(필드) 초기화 방법
		// 	ㄱ. 명시적 초기화			String name = "홍길동";	//명시적 초기화
		// 	ㄴ.	 생성자 초기화				Ex10(){
		// 		                         		name = "디폴트";
//		                                	}
		// 	ㄷ.초기화 블럭	{} <-블럭		[BlockTest.java]
//				1)인스턴스 초기화 블럭	-	인스턴스 변수의 초기화
//				2)클래스(static) 초기화 블럭	-	클래스 변수의 초기화

	}	//main

}	//class
