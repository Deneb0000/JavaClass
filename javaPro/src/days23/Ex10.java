package days23;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author dnb
 * @date 2024. 8. 2. - 오전 10:12:33
 * @subject		스트링 배열과 스트링 개체
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
		         new String[]{"abc", "def", "jkl"},
		         new String[]{"ABC", "GHI", "JKL"}
		      );
		// new String []{"abc","def","jkl"} 요소 -> Stream<S>
//		Stream<Stream<String>> s2=  strArrStrm.map(Arrays::stream); //최종함수 //인터페이스가 아님
		
		Stream<String> s2 = strArrStrm.flatMap(Arrays::stream);
		//map() -> flatmap() 차이점
		s2.map(String :: toLowerCase).distinct().sorted().forEach(System.out::println);; //소문자로 다시 요소들을 변환한다
		

	}

}
