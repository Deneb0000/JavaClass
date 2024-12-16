package days04;

public class Ex04 {

	public static void main(String[] args) {
		//쉬프트 (shift) 연산자 >> << >>>>
		// ㄴ 비트 연산자
		// ㄴ 물건을 이동ㅅㅣ키다 [옮기다]		코딩 : 비트를 옮긴다
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(10 >> 2);
		//00001010
		System.out.println(10 >>> 2); 
		//0000010
		System.out.println(10 << 2);
		//0101000
		
	}

}
