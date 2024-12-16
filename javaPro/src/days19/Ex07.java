package days19;

import java.util.HashSet;

public class Ex07 {

	public static void main(String[] args) {
		// Set - 순서 유지x , 중복 허용x
		//		HashSet 컬렉션 클래스
		// 		순서 유지하고 싶으면 Set = LinkeHashSet 컨렉션 클래
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(11);
		hs.add(15);
		hs.add(10);
		
		System.out.println(hs); //[9, 10, 11, 15] 순서유지x(순서가 없다)
		
		hs.add(11);
		System.out.println(hs); //[9, 10, 11, 15] 11은 또 안들어왔다 중복 허용 x
		
	}//main

}//class
