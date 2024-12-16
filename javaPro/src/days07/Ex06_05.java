package days07;


public class Ex06_05 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		double height = 180.23;
		
		Object [] infos = {
				name, age, gender, height				
		};
		System.out.printf("%s %d %c %.2f\n",infos);	//Object . . . args

	}	//main

}	//class
