package days19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		solution("abc1Addfggg4556b",   6);


	}//main

	public static String[] solution(String my_str, int n) {

		ArrayList list = new ArrayList();

		int i = 0;
		String str = null;
		try {
			while (true) {
				str = my_str.substring(i*n,(i+1)*n); //자를꺼다
				System.out.println(i+":"+str);
				list.add(str);
				i++;
			}

		} catch (StringIndexOutOfBoundsException e) {
			str = my_str.substring(i*n);
			if(str.length() !=0 ) {
				System.out.println(i+":"+str);
				list.add(str);
			}
		}
		//String [] -> Arrylist 변환
		

		//Arraylist -> String [] 변환
		String[] answer = (String[])list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(answer));
 		
		return answer;
	}
}//class
