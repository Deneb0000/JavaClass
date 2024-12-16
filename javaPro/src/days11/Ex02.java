package days11;

import java.util.Arrays;

/**
 * @author dnb
 * @date 2024. 7. 15. - 오후 4:09:21
 * @subject
 * @content		제어문 연습
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		int[]m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(Arrays.toString(m));
		
		//배열 섞기
		shuffle(m); //배열을 섞어주는 
		System.out.println(Arrays.toString(m));

	}	//main

	private static void shuffle(int[] m) {
		int idx1 = 0, 	idx2;
		for (int i = 0; i < 10; i++) { //10번정도 섞겠다
			idx2 = (int)(Math.random()*9)+1;
			
			int temp = m[idx1];
			m[idx1]=m[idx2];
			m[idx2]=temp;
		}
	}

}	//class
