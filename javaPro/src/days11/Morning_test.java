package days11;

import java.util.Arrays;

public class Morning_test {

	public static void main(String[] args) {
/*
		int[] m = {1, 2, 3};
        int ns = 4;
        int index = 1; 

        int[] newM = new int[m.length + 1];
        for (int i = 0; i < index; i++) {
            newM[i] = m[i];
        }
        newM[index] = ns;
        for (int i = index; i < m.length; i++) {
            newM[i + 1] = m[i];
        }

        System.out.print(Arrays.toString(m));

        System.out.println();

        System.out.print(Arrays.toString(newM));
        */
		

		int [] m = {1,2,3,4,5,6};
		int [][] n = new int[2][3];  
	      // i=0              0 0	 몫		나머지		로봐서 로직?을 짤수있다
	      // i=1              0 1
	      // i=2              0 2
	      // i=3              1 0
	      // i=4              1 1
	      // i=5              1 2
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d-[%d][%d]\n",i,i/(n[0].length),i%(n[0].length));
			n[i/n[0].length][i%n[0].length] = m [i ];
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		}
		
		
		
	/*	int index = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if (index<m.length) {
					n[i][j] = m[index];
					index++;
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
			}
		}

		System.out.println(Arrays.deepToString(n[2][3]));*/

	/*	
		//3번문제 풀이
		int[] m = {1, 2, 3};
		int[] n = new int [m.length+1];	//열을 추가해주고
		int index = 1;
		System.arraycopy(m, 0, n, 0, index);	//	[1, 0, 0, 0]
		n[index]=4;											// [1, 4, 0, 0]
		System.arraycopy(m, 1, n, index +1, m.length-1);	//[1, 4, 2, 3]
		System.out.println(Arrays.toString(n));
		*/
		
		
	}//main
	
	
	private static void dispM(int[][] m) {
		System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.println(); 
	      
	      for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            System.out.printf("[%02d]", m[i][j]);
	         } // for j
	         System.out.println();
	      } // for i
		
	}//dispM
	/*
	public static int binarySearch(int [] m, int [] n) {
		int s = 150;
		int bot = 0;
		int top = m.length-1;
		int mid;
		
		while (top>=bot) {
			mid = (top+bot)/2;
			if (m[mid] == s) return mid-1;
			else if (m[mid] >= s) top = mid-1;
			else if (m[mid] <= s) bot = mid+1;
		}
		return-1;
	} // binarySearch
	
	public static void bubbleSearch(int [] m) {
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 4; j++) {
				if (m[i]>m[j]) {
					int temp = m[j];
					m[j] = m[i];
					m[i] = temp;
				} //if
			}	//for j
		}// for i
	}	// bubbleSearch
	*/
}//class

