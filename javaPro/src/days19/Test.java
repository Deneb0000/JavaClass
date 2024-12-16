package days19;

import java.lang.annotation.Retention;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// 2023/08/11 금요일   07:02:32.259
		/* 1번문제
		LocalDate d = LocalDate.of(2023, 8, 11);
		LocalTime t = LocalTime.of(7, 2, 32);
		double ms = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(d.getYear()+"/"+d.getMonth()+"/"+d.getDayOfMonth()+" "+d.getDayOfWeek()+"   "+t);
//		요일 못나타내고 있음
*/
		/*1번문제 해설
		LocalDateTime dt = LocalDateTime.now();
//		2024-07-25T10:06:04.122182100
//		System.out.println(dt);
		
		String patten = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
		//SDF DF CF MF
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patten);
		dtf.format(dt);
		String sdt = dtf.format(dt);
		System.out.println(sdt);
		 */
		
		
		//String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환시키세요.
		String s = "2023.08.11 (금)";
		/* 내 풀이
//		String s = "2023.08.11";
//		String p = "yyyy.MM.dd";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(p);
//		LocalDate d2 = LocalDate.parse(s, dtf);
//		System.out.println(d2);
		//요일 못나타내고 있음
		 */
//		String
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);

		
//		3-2. ArrayList 컬렉션 클래스를 사용해서 ( 10분 )
//		  1) 팀원들의 이름을 요소로 추가    add(), addAll()
//		  2) 반복자를 사용해서 모든 요소(팀원들) 출력 
//		  3) 팀원들의 인원수를 출력
//		  4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
//		  5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
//		  6) "이"씨 팀원들만 삭제 후 확인.
		
		ArrayList list= new ArrayList();
		list.add("김재민");
		list.add("김선우");
		list.add("김인경");
		list.add("송세호");
		list.add("전재윤");
		
		//2)
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}
		//3)
		System.out.println(list.size());
		//4)
		System.out.println(list.get(1));
		list.set(1, "홍길동");
		
		//5)
		list.indexOf("홍길동");
//		:
		
		//6)"김"씨 팀원들만 삭제 후 확인
//		list.remove(0)
		/*for (int i = 0; i < list.size(); i++) {
		String name = (String) list.get(i);
		//if(name.charAt(0) == '김')
			if (name.startsWith("김")) {
				list.remove(i);
			}
			System.out.println(list);
		}*/
//		list.removeIf(t-> t.startsWith("김"))-> {
//			
//		} ????????
//===============================================================		
//		4. java.time.LocalDateTime 클래스 사용 ( 10분 )
//		   1) 설문 시작일 : 23.8.10   9:00:00
//		   2) 설문 종료일 : 23.8.15  18:00:00
//		LocalDateTime s = LocalDateTime.of(2023, null)
		
//		5. 이름, 나이 필드를 가진 Person 클래스를 선언하고
//		   ArrayList 컬렉션 클래스에  Person 객체를 요소로 추가하고 
//		   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..    

//		ArrayList al = new ArrayList();
//		list.add(new Person("송세호", 20));
//		list.add(new Person("이시훈", 23));
//		
//		/*list.sort(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		});*/
//		list.sort((o1,o2)->((Person)o1)
//		});
		
	} //main
	
	class  Person{
	private String name ;
	public Person(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
		
	}

} //Test
