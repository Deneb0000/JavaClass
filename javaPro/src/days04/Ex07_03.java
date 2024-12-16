package days04;

/**
 * @author dnb
 * @date 2024. 7. 4. - 오후 2:22:26
 * @subject		[제어문]
 * @content		1) 조건문	:	if문
 *						***2) 분기문	:	switch문
 *						3) 반복문	:	for문,		foreach문
 *						4) 조건반복문	:	while문, do-while문
 *						5) 기타	: break문, continue문
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
//		int n = 10;
//		
//		switch (n %5 /*변수, 수식*/) {
//		case/*필요한만큼 만들어도된다*/ 0:
//			System.out.println("짝수 (even number)");
//			break;
//			
//		case 1:
//			System.out.println("홀수 (odd number)");
//		default/*생략가능*/:
//			break;
//		}		//switch

		int n = 10;
		 String result = null;
		
		switch (n %5 /*변수, 수식*/) {
		case/*필요한만큼 만들어도된다*/ 0:
			result = "짝수 (even number)";
			break;
			
		case 1:
			result = "홀수 (odd number)";
//		default/*생략가능*/:
			break;
		}		//switch
	
		//The local variable result may not have been initialized : 지역변수의 초기화가 필요하다
		System.err.println(result);		// 상단 String result = null; 추가해주기

	}	//main

}	//class
