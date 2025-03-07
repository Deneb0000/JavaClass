package days16;

public class Ex03 {

	public static void main(String[] args) {
		
		// [java.lang 패키지 - 자바 가장 기본이 되는 클래스]
		//	java.util 패키지 - 유용한 클래스
		// 1. [java.lang.Object 클래스]
		//
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		System.out.println( item1.hashCode() );	//1940030785
		System.out.println( item2.hashCode() );	//1869997857
		//	ㄱ. int hashCode()
		//		객체 생성이 되면 생성된 객체의 주소값을 해싱기법을 사용해서
		//		해시코드를 만들어서 반환하는 메서드다.
		
		System.out.println(item1.toString());
		//	ㄴ.String to String()
		//		인스턴스에 대한 정보를 문자열로 반환하는 메서드
		//		오버라이딩
		//			days16.Item@73a28541
		//			패키지.클래스명@hashCode의 16진수 값
		
		//	ㄷ. getClass()
//				객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환하는 매서드
		//		Class<? extends Number> c = n.getClass(); 
		Class cls = item1.getClass();
		System.out.println(cls.getName());	//풀네임... -> days16.Item
//		cls.getConstructor();	//어떤생성자
//		cls.getMethod();	// 어떤 메서드
		
		//	ㄹ. clone() 복제	: 객체의 복사본을 만들어서 반환
		
		
		
	} // main

} //class

class Item extends Object{
	
	@Override
	public String toString() {
		return "Item [value=" + value + ", toString()=" + super.toString() + "]";
	}

	int value; //필드
	
	Item(int value){
		this.value = value;
	}//생성자
	
} //class Item