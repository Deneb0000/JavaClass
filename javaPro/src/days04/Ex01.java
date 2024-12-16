package days04;

public class Ex01 {

	public static void main(String[] args) {
		// 1.  + 연산의 결과를 적으세요.  
//		System.out.println(3+5+0);	덧셈연산자	8
//		System.out.println(3+5+"0");	문자열 String 연결 연산자	"80"
//		System.out.println(3+5+'0'); ' ' char(정수형 자료 ASKII코드) 부호연산자 56		

		// 2. 이름, 나이, 등급('A','B','C','D','F')을 입력받아서 출력
		//[입력형식]
//		  	이름, 나이, 등급을 입력하세요 ? _ 								*cast 연산자료로 타입변환
//		   [출력형식]																 - 숫자타입, 클래스 간의 형변환
//		  이름="홍길동", 나이=23살, 등급='B'
//		String name;
//		byte age = 20;
//		String rank;		--> String rank;
//		
//		Scanner scanner = (new Scanner (System.in));
//		
//		System.out.print("이름, 나이, 등급을 입력하세요?");
//		
//		name = scanner.next();
//		age = scanner.nextByte();
//		rank= scanner.next();
//				
//		System.out.printf("이름=\"%s\", 나이=%d, 등급=\'%s\'\n", name, age, rank);
//		
	
//		4. 타입 변환하는 코딩을 적으세요.
//		  ㄱ. byte -> String 	+" "
//		  ㄴ. short -> String	+" "
//		  ㄷ. int -> String 	+" "
//		  ㄹ. long -> String 	+" "
//		  ㅁ. float -> String 	+" "
//		  ㅂ. double -> String 	+" "

		int x = 1, y = 2;
		int z = x <= 100 ? y >=100? 10 : -10 : 20;
		System.out.println( z );

		/*
		x		y
		T		T  10
		T		F	-10
		F		T	20
		F		F	20
		*/
		
		
	}

}
