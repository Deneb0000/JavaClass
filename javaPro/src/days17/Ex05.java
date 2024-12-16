package days17;

import java.io.IOException;
import java.util.Objects;

import days12.Point;

public class Ex05 {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 사용하기 쉽게 구현된 클래스 // toString(), sort(), binarySearch()
		// Objects 클래스 : 객체를 다루기위한 클래스 // 모든 메서드 static이다
//							Objects.메서드()
//							객체의 비교 또는 null 체크...유용
		Point p1 = null;
		//p1 체크 ?
//		if (p1 == null) {}
//		=
//		if (Objects.inNull(p1)) {}
		
//		if (p1 != null) {}
//		=
//		if (Objects.nonNull(p1)) {}
		
//		if(p1 ==null) {
//			new IOException("예외 메시지를 적고");
//		}
//		Point pCopy = p1;
//		//
//		Point pCopy = Objects.requireNonNull(p1, "예외 메시지를 적고");
//		
//		if (p1 != null && p1.equals(pCopy)) {}
//		if (Objects.equals(p1, pCopy)) {}
		

	} //main

} //class
