package days13;

public class Time {

	// field
	public int hour;
	protected int minute;
	int second;
	private long millisecond; // 1000ms = 1s
	
	//method
	public void privateTest() {	//같은패키지 내부에서
		millisecond = 1822;
		
	}//privateTest
	
	void test() {
		
	}
	
	public static void main(String[] args) {

	}

}
