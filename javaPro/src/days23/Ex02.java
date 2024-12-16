package days23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) 	list.add(i);
		//요소를 모두 출력하고 싶다
//		list.forEach(i -> System.out.println(i)); //컨수머때매 매개변수는 1개
		list.forEach(System.out::println); // 메서드 참조  *위의 코딩이랑 같다 *a :: b  a 안에 있는 b를 사용하겠다
		
		
		list.removeIf(i -> i%2==0); //짝수면 제거
		System.out.println(list);	//[1, 3, 5, 7, 9]
		
		
		list.replaceAll(i -> i*2);
		System.out.println(list); // //[2, 6, 10, 14, 18]
		
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k,v) -> System.out.println(k+"/"+v));
//		1/1
//		2/2
//		3/3
//		4/4

	} // main

}//class Ex02
