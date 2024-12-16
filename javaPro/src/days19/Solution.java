package days19;

class Solution {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;
		int c = solution(a, b);
		System.out.println(c);
	}


	    public static int solution(int num1, int num2) {
	    	int answer = (num1/num2)*1000;
	        return answer;
	    }

}//Solution