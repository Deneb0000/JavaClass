package days19;

import java.util.LinkedList;

public class Ex03_02 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("박준용");
		list.add("김준석");
		list.add("김재민");
		System.out.println(list);

		// list.get(0);
		// list.getFirst();
		// list.getLast();
           
		// list.contains("홍길동"); //있냐?
		// list.indexOf("홍길동");
           
		// list.addFirst(list);  // 제일 앞에 추가
		// list.addLast(list);  // 제일 뒤에 추가

		//  ┌내부에 배열을 사용해서    읽기     삽입/삭제     비고
		// ArrayList    		 빠르다     느리다       순차적으로 추가,삭제 빠르다.
		// LinkedList    		 느리다.    빠르다       데이터 많으면 많을 수록 접근성은 떨어진다.
			
	} //main

} //class
