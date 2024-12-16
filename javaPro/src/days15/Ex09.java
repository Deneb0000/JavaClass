package days15;

public class Ex09 {

	public static void main(String[] args) {
		// 클래스 간의 관계
		// 1) has - a 관계	:	Engine, Car
		// 2) is - a 관계

		// HEnhine 클래스선언
		Engine heEngine = new HEnhine();
		Car c1 = new Car(heEngine);

		Engine kEngine = new HEnhine();
		Car c50001 = new Car(kEngine);
		
		Engine sEngine = new SEnhine();
		c50001.setEngine(sEngine);
		
	} //main

} //class
