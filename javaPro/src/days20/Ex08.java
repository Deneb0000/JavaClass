package days20;

import java.util.ArrayList;

import days13.Person;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 2:34:22
 * @subject	제네릭
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * [제네릭(Generics) 지네릭스]
		 * 1. jdk 1.5 - 제네릭
		 * 	  jdk 1.8 - 람다식
		 * 2. 제네릭? 기능 또는 기술
		 * 	[다양한 타입]의 객체를 다루는 메서드, 컬렉션
		 * 	클래스에서 컴파일 시에 타입을 체크해 주는 기능
		 * 3. 왜? 객체의 타입을 컴파일 시에 체크하는 이유?
		 * 	제네릭의 장점
		 * 		1) 객체의 타입 안정성을 높이기 위해서 사용한다
		 * 		2) 형 변환의 번거로움을 줄이기 위해서 사용한다
		 * 
		 * */

		/* <>을 주지않을땐 자유롭게 형변환 가능?
		ArrayList list = new ArrayList();
		list.add(100); //int
		list.add(3.14); //double
		list.add(true); //boolean
		list.add('a'); //char
		list.add("name"); //String
		list.add(new Person()); //
		
		int i = (int) list.get(0);
		double d = (double) list.get(1);
		boolean b = (boolean) list.get(2);		
		Person p = (Person) list.get(5);
		*/
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동"); //string
		list.add("관리자"); 
		
//		list.add(100); 인트값으로 못준다 스트링으로 바꿔라
		//The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		
		String name = list.get(0);
		
	} //main

} //class
