package days17;

import java.util.Arrays;
import java.util.Collections;

public class Ex01_03 {

	public static void main(String[] args) {
		String [] names = {
				 "김재민",
				"김선우", "김인경","송세호","전재윤"		};
		Arrays.sort(names); // ASC(오름차순 정렬)
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder()); //내림차순x 역순으로 
		System.out.println(Arrays.toString(names));

	}//main

}//class
