package days06;

import java.io.IOException;

public class Ex02_02 {

	public static void main(String[] args) throws IOException {
		for (int i = 0, lineNumber = 1; i < 256; i++) {
	         if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
	         System.out.printf("[%c]", i);
	         if (i%10 == 9) {System.out.println();

	         if ((lineNumber-1) % 10 == 0) {
	        	 System.out.print("엔터를 치면 계속합니다");
	        	 System.in.read();
	        	 System.in.skip(System.in.available());
	        	 } //if3
	         } //if2
		}//for

	}//main

} //class
