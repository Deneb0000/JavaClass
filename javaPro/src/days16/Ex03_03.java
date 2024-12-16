package days16;

public class Ex03_03 {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		Person p2 = new Person("123456-1234567", "홍길남");

//		System.out.println(p1==p2); // false
		
		System.out.println(p1.equals(p2));	// == 연산자 동일한 결과값
		//문자열 == 문자열 비교
		//object.equals() 재정의 x
		
		//주민등록번호만 같으면 일단 같은 사람이다로 처리
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}//main

}// class
