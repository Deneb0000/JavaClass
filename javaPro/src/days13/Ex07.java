package days13;

/**
 * @author dnb
 * @date 2024. 7. 17. - 오후 2:38:06
 * @subject		this 키워드 (예약어) 
 * @content	1.정의?	클래스 자기 자신의 주소값을 갖는 참조변수
 * 	Tv t1 = new Tv(); //변수, 참조 변수, 객체
 * 	Tv t2 = new Tv(); //변수, 참조 변수, 객체
 *	Tv [this]; 	/
 *	[power][channel][color]XX[0x100]		[0x100]t1
 *	0x100								 this참조변수
 *	[power][channel][color]XX[0x200]		[0x200]t1
 *	0x200								 
 *
 *2. this의 3가지 용도
	 *ㄱ. 멤버 (클래스의 구성요소)	= 필드, 메서드 (생성자,getter, setter)
			를 가르키는 때의 this용도
	 *ㄴ. 생성자에서 또 다른 생성자를 호출할 때의 this 용도
	 *ㄷ.	리턴값, 매개변수값으로 사용되는 this 용도
 */
public class Ex07 {

	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		p1.plusPoint(100).disPoint();
		//Cannot use this in a static context : static 안에서는 this를 사용하지 못한다
//		p1.thisTest(this);
		
		
		Member m1  = new Member("홍길동", "목동");
		System.out.println(m1.getName()+"/"+m1.getAddr());

		Member m2  = new Member();	
		System.out.println(m2.getName()+"/"+m2.getAddr());
	}	//main

}	//class

class Member{
	
	//field
	private String name;
	private String addr;
	
	
	//constructor
	public Member() {
//		super();
		this("익명", "미정");	//생성자에서 또 다른 생성자를 호출할 때의 this 용도
		//다른코딩보다 제일 윗 라인에 있어야한다
	}
	
	public Member(String name, String addr) {	//멤버를 가르킬때의 용도
		this.name = name;
		this.addr = addr;
		
		this.getAddr();
	}
	
	//getter , setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
