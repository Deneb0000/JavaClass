package days14;

public class Ex07 {

	public static void main(String[] args) {
		//단일 상속(single inheritance)
		//다중 상속(multiple inheritance)	*자바는 다중 상속을 지원하지 않습니다.
		//			ㄴ 인터페이스를 사용해서 다중상속을 구현하도록 한다.

		
	}	//main

}	//class

class Tv{
	boolean power;
}

class VCR{		//비디오 카세트 레코드 
	boolean power;
}

/*
//Tv + VCR 기능을 가지는
class TVCR extends Tv, VCR {	//Syntax error on token ",", . expected *자바는 다중상속지원x
	
}
- 인터페이스를 사용해서 다중상속을 구현하도록 한다.
*/