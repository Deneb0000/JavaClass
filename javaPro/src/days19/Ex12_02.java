package days19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오후 4:32:02
 * @subject		Map을 구현한 콜렉션 클래스 
 * @content
 *
 */
public class Ex12_02 {

	public static void main(String[] args) {
		/*
		 * List - AL, V, LL, S, LL(Q), PQ
		 * Set - HS, LHS, TS
		 * [Map]
		 * 1. key + value 한쌍 관리 ==  Entry(앤트리)
		 * 2. key 중복 x
		 * 	  value 중복 o
		 * 3. [Hash]Map	(신)	- 사용권장
		 * 	  [Hash]Table	(구)
		 * 
		 * 4. 해싱(Hashing)?
		 * 	- 해시함수를 이용하여 데이터를 해시 테이블에 저장하고 검색하는 기법.
		 *  - 해시 함수?
		 *  	데이터를 저장하는 곳을 알려주는 함수?
		 *  	데이터를 빠르게 검색할 수 있다.
		 *  
		 *  예)
		 *  	[2020]-[1][2][3]...[12]
		 *  	[2021]-[1][2][3]...[12]
		 *  	[2022]-[1][2][3]...[12]
		 *  	[2023]-[1][2][3]...[12]
		 *  	[2024]-[1][2][3]...[12]
		 *  - 해싱을 사용하기 때문에 '많은 양의 데이터'를 검색할 때
		 *    뛰어난 성능이 있다.
		 * 
		 * */
//				 id		name
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("keni", "이창익");
		
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) ir
					.next();
			System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
		}
		
		/*
		System.out.println(hm);
		System.out.println(hm.size()); //엔트리의 갯수
		
		//1. 모든 key 조회
		Set<String> keys = hm.keySet();
		Iterator<String> ir= keys.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.printf("%s=%s\n",key,hm.get(key));
	    }
		
		
		Collection<String> values = hm.values();
		Iterator<String> ir2= values .iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
			System.out.printf("%s\n",value);
		*/
		
	} //main

} //class
