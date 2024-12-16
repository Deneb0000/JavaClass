package days15;

public interface Engine {
	//method : 인스턴스 (추상메소드가 아니라서 오류가 뜬다) -> 추상메소드로 바꿈
	void moreFuel (int fuel);
	void lessFuel (int fuel); 
	void stop();
	
	static void staticMethod() {
		//
	}
	
	default void newMethod() {
		//몸체 구현
	}
}
