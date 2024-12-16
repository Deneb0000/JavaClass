package days07;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		//	[로또6/45 게임]
		// 1~45
		//1 <= (int) (Math.random() *45)+1 <45
		
		//Random ran = new Random();
		//ran . nextInt(45)+1;

		int lottoNumber;
		int [] lotto = new int[6];
		/*
		for (int i = 1; i <= 6; i++) {
			lottoNumber =  (int) (Math.random() *45)+1;
			System.out.printf("[%d]", lottoNumber);
		}
		System.out.println();
		*/
		
		fillLotto(lotto);
		
		dispLotto(lotto);
		
		
		
	}	//main

	public static void fillLotto(int[] lotto) {
		int lottoNumber;
		//중복체크함수 만들어보기		
		/*for (int i = 0; i < lotto.length ; i++) {
			lottoNumber =  (int) (Math.random() *45)+1;
			lotto[i] = lottoNumber;
		}*/
		
	}

	public static void dispLotto(int[] lotto) {
		for (int i = 1; i <lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println();
		
	}

}//class
