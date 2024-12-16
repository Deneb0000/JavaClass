package days15;

public class Ex02 {

	public static void main(String[] args) {
		//추상(abstract)메서드  
		// ㄴ몸체(body)가 없는 메서드
		
		//추상(abstract)클래스
		// ㄴ공통적인 멤버를 가진 클래스 설계..
		// ㄴ객체를 생성할 수 없다.		new Parent();x	객체생성의 목적x
		// 
		
		Parent p =	new Child();
		p.dispA(); //구현된 실체 객체가 나옴
	}//main

}//class

abstract class Parent{
	//필드
	//생성자
	//추상메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
	//메서드
}//추상메서드
class Child extends Parent{

	@Override
	void dispA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dispB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dispC() {
		// TODO Auto-generated method stub
		
	}
//몸체를 구현함
}