package days12;


public class Ex03 {

	public static void main(String[] args) {
//		Illegal modifier for parameter age; only final is permitted
//		public int age = 10;
		int age = 10;	//지역변수
		
		//배열
		int [] m = null;
		m = new int [3];
		m[0] = 10;
		//									stack
		//	[0][0][0]						[0x100]
		//	0x100							m 변수, 참조변수, 배열명
		
		//	인스턴스											객체
		//	[power][channel][color][p()][cu()][cd()]		[0x200]
		//	0x200											t1 변수, 참조변수, 객체
		//	
		//
		//	클래스 : 객체의 설계도
		// 	객체 : 클래스를 선어된 참조 변수
		// 	인스턴스 : 생성된 객체
		
		
		//	함수코드 영역
		// power()
		// channelUp()
		// channelDown()
		Tv t1;	//객체 선언
		t1 = new Tv(); 	//객체 생성, 인스턴스화
		//멤버들을 접근하는 방법 : 객체명.필드명, 객체명.메서드명()
		//Tv. 클래스명.
		t1.power();
		System.out.println(t1.power? "0":"X");
		t1.channel = 10;
		System.out.println(t1.channel);
		t1.channelDown();	//9
		System.out.println(t1.channel);
		
		t1.power();
		System.out.println(t1.power? "0":"X");
		
	}	//main

}	//class
