package days19;

import java.util.Stack;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오후 12:22:23
 * @subject		스택(Stack) 구조와 큐(Queue) 구조
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 스택(Stack) 구조와 큐(Queue) 구조
		 * 
		 * ───────────────────────┐
		 * 	→	→	→	C	B	A │
		 * ───────────────────────┘
		 * LIFO (마지막에 들어온 것이 처음에 나온다)
		 * push() 넣을때 , pop()꺼낼때 , empty() 요소가 (비었는지) 있는지?, search() 찾을때
		 * 				 peek()최신것 확인
		 * */
		Stack s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
//		s.iterator() x 못쓰는거 아님 안쓰는거임 최신꺼를 꺼낼려고 안쓰는것
//		System.out.println( s.pop()); //끄집어내서 없어지는것
//		System.out.println( s.peek());	//그냥 최신것
//		System.out.println( s.size());
		
//		System.out.println(s.search("홍길동")); // -1 : 찾을수 없다
//		System.out.println(s.search("김재민")); // 2: 2번째열에 있다
//		System.out.println(s.indexOf("김재민")); // 2: 2번째열에 있다
		
		while (!s.empty()) {
			System.out.println(s.pop());
			
		}
		
	} //main

} //class
