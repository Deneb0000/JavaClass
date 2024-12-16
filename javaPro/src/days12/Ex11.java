package days12;

public class Ex11 {

	public static void main(String[] args) {
		// 기본형	or 참조형 메서드( "매개변수 ")
				// 							ㄴ기본형 매개변수
				// 							ㄴ참조형 매개변수
		int []m = new int [3];
		System.out.println(m.length);//3
		
		Ex11 ex = new Ex11();
		
		//ex.name = "홍길동"; // 객체명. 필드명
		m = ex.increaseArry(m);	//객체명. 메서드();
		System.out.println(m.length);	//6
		
			
		
	}	//main

	public int [] increaseArry(int[] m) { //3->6	참조형 매개변수
		int [] temp = new int [m.length+3];
		
		return temp;
	} //increaseArry

}//class
