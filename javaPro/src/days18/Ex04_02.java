package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author dnb
 * @date 2024. 7. 24. - 오후 3:33:32
 * @subject	배열처럼 다루는 컬랙션 클래스
 * @content	ArrayList
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 배열(array) 단점 :	늘어나지않는다
		
		/*
		int [] m = {1, 2, 3, 100};
		System.out.println(m.length);	//3
		// 100 추가 append()
//		m[3] = 100;
		// 1 인덱스 2 삭제 remove()
		 */
		//<E> : 제네릭 클래스(=컬렉션 클래스)	E : Element = 요소
//		ArrayList list = new ArrayList(10); //아무것도 안주면 10개
		ArrayList list = new ArrayList(3);
		System.out.println(list.size()); 	//요소갯수 : 0
		list.add("이시훈");
		list.add("원충희");
		list.add("김준석");
		System.out.println(list.toString());
		System.out.println(list);
		System.out.println(list.size()); 	//3
		list.add("송세호");					// 요소를 추가했는데도 오류가 뜨지않았고 늘어났다!
		System.out.println(list);
		
		list.add("원충희");
		System.out.println(list.contains("원충희")); //contains 있다 true / 없다 false
		System.out.println(list.indexOf("원충희"));
		System.out.println(list.lastIndexOf("원충희"));
		System.out.println(list);
		
		//3번 인덱스 값의 사람을 알고 싶어 (3인덳스 요소의 값 얻어와서 출력) : 송세호
		// 배열명[3]
//		list.clear(); //모든 요소 (element)를 삭제
		System.out.println(list);
		System.out.println(list.get(3));	//3번위치의 배열내용을 알려줌
		list.set(1, "전재윤");	//set 다시수정
		System.out.println(list);
		
		// 원충희를 찾아서 삭제..
		int index = list.indexOf("원충희"); //4
//		list.remove(index);		// 다 된다
//		list.remove("원충희");
//		list.remove(4);
		// <E> element
		// <T> Type
		/*
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t .equals("원충희");
			}
		}); 	//람다
		*/

//		list.removeIf((n) -> n .equals("원충희")); //람다
//		System.out.println(list);

//		System.out.println(list.isEmpty());  //isEmpty 비웠니? true / false

		/*
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				return o1.compareTo(o2); //오름차순
//				return o2.compareTo(o1); //내림차순
			}
		}); //sort 정렬
		*/
//		list.sort((o1,o2)-> o2.copareTo(o1));		//제네릭?
		
//		list.sort(Comparator.reverseOrder()); //내림차순
//		System.out.println(list);
		
		//list의 모든 요소를 출력
//		list.get(index); - 한개만 가져오는거
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// iterator = 반복자 (반복적을 접근해서 처리하겠다)
		Iterator ir = list.iterator();
		while (ir.hasNext()) { //반복자를 사용해서 반복자	/hasNext 가져올게 있으면 true  없으면 false
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		//list.forEach(null);
		for (Object name : list) {
			System.out.println((String)name);			
		}
		
	} //main

} //class
