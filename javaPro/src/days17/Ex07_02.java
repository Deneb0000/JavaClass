package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 3:07:46
 * @subject	정규표현식2
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		//정규표현식
		String source = "HP:010-1234-5678, HOME:02-999-0099";
		String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(source);
		
//		matches()
		int no = 1;
		while (m.find()){//일치하는걸 찾았니?
			System.out.printf("%d : %s \t %s \t %s \t %s\n",
					no++, m.group(), m.group(1), m.group(2), m.group(3));
		}
		
	}

}
