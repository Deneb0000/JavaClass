package days23;

public class Ex11 {

	public static void main(String[] args) {
		//최종 연산의 결과 타입이 Optional 인 경우가 있ㅇ다.
		//Optional<T> : 최종연산의 결과가 'T'타입의 객체 => 래퍼클래스이다
		//모든 타입의 참조변수를 저장할 수 있는 객체이다.
		
		//최종연산하는 {} 메소드 들이 Optional 객체 생성
		// 1)of() 			of(null) 예외발생
		// 2)ofNullable()
		
		//2. Optional 객체로 부터 값을 얻어오는 방법
		// 1) get() null 예외발생
		// 2) orElse() null -> "리턴
		//	  orGet() null 일때 "" 이 아니라 다른 값을 반환 할수 있다
		// 3. isPresent() : Optional 객ㅊ체의 값이 null이면 false, true
		
		// Optional<T>	get()
		// OptionalInt, OptionalLong, OptionalDouble
		// getAsInt()	getAsLong,	getAsDouble()
		
		
		
		
	} //main

} //class Ex11
