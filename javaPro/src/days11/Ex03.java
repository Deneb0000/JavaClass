package days11;

/**
 * @author dnb
 * @date 2024. 7. 15. - 오후 4:14:37
 * @subject	배열의 위치값
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		int  n = 71;
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 71, 37 };
//배열속에 71 을 찾을려고 한다
//		int index = indexOf(m,n); //m이라는 배열속에 n을 찾겠다
		int index, beginIndex = 0;
		while ((index = indexOf(m,n,beginIndex)) != -1) {	//-1이 나왔다는건 끝까지 돌았다.
			System.out.println(index);
			beginIndex = index+1;
		}
		System.out.println(index);	//위치값을 알려준다
		
		//문제)	m 배열에서 n을 찾아서
		//	모든 index 값을 출력
		
	} //main
	private static int indexOf(int[] m, int n, int beginIndex) {	//찾을위치
		for (int i = beginIndex ; i < m.length; i++) {
			if(m[i]==n)	return i;
		}
		return -1;
	}

	private static int indexOf(int[] m, int n) {
		for (int i = 0; i < m.length; i++) {
			if(m[i]==n)	return i;
		}
		return -1;
	}

}	//class
