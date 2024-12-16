package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex07_02 {

	public static void main(String[] args) {
		// days 11 Ex05.java 로또게임
		HashSet lotto = new HashSet();//중복을 허용하지 않음
		
		fillLotto(lotto);
		dispLotto(lotto);


	}//main

	private static void dispLotto(HashSet lotto) {

		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]",num);
		}
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size()<6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}//while

	}

} //class
