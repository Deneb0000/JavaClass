package days10;

import java.util.Arrays;

public class Ex04_06 {

	public static void main(String[] args) {
		
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30
	            , 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
	            86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142
	            , 145, 146, 150, 151, 160, 161, 166, 168, 
	            169, 172, 181, 184, 185, 191, 198 };
		System.out.println(m.length);	//50
		
		int n = 150;
		
//		int index =	sequenceSearch(m,n); //찾는 숫자가 없으면 -1
		//이진검색 (binarySearch) 
		//필수조건 : 정렬이 되어있어야한다
		int index =	binarySearch(m,n);
//		int index = Arrays.binarySearch(m, n); //바이너리서치할꺼면 이거 쓰자 (있는거 쓰자)
		System.out.println(index);
		
		if ( index == -1){
			System.out.println("찾는 정수는 없다.");			
		}else {
			System.out.printf("찾는 정수는 %d 인덱스 위치에 있다.", index);
		}	
		
	}//main

	private static int binarySearch(int[] m, int n) {
		int bot = 0 /*배열의 0번째 값*/ , top = m.length-1;
		int mid;
		int count =0;
		
		while (top >= bot) {
			System.out.printf("%d회. \n", ++count);
			mid = (bot+top)/2;
			if(m[mid]==n) return mid-1;
			else if (m[mid]>n) top = mid-1; //새로운 top의 위치
			else if (m[mid]<n) bot = mid+1; //새로운 bot의 위치
		}
		
		
		return -1;
	}

	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i]== n) {
				index = i;
				break;		//찾으면 for문을 빠져나가겠다
			}
		}
		return index;
	}

}//class
