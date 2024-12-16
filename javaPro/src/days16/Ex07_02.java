package days16;

public class Ex07_02 {

	public static void main(String[] args) {
//		test_String(); // >String 처리 시간 : 4초 5565ms 29400ns
		tsst_StringBuider();

	} //main

	private static void tsst_StringBuider() {
		long start = System.nanoTime();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			s.append("a");			
		}
		long end = System.nanoTime();
		System.out.printf(">String 처리 시간 : %dns\n",(end-start));
		
	}

	private static void test_String() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s +="a";			
		}
		long end = System.nanoTime();
		System.out.printf(">String 처리 시간 : %dns\n",(end-start));
	}

} //class


