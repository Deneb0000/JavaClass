package days17;

/**
 * @author dnb
 * @date 2024. 7. 23. - 오후 12:14:25
 * @subject
//java.lang.Math 클래스
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		//java.lang.Math 클래스
//		Math + 모든 멤버들(필드,메서드) : static
		//클래스명.멤버명
		System.out.println(Math.random());//임의의값(랜덤
		System.out.println(Math.pow(2,3));//2의3
		System.out.println(Math.max(2,3));//큰값
		//작은값
		//절대값
		
		//파이값
		//지수 값
		
		//암기****
		//올림 == 절상 double : 소숫점 첫 번째 자리에서 절상
		System.out.println(Math.ceil(2.0)); //올림
		System.out.println(Math.ceil(2.178)); //올림
		System.out.println(Math.ceil(2.578)); //올림
		System.out.println(Math.ceil(2.978)); //올림
		
		//반올림		ind		
		System.out.println(Math.round(2.0)); 
		System.out.println(Math.round(2.178)); 
		System.out.println(Math.round(2.578)); 
		System.out.println(Math.round(2.978)); 

		//내림==절삭		double		
		System.out.println(Math.floor(2.0)); 
		System.out.println(Math.floor(2.178)); 
		System.out.println(Math.floor(2.578)); 
		System.out.println(Math.floor(2.978)); 
                                
	} //main

} //class
