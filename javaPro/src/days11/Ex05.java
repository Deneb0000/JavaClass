package days11;

import java.util.Scanner;

/**
 * @author dnb
 * @date 2024. 7. 15. - 오후 4:47:37
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 로또 게임 + (게임 횟수 입력)
		int n = 5;
		int [][] lottos = new int [n][6];
		
		//배열의 배열이다
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);	//1차 항배열의 6개
		}
		for (int i = 0; i < lottos.length; i++) {
			dispLotto(lottos[i]);	//배열의 배열***
		}
	}
	
	public static void fillLotto(int[] lotto) {        
		int lottoNumber; 
		lotto[0] = (int) (Math.random() *45)+1; 
		// [23] [12] [0] [0] [0] [0] 
		//					 ↑
		//					23
		int index = 1;
			while (index <=5) {			
			lottoNumber =  (int) (Math.random() *45)+1;
			System.out.println(lottoNumber);
			if (!isDuplicate(lotto,lottoNumber,index) )
				lotto[index++] = lottoNumber;
		}	//while
	}                                                  
    
	public static boolean isDuplicate(int[] lotto, int lottoNumber,int index) { //중복확인
		for (int i = 0; i < index; i++) {
			if(lotto[i] == lottoNumber) {
				return true;
			}
		}
		return false;
	}
	
	public static void dispLotto(int[] lotto) {        
		for (int i = 0; i <lotto.length; i++) {        
			System.out.printf("[%d]", lotto[i]);       
		}                                              
		System.out.println();     
	}

}
