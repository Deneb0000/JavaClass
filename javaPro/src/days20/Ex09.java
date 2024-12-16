package days20;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 4:29:13
 * @subject	열거형
 * @content	IO (입출력)
 *			람다식과 스트림
 *
 *			열거자(enumeration)							/	반복자(iterator) 기억만하기
 *			ㄴvalue를 값을 복제해서 읽어옴 원본이 수정이 일어나도 읽어온다	ㄴ읽고 읽는 짤ㅂ은 순간에 원본 데이터의 수정이 일어나면 예외발생 
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("a",100);
		ht.put("b",200);
		ht.put("c",300);
		
		Enumeration<Integer> ven = ht.elements();
		while (ven.hasMoreElements()) {
			Integer v = ven.nextElement();
			System.out.println(v);
		}
		
		Collection<Integer> vc = ht.values();
		Iterator<Integer> ir = vc.iterator();
		while (ir.hasNext()) {
			Integer v = ir.next();
			System.out.println(">"+v);
		}
		
		
	} //main

} //class
