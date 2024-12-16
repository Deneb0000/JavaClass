package days13;

import days13.Person;

/**
 * @author dnb
 * @date 2024. 7. 17. - 오전 11:52:24
 * @subject		private 선언된 필드에 접근하는 방법?  
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//Person 클래스 선언
		Person p1 = new Person();
		//p1(private)객체의 필드를 초기화
		// 					ㄴ1) 생성자
		//					   2) getter, setter
		p1.setAge(-20);
		System.out.println(p1.getAge());
		
	}	//main

}	//class
