package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
	
		//다중catch문 
		try {
			System.out.print("> a, b 두 정수 입력?");
			a = scanner.nextInt();	//a 1 
			b = scanner.nextInt();
			double c = a/b;
			System.out.printf("%d/%d=%.2f\n",a,b,c);
			
		} catch (InputMismatchException e) { // 없어도 괜찮다
			System.out.println(scanner.nextLine());	
			System.out.println("> 입력값 잘못 실패 ...");		
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			}
		
		System.out.println("End");
	}	//main

}	//class
