package days05;

/**
 * @author dnb
 * @date 2024. 7. 5. - 오후 4:51:15
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// char []	->		String 변환0617
		// for 문
		// string. charAt()
		String todo = "Auto-generated method stub";
//		System.out.println( todo.length()/*메소드*/);		//문자열의 길이 length() 매서드
		int size = todo.length();
		char [] todoCharArr = new char [size] ; 
		// todoCharArr.length	*메소드아님 필드임
		/*
		todoCharArr[0] = todo.charAt(0);
		todoCharArr[1] = todo.charAt(1);
		todoCharArr[2] = todo.charAt(2);
								:
		todoCharArr[25] = todo.charAt(25);
		 */
		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);
		}	//for
		// String -> char[] 변환
		// char [] -> String 변환
		String target = "";
		for (int i = 0; i < todoCharArr.length; i++) {
			target += todo.charAt(i);
		}
		System.out.println(target);
		
	}	//main

}	//class
