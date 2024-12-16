package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author dnb
 * @date 2024. 8. 2. - 오전 11:34:15
 * @subject		Collect() 최종연산
 * @content
 *
 */
public class Ex13 {

	public static void main(String[] args) {
		// Collect() 최종연산

		Student[] stuArr = {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)   
		}; 
		
//		1. 학생들의 이름만을 뽑아서 List<Strign>에 저장
		/*
		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			String name = s.getName();
			nameList.add(name);
		}
		*/
		/*
		//collect(매개변수 : 어떻게 수집할지 (수집방법))
//					Colletor, Collectors
		List<String> names= Stream.of(stuArr).map(Student::getName)
		.collect(Collectors.toList());
		
		System.out.println(names);
		*/
		
		/*
		// stuArr 배열 -> Stream 생성 -> Stubent [] 배열 변환
		Student [] stuArr2 = Stream.of(stuArr).toArray(Student []::new );
*/
		
		//stuArr -> Stream 생성 -> Map<key, value> 변환
		Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s-> s.getName(), p -> p));
		for (String keyName : stuMap.keySet()) {
			System.out.println(keyName);
		}
		System.out.println(stuMap.keySet()); //[안자바, 김자바, 박자바, 나자바, 감자바, 이자바, 소자바]

		
	} //main

} //class Ex13
