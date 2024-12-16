package days10;

import java.util.Arrays;

public class Ex04_03 {

	public static void main(String[] args) {
		//배열복사
		int [] m = {3, 5, 2, 4, 1} ; 
		System.out.println(Arrays.toString(m));
				
		int [] temp = new int[m.length+5];
	/*	for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		}//for
		*/
//		System.arraycopy/*배열복사*/(m/*복사할 원본대상*/, 1, temp/*어디에복사할것인가*/, 5, 3/*몇개나*/);
		System.arraycopy(m, 0, temp, 0,5);
		System.out.println(Arrays.toString(temp));
		m = temp;
	}

}
