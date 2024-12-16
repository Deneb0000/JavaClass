package days02;


/**
 * @author dnb
 * @date 2024. 7. 2. - 오후 3:24:07
 * @subject		논리형(boolean) [1bite] - trye / falsa
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		// 남자,	 여자 성별을 나타내는 변수 선언				//		m="남자";	f="여자";?
		// true 	false
		// 	 1		  0			byte short int long
		//"male" "female"			String
		// 'm'	'f'		char
		boolean gender; 	
		gender = true;
		
		System.out.printf("성별=%B\n", gender);
		//%[argument_index$][flags][width][.precision]conversion
		{
		int x= 10;
//		System.out.printf("%d %o %x\n", x, x, x); 
		System.out.printf("%1$d %1$o %1x\n", x); 
		System.out.printf("%d\n",x); //10진수
		System.out.printf("%o\n",x); //8진수 악토어쩌구의o
//		System.out.printf("%x %X\n",x,x ); //16진수 헥사곤의 x
		System.out.printf("%1$x %1$X\n",x ); //%[argument_index$]
		}
		
	}

}
