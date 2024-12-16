package days13;

//저축클래스

public class Save {
	//field
	//인스턴스 변수
	private String name; // 예금주
	private long money; //예금액	┌명시적 초기화	
	private static double rate=0.04; //이자율
				//ㄴ 클래스당 하나씩 만들어진다	/클래스변수, 공유(shared)변수, static(정적)변수
	//constructor
	public Save() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Save(String name, long money, double rate) {
		//		super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	//getter , setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}


	//method	-	static이 안부터있으면 인스턴스메서드
	//정적(static) 매서드
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	public void dispSave() {
		System.out.printf(">예금주:%s, 예금액:%d, 이자율 :%.2f\n",this.name, this.money, this.rate);
	}



}//save
