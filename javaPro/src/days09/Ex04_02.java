package days09;

public class Ex04_02 {

	public static void main(String[] args) {
		int n = 10;		//8진수 출력		012	: 배열로 처리안해도 된다
		int share, reminder;
		
		String octal = " ";
		
		
		while (n !=0 ) {
			share = n/8;
			reminder = n%8;
//			System.out.printf("%d",reminder);		//여기까지가 21로 나온다 (12가 거꾸로나옴)
			octal = reminder + octal;
			n = share;
		}
		octal = "0"+octal;
		System.out.println(octal);
		/*
		int share, reminder;
		int [] binaryArr = new int[32];
		System.out.printf("%o\n",n); //정답확인용
		
		int index = binaryArr.length-1;

		while (n !=0 ) {
			share = n/8;
			reminder = n%8;
			binaryArr[index--]	=	 reminder;
			n = share;
//			System.out.printf("%d",share);
		}
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if (i%8==7) System.out.print(" ");	//줄맞춤용
		}
		System.out.println();
		
		*/
	}

}
