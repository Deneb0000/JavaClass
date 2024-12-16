package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collections.*;
import java.util.stream.Collectors;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오전 11:50:05
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
//		Arrays 클래스 : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		int [] m = {3, 5, 2, 4, 1};
//		Arrays.sort(m);
//		Arrays	.binarySearch(m, 5);//이진검색
//		Arrays.toString(m);
//		Arrays.fill(m, -1);
//		System.out.println(Arrays.toString(m));
		
//		Collectoins 클래스 사용하기 쉽도록 기능이 구현된 클래스
//		Collectoins.reverseOrder();
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(2);
//		list.add(4);
//		list.add(1);
		
		Collections.addAll(list, 3, 5, 2, 4, 1);
		System.out.println(list);
		Collections.rotate(list, 2); //>>오른쪽으로 2칸씩 회전
		System.out.println(list); 
		
		Collections.swap(list,0,3);
		System.out.println(list);
		Collections.shuffle(list); //임의의 자리변경.
		System.out.println(list);
		
//		Collections.sort(list); //오름차순정렬
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder()); //내림차순정렬
//		Collections.sort(list, (a,b)->b-a); //내림차순정렬
		System.out.println(list);
		
		Collections.fill(list, -1); // -1로 채우겠다
		System.out.println(list);
		
	} // main

} //class
