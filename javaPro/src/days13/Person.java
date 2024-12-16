package days13;

public class Person {
	
	//field
	private String name = "익명";
	private int age = 20;
	private boolean gender = false;
	
	//생성자
	public Person() {} //디폴트 생성자
	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
				
	}
	
	public Person(String n) {
		name = n;
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	//method
	public void dispPerson() {
		System.out.printf(">이름 : %s, 나이 :%d\n",name,age);
	}
	
	//getter(값을 얻어옴), setter(값을설정)	private에 접근하는 
	public void setAge(int _age){	//setter		//getter을 만들지않으면 쓰기전용
		if(0<=_age && _age <=150) {
		age = _age;
	}else {
		throw new NullPointerException();	//에러를 출력하는 명령
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {	//getter		//setter을 만들지않으면 읽기전용
		return age;
	}
	
}	//Person
