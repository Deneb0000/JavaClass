package days15;

import days14.Regular;

//영업직사원클래스
public final class SalseMan	extends Regular {
//			ㄴ더 이상 자식 클래스를 가질 수 없는 최종(마지막) 클래스
	
	//E-n,a,t,h dei()
	//R-p, gp()
	
	private int salse; //판매량
	private int comm; //커미션
	
	public SalseMan() {
		super();
		System.out.println(">SalseMan 디폴트 생성자 호출됨.");
	}

	public SalseMan(String name, String addr, String tel, String hiredate, 
			int basePay, int salse, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.salse = salse;
		this.comm = comm;
		System.out.println(">SalseMan 7 생성자 호출됨.");
	}

	@Override
	public int getPay() {
		return super.getPay() + this.salse * this.comm;
	}


	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n, 기본급:%d"+",판매량:%d, 커미션:%d\n"
				,this.getName(),this.getAddr(), this.getTel(), this.getHiredate(),this.getPay(),this.salse,this.comm);

	}
	
}//class SalseMan
