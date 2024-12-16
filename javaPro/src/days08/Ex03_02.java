package days08;

import java.util.Calendar;

/**
 * @author dnb
 * @date 2024. 7. 10. - 오전 11:24:27
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [주민등록번호]
		//	5. 나이(만나이, 세는나이)
		String rrn = "941201-1700001";
		
		/*								2022.12.31	2023.1.1	23.1231	24.1.1
		 * 	1. 한국식 나이				1살				2살			2살			3살
		 * 								올해년도	-	생일년도 + 1=1살
		 * 2. 연나이		=	올해년도 - 생일년도
		 * 2. 만 나이					0살				0살			1살			1살		
		 * 					=	올해 년도 - 생일년도		생일이 지나지 않으면 1살 빼기 
		 */

		int krAge = getKrAge(rrn);	//한국식나이
		System.out.printf(">한국식(세는) 나이 : %d살, \n", krAge);
		int amrAge =getAmrAge(rrn); //만나이
		System.out.printf(">만 나이 : %d살, \n", amrAge);
		
		System.out.println(krAge);
		System.out.println(amrAge);
		
		int byear = Integer.parseInt(rrn.substring(0, 2));
		System.out.println(byear);
	}	//main
	
	
//	연 나이 = 올해년도 - 생일년도
	private static int getYearAge(String rrn) {

		int byear = Integer.parseInt (Ex03.getBday(rrn). substring(0,4));
		//Calendar클래스 현재(올해)년도
		Calendar cal = Calendar.getInstance();
		int tyear = cal.get(Calendar.YEAR);
	
		return tyear - byear;
	}


// 세는 나이 (한국나이 ) = 연 나이 +1
	private static int getKrAge(String rrn) {
		return getYearAge(rrn) +1;
	}

	// 만 나이 = 연나이 -1(생일이 지나지 않으면 1살을 뺀다)
	/*
	private static int getAmrAge(String rrn) {
		int amrAge = getYearAge(rrn);
		//오늘 날짜가 생일 날짜 지나지 않았다면 -1
		int tMonth = 7, tDay =10;
		int bMonth, bday;
		bMonth = Integer.parseInt (rrn.substring(2, 4));
		bday =Integer.parseInt (rrn.substring(4, 6));
		
		if (tMonth<bMonth || tMonth==bMonth && tDay <bday) {	//생일안지남
			amrAge--;
		} 
				
		return amrAge;
	}*/
	
	private static int getAmrAge(String rrn) {		//만나이 구하기 **내일시험
		int amrAge = getYearAge(rrn);
		//오늘 날짜가 생일 날짜 지나지 않았다면 -1
		int tMonth = 7, tDay =10;
		Calendar cal = Calendar.getInstance();
		tMonth = cal.get(Calendar.MONTH+1);
		tDay = cal.get(Calendar.DATE);
		
		int tMD = tMonth*100+tDay;
		int bMonth, bday;
		int bMD = Integer.parseInt (rrn.substring(2, 6));
		bMonth = Integer.parseInt (rrn.substring(2, 4));
		bday =Integer.parseInt (rrn.substring(4, 6));
		
		if ( tMD < bMD) {
			amrAge--;
		}
		return amrAge;
	}




	private static String getBday(String rrn) {
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

	private static String getGender(String rrn) {
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
