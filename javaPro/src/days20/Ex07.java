package days20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 2:15:59
 * @subject	무명클래스
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [익명 == 무명 == Anonymous 클래스]
		 *  1. 이름이 없는 클래스  : 이름이 없는데 어떻게 개체 생성을?? -> new class{}
		 *  2. 선언 형식
		 *  new 부모클래스명(매개변수. . .){
		 *	  @Override	
		 *  	부모메서드(){
		 *  	}	
		 *	  @Override	
		 *  	부모메서드(){
		 *  	}	
		 *  }
		 *  또는
		 *  new 부모인터페이스(){
		 *	  @Override	
		 *  	부모메서드(){
		 *  	}	
		 *	  @Override	
		 *  	부모메서드(){
		 *  	}	
		 *  }
		 * */
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3, 5, 2, 4, 1);
		System.out.println(list);
		//내림차순 정렬 -> 출력
//		list.sort(Comparator<? super integer>c)
//		list.sort(new ListComparator());
		/*
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);	// 0 양수 음수
			}
		});
		*/
		list.sort((o1,o2)-> o2.compareTo(o1)); //람다식
		
		System.out.println(list); //[5, 4, 3, 2, 1]
	} // main

	
	
} //class
/*
class ListComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);	// 0 양수 음수
	}
 	*/
