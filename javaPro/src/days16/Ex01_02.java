package days16;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true/*입력이 잘될때까지*/) {
			try {	//예외가 발생할수있을것 같은 코딩을 집어 넣는다
				System.out.print("> a, b 두 정수 입력?");
				a = scanner.nextInt();	//a 1 
				b = scanner.nextInt();
				//InputMismatchException	a => nextInt() 변환을 못시켜서
				break;
				
			} catch (Exception e) { // 없어도 괜찮다
				//예외처리 코딩
				System.out.println(scanner.nextLine());	//다시입력해주는것
				System.out.println("> 입력값 잘못 실패 ...");		
//				e.printStackTrace();
//				System.out.println(e.getMessage());
				System.out.println(e.toString());	//에러 호출
			} 
			
		} //while
		
		//주의할점 자식 catch 블럭을 먼저 코딩한다 둔다.
		// if는 예외문이 아니다 
		
		try {
			double c = a/b;
			System.out.printf("%d/%d=%.2f\n",a,b,c);
			
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
		//어떤예외든
		}
		
		System.out.println("End");
	}	//main

}	//class
