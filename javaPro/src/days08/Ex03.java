package days08;

/**
 * @author dnb
 * @date 2024. 7. 10. - 오전 11:24:27
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// [주민등록번호]
		//	住民登錄番號 / Resident registration number, RRN
		//	1. 생년월일
		//	2. 성별
		//	3. 내/외국인
		//	4. 출신지역
		//	5. 나이(만나이, 세는나이)
		//	6. 검증
		String rrn= "941201-2057925";
		// 주민등록번호 ->생년월일
		// 1994년 12월 01일
		String bday = getBday(rrn);
		System.out.println( bday);
		
		String gender = getGender(rrn).split("/")[1];
		System.out.println( gender );
		
	
	}	//main

	public static String getBday(String rrn) {
//		YYMMDD	G 
//		"941201-2057925"
		int year 	= Integer.parseInt (rrn.substring(0, 2));
		int month	= Integer.parseInt (rrn.substring(2, 4));
		int day 		= Integer.parseInt (rrn.substring(4, 6));
		
		String gender = getGender(rrn);	//	"1900/남여/내,외국인"
		
		int centry = Integer.parseInt(gender.split("/")[0]);		
		
		year = centry + year;
		
		// 1994년 12월 01일
		String bday=	String.format("%d년 %d월 %d일",year, month, day);
		return bday;
	}

	public static String getGender(String rrn) {
		//1994 여 내국인
//		YYMMDD	G 
//		"941201-2057925"
		int gender = Integer.parseInt (rrn.substring(7, 8));	//2
		
		char 성별 = gender%2 == 0 ? '여' : '남';
		String 국적 = "내국인";
		// [5~8]
		if( 5 <= gender && gender <=8 ) 국적 = "외국인";
		
		int cc = 1800;	//출생세기
		switch (gender) {
		case 1: 	case 2:	 case 5: case 6:
			cc = 1900;
			break;
		case 3:	case 4:	case 7:	case 8:
			cc=2000;
			break;
		default:
			cc=1800;
			break;
		}
		
		
		return String.format("%d/%c/%s", cc, 성별, 국적);
	}

}	//class
