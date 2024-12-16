package days21;

/**
 * @author dnb
 * @date 2024. 7. 29. - 오전 9:00:53
 * @subject
 * @content
 *
 */
public class Ex01 {

	//	enum Direction /*열거형선언 : 컴파일할땐 클래스로 인식하기때문에 대문자*/{ 
	//		EAST, SOUTH, WEST, NORTH}
	//}
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;

		private int value;
		private String symbol;

		Direction(int value){
			this.value = value;
		}

		Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;			
		}

		public int getValue() {
			return this.value;
		}

		public String getSymbol() {
			return this.symbol;
		}

	}
	/*
	 * 컴파일러가 클래스로 변환
	 * class Directio extends Enum{
	 * 	static final Direction EAST = new Direction();
	 * }				ㄴ디렉션으로 선언된 객체
	 * 
	 * private String name;
	 * public String name(){
	 * 	return 	this.name;
	 * 	}
	 * }
	 * 
	 * 
	 * private int ordinal;
	 * public int ordinal(){
	 * 	return this.ordinal;
	 * 	}
	 * }
	 * 
	 * 
	 * 컴파일하면서 만들어진다
	 * */


	public static void main(String[] args) {
		//		System.out.println(Direction.EAST );	//"EAST" 라는 문자열
		//		System.out.println(Direction.EAST.toString() );
		//		System.out.println(Direction.EAST.name() ); // 객체이기때문에 네임도 있다
		//		System.out.println(Direction.EAST.ordinal()); //안에 있는 index(순번)값 /첫번째 값이라 0


		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(
					dir.name() + "/"
							+dir.ordinal() + "/"
							+dir.ordinal() + "/"
							+dir.getSymbol() + "/"
							+dir.getValue() + "/"
					);
			//[열거형(enum) 의 구조 이해]

		}



	} //main

} //class Ex01
