package days19;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오전 11:10:47
 * @subject			List				Set					Map
 * @content		:1) ArrayList
 * 				 2) [Vector 컬렉션클래스]
 *						ㄴ ArrayList와 차이점?
						:멀티 스레드에 안전하다(동기화처리가 되어져있다) 나머지는 같다
	StringBuffer 	멀스안전 o, 동기화 o
	StringBuilder 	멀스안전 x, 동기화 x
 */
public class Ex02_02 {

	public static void main(String[] args) {
		Vector vt = new Vector(10);
		vt.addElement("김재민");//동기화처리가 된 메서드
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);

		ListIterator ir = vt.listIterator(); //양방향
		while (ir.hasNext()) { // hasNext :"다음요소있니?"
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("-".repeat(30));
//		vt.listIterator() // listIterator는 단방향(일방통행이다)
		while (ir.hasPrevious()) { // Previous :"이전 요소있니?"
			String name = (String) ir.previous();
			System.out.println(name);
		}
		
		
		
		} //main

	}//class
