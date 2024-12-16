package days08;

public class Ex01_02 {

	public static void main(String[] args) {
		 
		int [] lotto = new int[6];  
		
		fillLotto(lotto); 
 		dispLotto(lotto); 

	} //main
	
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
}//class
