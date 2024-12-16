package days08;

public class Ex01 {

	public static void main(String[] args) {
		
		int lottoNumber;            
		int [] lotto = new int[6];  
		
		
		fillLotto(lotto); 
 		dispLotto(lotto); 

	} //main
	
	public static void fillLotto(int[] lotto) {        
		int lottoNumber; 
		lotto[0] = (int) (Math.random() *45)+1; 
		// [23] [0] [0] [0] [0] [0] 
		//			 ↑
		int index = 1;
		boolean isDuplicate = false;
		while (index <=5) {
			isDuplicate = false; //다시 초기화하는 작업이 빠져있었음
			lottoNumber =  (int) (Math.random() *45)+1;
			//중복체크를 한 수에 중복되지 x
			System.out.println(lottoNumber);
			for (int i = 0; i < index; i++) {
				if(lotto[i] == lottoNumber) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate ) lotto[index++] = lottoNumber;
		}	//while
		/*for (int i = 0; i < lotto.length ; i++) {    
			lottoNumber =  (int) (Math.random() *45)+1;
			lotto[i] = lottoNumber;                    
		}*/                                            
		                                               
	}                                                  
                                                       
	public static void dispLotto(int[] lotto) {        
		for (int i = 0; i <lotto.length; i++) {        
			System.out.printf("[%d]", lotto[i]);       
		}                                              
		System.out.println();     
		
	}	
}//class
