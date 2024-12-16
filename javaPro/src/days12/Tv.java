package days12;

public class Tv {
	
	//멤버 (구성요소)
	// ㄴ멤버변수(필드)	- 속성(특징)property
	//	 ㄴ[접] [기] 자료형 필드명 [= 초기값];
	//지역변수는 초기화하지 않으면 사용할 수 없다.
	//멤버변수는 초기화하지 않아도 사용할 수 있다. 
	public boolean power ;
	public int channel = 1;
	public String color = null;
	
	//멤버함수 == 메서드(method) == 동작(기능)
	public void power() {
		power = !power; //켜져있으면 끄고 꺼져있으면 키는
	}
	
	public void channelUp() {
		channel ++;
	}

	public void channelDown() {
		channel --;
	}
}//tv
