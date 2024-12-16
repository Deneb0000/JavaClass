package days17;

public class Ex04 {

	public static void main(String[] args) {
		// 박싱 boxing, 안박싱unboxing
		int i = 100;	// 기본형int
		Integer j = i;	// 래퍼 클래스 integer
		System.out.println(j);
		// 기본형 -> 자동으로 래퍼클래스 형변환
		// 오토(Autu)박싱
		
		//래퍼클래스->자동으로 기본형 형변환
		// 오토(Auto)언박싱
		int k = j;
		
		test(1); //int -> Integer -> Object
		test(true); 
		test(3.14);
		test('a'); 
		test('a',"aaa",19, 1.23); 
		
	} //main

	private static void test(Object ... o) {
		// TODO Auto-generated method stub
		
	}

} //class
