package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dnb
 * @date 2024. 7. 9. - 오후 12:07:47
 * @subject		제어문	+	배열 활용
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// ㅅㄴ용카드
		String card = "4567-2341-5746-5677";
		//카드 결재 영수증
		/*
		 * 4567-****-5746-5677
		 * 4567-2341-5746-****
		 * ****-2341-5746-5677
		 * 4567-2341-****-5677
		 */
		String regex = "-";
		String [] cardArr= card.split(regex);
		
		/*
		for (String c : cardArr) {
			System.out.println(c);
		}*/
		System.out.println(Arrays.toString(cardArr));
		
		//0~3 임의의 정수
		Random rnd = new Random();
		int index = rnd.nextInt(4);		// 0<= 정수 < 4
		cardArr[index] = "*".repeat(4);
		
		System.out.println(Arrays.toString(cardArr));
		/*
		System.out.printf("%s-%s-%s-%s\n", cardArr[0], cardArr[1],cardArr[2],cardArr[3]);
		*/
		//암ㅁ기
		String printCard = String.join("-",cardArr);
		System.out.println(printCard);
		
		
	}		//,ain

}	//classs
