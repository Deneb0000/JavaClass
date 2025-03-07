package days20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex01Lotto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">게임횟수 입력?");
		int gnum = 1;
		gnum = scanner.nextInt();

		LinkedHashSet lotto = null;
		ArrayList lottos = new ArrayList();

		for (int i = 1; i <=gnum; i++) {



			System.out.printf("%d게임 : ",i);
			
			lotto = new LinkedHashSet();
			fillLotto(lotto);
			lottos.add(lotto);

		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {  
		lotto = (LinkedHashSet) ir.next();
		}
		dispLotto(lotto);
		}


	}//main
	private static void dispLotto(LinkedHashSet lotto) {
	
		Iterator ir = lotto.iterator();                 

		while (ir.hasNext()) {                   

			int num = (int) ir.next();                  
			System.out.printf("[%d]",num);              
		}                                               
		System.out.println();                           
	}                                                   

	private static void fillLotto(LinkedHashSet lotto) {
		Random rnd = new Random();                      
		int n;                                          
		while (lotto.size()<6) {                        
			n = rnd.nextInt(45)+1;                      
			lotto.add(n);                               
		}//while                                        

	}                                                   
}//class
