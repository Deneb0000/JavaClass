package days13;

import java.util.Date;

import days13.Person;

public class Ex06 {

	public static void main(String[] args) {

		//The constructor Person(String, int, boolean) is undefined		생성자가 선언되어있지 않기 때문에 생성되지 못한다
		Person p1 = new Person("홍길동", 20, true);
		Person p2 = new Person("김길동");
		Person p3 = new Person("박길동", 20);
		
		// ArrayList list = new
		Date now = new Date();  // 6개 생성자 파악

	}	//main

} //class
