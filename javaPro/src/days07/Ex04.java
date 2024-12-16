package days07;

public class Ex04 {

	public static void main(String[] args) {
				// [정보처리 기사 실기]
				// [ 문제 ] 피보나치 수열의 항이 100보다 같거나 작을 때 까지의 합을 출력
				// 1+1+2+3+5+8+13+21+34+...+(???<100) = ????
		
		//1풀이 (배열)
		// 50개 배열크기
		//			 2  3
		//[1][1][2][ ] (대충50개)
		//index = 2
		// strArr[index] = strArr[index-2] + strArr[index-1]
		// strArr[index] > 100 break;
	   /* int [] strArr = new int[50];
	    strArr[0] = 1;
	    strArr[1] = 1;
	    int i = 0;
	    while(true){
	      i++;
	      strArr[i+2]=strArr[i]+strArr[i+1];
	      if(strArr[i]>=100) {
	        break;
	      }
	      System.out.println(strArr[i]);
	    }
	  }*/
		
		//*강사님의 피보나치 풀이 : 암기하는게 좋을듯 **정보처리기사 실기문제 유력함 
		/*2.풀이
		int firstTerm = 1; // 첫번째 항
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm+secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while( true ) {		//*while 쓰는 이유 : 몇번 반복한지 몰라서
			nextTerm = firstTerm+secondTerm;
			if(nextTerm>100) break;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;		//포인트
			secondTerm = nextTerm;		//다
		} //while
		
		System.out.printf("=%d\n",sum);
		*/
		
		//3번째풀이.
		/*
		int firstTerm = 1; // 첫번째 항
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm+secondTerm;
	
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		nextTerm=firstTerm+secondTerm ;
		// f=1, s=1 , n = ?
		//sum =(f+s) = 2
		// 1+1+2+
		while( nextTerm <=100 ) {		// 2<=참
			//if(nextTerm>100) break;
			System.out.printf("%d+", nextTerm);	// +2
			sum += nextTerm;		//4
			// f = 1 		s=2
			firstTerm = secondTerm;		//포인트
			secondTerm = nextTerm;		//다
			nextTerm = firstTerm+secondTerm;	// n=2
		} //while
		
		System.out.printf("=%d\n",sum);
		*/
		
		//4.풀이
		int firstTerm = 1; 
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm+secondTerm;
	
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
//		nextTerm=firstTerm+secondTerm ;
		
		while( (nextTerm = firstTerm+secondTerm) <=100 ) {		
			System.out.printf("%d+", nextTerm);	
			sum += nextTerm;	
			
			firstTerm = secondTerm;	
			secondTerm = nextTerm;
//			nextTerm = firstTerm+secondTerm;
		} //while
		
		System.out.printf("=%d\n",sum);


		
	}	// main

}	//class
