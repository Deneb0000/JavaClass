package days02;

public class Ex02 {

	public static void main(String[] args) {
		// 자바 문자열
		// 문자의 나열 " " 
		// 자바 한 문자 ' '
		
		// 본인 이름을 저장할 [변수 선언 형식] (실행문)
		// 타입(자료형) 변수명 [= 초기값];			개발자가 부여 이름 : 식별자(숫자로 시작할수없다/공백사용x)$_ 사용가능
		// 자바 식별자			예약어(키워드) : 이미 부여된 이름 =/= 식별자
		
		//쌍따옴표를 제외한 숫자만 넣었을경우의 오류 : Type mismatch: cannot convert from int to String (타입이 일치하지않다는 뜻)
		//경고 : The value of the local variable name is not used. (사용하지않는 변수인데 어째서 선언했는가?라는 뜻) / local variable:지역변수
//		String name = "김인경"; // = : 대입연산자 (이퀄이 아님)
//		System.out.println(name);
//		
		//Duplicate local variable name. (name 지역변수가 중복이다.)
		//String name = "abc"; 
//		System.out.println(name);
		
		//할당된 값이 변할수 있음 (덮어 씌우기)		
//				String name = "김인경";
//				System.out.println(name);
//				name = "abc"; 
//				System.out.println(name);
				
		//The local variable name may not have been initialized.
		//지역변수는 '반드시' 초기화해야 사용할수 있다. (사용하기 전에만 초기화해두면 된다)
//		String name ;
//		System.out.println(name);
//		name = "abc"; 
//		System.out.println(name);
//		
		String name ;
		name = "김인경";
		System.out.println(name);
		name = "abc"; 
		System.out.println(name);
		
		// [ 변수와 상수]

		// 초기화한다는 말의 뜻 : 값을 처음 할당할때 (두번째 할당할때x)
	}

}
