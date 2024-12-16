package days14;

public class Car {

	//field
	String name = null;
	String gearType= null;
	int door = 0;
	Engine engine = null ;	//has-a 관계 : 두 클래스가 하나
//	Engine engine = new Engine();	//결합력이 높은 코딩 . (안좋은코딩 :일체형같은것 차에 엔진이 일체형이다)
	
	// constructor
	Car(){
		this.engine = new Engine();
	}
	
		
	public Car(Engine engine) {
		this.engine=engine;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	//method
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int less) {
		this.engine.lessFuel(less);
	}
	void speedStop(int stop) {
		this.engine.stop();
	}
	
}
