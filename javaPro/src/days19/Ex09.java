package days19;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오후 2:48:19
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// List : AL, V, LL, S, LL(Q,DQ), PQ,
		// Set : HashSet, LinkedHashSet
		// ㄴ순서가 유지되지않는다, 중복을 허용하지 않는다 (중복체크 필요x)

		Set s= new LinkedHashSet();
		s.add(new Person("kenik","홍길동",20));		
		s.add(new Person("admin","관리자",40));		
		s.add(new Person("hong","홍길남",25));

		//ID가 똑같은 Person 객체는 중복 처리를 해서 추가
		s.add(new Person("admin","관리자2",36));	
		System.out.println(s.size());
		
	}//main

} //class


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

class Person{	//사람을 구별할수 있는 클래스
	String id;	//식별자
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {	//id 값이 같은 값이면 같은 사람으로 인식
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p. id.equals(this.id);
		}
		return false;
	}



}