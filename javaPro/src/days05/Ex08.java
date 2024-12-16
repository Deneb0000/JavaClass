package days05;

/**
 * @author dnb
 * @date 2024. 7. 5. - 오후 4:10:18
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		// [ASCII 모두 출력] + for 문 사용.
		// 7비트 - 128문자
		// 8비트 - 256문자 (확장)
		// 0~31			제어문자
		// 32~127 	일반문자 (숫자, 대+소문자 등)
		// 128~255	사선 . . . 문자
		/*
		for (int i = 0; i < 256; i++) {
			System.out.printf("%d[%c]\n",i,i);
		}
		*/
		// 9	'\t'	tab
		//10	'\n'	LineFeed(LF)	줄바꿈
		//13	'\r'	CarrageReturn(CR) 커서 앞으로 보냄
		//[문제] 한 라인에 10개씩 출력하자.
		/*
		 * 	1	:	0	1	2	~	9	개	행
		 * 2	:	10		~		19	개	행
		 * 3	:	20		~		29	개	행
		 * 4	:	30		~		39	개	행
		 * */
		for (int i = 0, lineNum=0; i < 256; i++) {
			if(i%10==0) 	System.out.printf("%02d : " ,++lineNum);
			System.out.printf("[%c]" ,i);
			if (i%10==9) System.out.println();			
		}

		
	}

}
