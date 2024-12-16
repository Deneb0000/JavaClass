package days20;

import java.util.ArrayList;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 4:23:50
 * @subject
 * @content
 *
 */
public class Ex08_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //일반 클래스
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//				  원시타입
		
		ArrayList<Integer> list2 = new ArrayList<>(); //제네릭 클래스

		//원시타입과 제네릭 타입 간의 형변환
		// : 경고만 발생시키고 자동으로 변환해서 사용가능함
		//<T>가 없으면 ArrayList<Object> list = new ArrayList(); <Object> 타입으로 컴파일 됨


	
	} //main

} //class
