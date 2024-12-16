package days16;

import java.util.ArrayList;

public class Ex03_02 {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "홍길동");
		
		try {
			// Person p2 = (Person) p1.clone();
			Person p2 = p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//ㅁ. eqauls()	***
		//	 finalize() - 소멸자?
		//	notify() notifyAll(), wait()x3 		*스레드 수업
		
	} //main

}	//class

class Person implements Cloneable {
	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override //p1.equals(p2)
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;//다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}
	//필드
	String rrn;
	String name;
	
	//생성자
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + "]";
	}

	//p1.clone();
//	부모의 clone() 메서드를 오버라이딩했기 때문에
//	리턴자료형이 Object여야 되지만
//	리턴자료형을 복제하는 클래스 타입으로 변경할 수 있또록
//	jdk 1.5 "공변변환타입" 
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person pClone = null;
		pClone = (Person) super.clone(); //object => Person 다운캐스팅
		return pClone;
	}

}
