package days23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author dnb
 * @date 2024. 8. 2. - 오전 9:01:18
 * @subject
 * @content
 *
 */
public class Ex07 {

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

		s
		.sorted(
				Comparator.comparing(Student::getBan)	//1차정렬은 반으로
				.thenComparing(Comparator.naturalOrder())	//성적순으로 정렬
				) 
		.forEach(System.out ::println);
		
	} //main

} // class Ex07
//							┌인터페이스
class Student implements Comparable<Student> { //implements Comparable<Student> 임플리먼트한 메서드 기준으로 정렬하겠다
	String name;		//필드
	int ban;			//필드
	int totalScore;	//필드

	Student(String name, int ban, int totalScore) { //생성자
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	@Override
	public String toString() { 
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

	// 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) { 
		return s.totalScore - this.totalScore;	//같으면 0 / 음수or양수
		//		return.totalScore - this s.totalScore;	//오름차순
	}
}

