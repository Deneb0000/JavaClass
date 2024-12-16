package days14;

public class Ex11_02 {

	public static void main(String[] args) {
		/*
		Employee emp = new Employee();
		Regular emp2 = (Regular)emp;		//업캐스팅된것만 다운캐스팅된다
		*/

		Regular emp = new Regular();
		test(emp);

		
		Employee emp2 = new Regular();
		test(emp2);

	}	//main
//										┌*부모만 참조
	public static void test(Employee emp) {	//매개변수 다형성 개념	**이것 좀만 더 알아보기
		
	}

	
//	public static void test(Regular emp) {
//		
//	}
}	//class
