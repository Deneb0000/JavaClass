package days19;

import java.util.Iterator;
import java.util.List;
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
public class Ex02 {

	public static void main(String[] args) {
		Vector vt = new Vector(10);
		vt.addElement("김재민");//동기화처리가 된 메서드
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		System.out.println(vt.size()); //요소의 갯수 ㅣ(null도 인식한다)
		System.out.println(vt.capacity());//용량
		
		vt.trimToSize(); //비어있는 용량을 제거 
		System.out.println(vt.capacity());//줄어든용량
//		vt.setSize(10);
//		System.out.println(vt.capacity());// 왜...12개?
		
		System.out.println(vt.get(1));
		System.out.println(vt.elementAt(1));
//		vt.remove(1);
//		vt.removeElementAt(1);
//		vt.remove("홍길동");
//		vt.removeElement("홍길동"); 	//삭제가 성공하면 true / 없으면 실패
		
		vt.set(1, "XXX");
		vt.setElementAt("YYY", 1);

		//vt.clear(); 모두삭제
		//vt.clearAllElements();
		vt.removeIf(e->e ==null);
		
		System.out.println("-".repeat(30));
/*		
		vt.forEach(new Consumer<String>() {	//Consumer = 리턴값 : void / 매개변수 1개 

			@Override
			public void accept(String n) {
				System.out.println(n);
				
			}
		});
 */
//		vt.forEach((n)->System.out.println(n));
		vt.forEach(System.out::println);  //메서드 참조
		System.out.println("=".repeat(30));
		
		
		//모든 요소  출력 : 반복자(iterator)
		Iterator ir = vt.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		vt.firstElement(); // == vt.get(0);
		vt.lastElement(); // == vt.get(vt.size()-1;

		int index =	vt.indexOf("YYY");
		vt.insertElementAt("이시훈", index+1);
		
		System.out.println(vt);
		
		//일부분에서만 끄집어내고 사용하고 싶어!
		Vector subVt= new Vector();
		for (int i = 2; i <= 4; i++) {
			subVt.addElement((vt).get(i));
		}
		
//		List sub
	} //main

}//class
