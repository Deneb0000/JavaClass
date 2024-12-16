package days14;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01_02 {

	public static void main(String[] args) {
//		위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
//		  결과는 같을 경우 true/ 다를 경우 false 로 출력.
//		  조건) 대소문자는 구분하지 않는다.    

		//알파벳 갯수를 묻는것
		String n = "keNik";   
		  String m= "kKnie";

//		  n.toUpperCase().charAt(); //IntStream
//		  Stream.of (m.toLowerCase().split(""));
		  
		 n.toUpperCase().chars().sorted()
		 .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
		  
		  m=Stream.of(m.toUpperCase().split(""))
				  .sorted()
				  .collect(Collectors.joining());
	}	//main

}		//class
