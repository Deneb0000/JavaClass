package days17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오전 11:14:02
 * @subject		내림차순
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {

//		int [] m = {3, 5, 2, 4, 1};
//		System.out.println(Arrays.toString(m));
		

		/*
		Arrays.sort(m); // ASC(오름차순 정렬)
		System.out.println(Arrays.toString(m));
		int [] temp = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			temp[temp.length-1-i] = m[i];	//내림차순 정렬
		}
		System.out.println(Arrays.toString(temp));
		*/
		
		/*
		int [] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
//		IntStream : 스트링개체로 만들다 -> Stream<Integer>	//m이라는 배열을 복제하여 temp를 만들었다.
		System.out.println(Arrays.toString(temp));
		*/
		
		Integer [] m = {3, 5, 2, 4, 1};
		System.out.println(Arrays.toString(m));
		
//		Arrays.sort(m, new 비교자);
	/*
		Arrays.sort(m, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
//				return o1-o2;//오름차순
				return o2-o1;//내림차순
			}
		});
		
		System.out.println(Arrays.toString(m));
		*/
		
	} //main

	class 비교자 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			int a = (int) o1;
			int b = (int) o2;
			return a-b;
		}
		
		
	}
	
} //class
