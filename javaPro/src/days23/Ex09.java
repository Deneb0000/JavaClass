package days23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author dnb
 * @date 2024. 8. 2. - 오전 9:01:18
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// 배열을 가지고 스트림 개체를 만들기 / arrays / .of
//		Arrays.stream(null)
		Stream<Student> s = Stream.of( // 똑같은 방법으로 처리할수 있다
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		//stream인데 int형태로 돌려주겠다
//		Stream<Integer> is = s.mapToInt(Student::getTotalScore);
		IntStream is =  s.mapToInt(Student::getTotalScore);	//박싱 언박싱의 효율적
		
		//요약	 통계량	 : 단점 한번 사용할때마다 소모해서 다시 써야한다
		IntSummaryStatistics stat = is.summaryStatistics();	
		System.out.println("count =" + stat.getCount());
		System.out.println("sum =" + stat.getSum());
		System.out.println("everage =" + stat.getAverage());
		System.out.println( stat .getMax());
		System.out.println( stat .getMin());
		
		
		/*
		s
		.sorted(
				Comparator.comparing(Student::getBan)	//1차정렬은 반으로
				.thenComparing(Comparator.naturalOrder())	//성적순으로 정렬
				) 
		.forEach(System.out ::println); //최종 연산
		*/
		
		
		
		
	} //main

} // class Ex07


