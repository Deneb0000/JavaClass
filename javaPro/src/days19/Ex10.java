package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex10 {

	public static void main(String[] args) {
		//			┌ Integer 타입을 저장하겠다. (기본형이 오면 안된다)
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);

		
		// 1) a U b  합집합 [1, 2, 3, 4, 5, 6, 7, 8]
//		HashSet<Integer> hab = new HashSet<Integer>(a);
//		hab.addAll(b);
//		System.out.println(hab);		

		/* ArrayList 중복체크하면서 생성하는법
		ArrayList<Integer> hab = new ArrayList<>(a);
	      // hab.addAll(a);               // 1,2,3,4,5
	      Iterator<Integer> ir = b.iterator();
	      while (ir.hasNext()) {
	         Integer i =  ir.next();
	         if( !a.contains(i) ) hab.add(i);
	      } 
	      System.out.println( hab);
		 */

		
		// 2) a - b  차집합 [1, 2, 3]
		a.removeAll(b);
		System.out.println(a);

		/*
	      ArrayList<Integer> cha = new ArrayList<>(a); 
	      Iterator<Integer> ir = b.iterator();
	      while (ir.hasNext()) {
	         Integer i =  ir.next();
	         if( a.contains(i) ) cha.remove(i);
	      } 
	      System.out.println( cha);
		 */
	      
		// 3) a ∩ b  교집합 [4, 5]

		ArrayList<Integer> kyo = new ArrayList<>();
	      Iterator<Integer> ir = b.iterator();
	      while (ir.hasNext()) {
	         Integer i =  ir.next();
	         if( a.contains(i) ) kyo.add(i);
	      }
	      System.out.println( kyo);

	} //main

} //class
