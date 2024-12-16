package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오후 12:40:57
 * @subject	큐(Queue) 구조
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 큐(Queue) 구조	FIFO : 먼저 들어간 것이 먼저 나온다
//			───────────────────────┐
//		 	 →	→	→	C	B	A  →	→
//			───────────────────────┘
		// 더블 큐(Deque)구조 : 입출력 둘다 가능
		// Offer() 넣을때 	poll() /peek() 가져올때
//		Queue q = new LinkedList();	//LinkedList() : Queue 기능으로 쓸수 있다 Queue는 인터페이스
		Deque q = new LinkedList();
		q.offer("전재윤");
		q.offer("김재민");
		q.offer("김준석");
		q.offer("박준용");
		
//		while (!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
		//Deque
		q.offerFirst(q); //[(this Collection), 전재윤, 김재민, 김준석, 박준용]
		q.offerLast(q); //[(this Collection), 전재윤, 김재민, 김준석, 박준용, (this Collection)]
		q.pollFirst(); //[전재윤, 김재민, 김준석, 박준용, (this Collection)]
		q.pollLast(); //[전재윤, 김재민, 김준석, 박준용]

		

		
	} //main

} //class
