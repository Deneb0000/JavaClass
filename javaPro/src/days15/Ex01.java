package days15;

import days14.Employee;

public class Ex01 {

	public static void main(String[] args) {
		/*
		Employee emp3 = new SalseMan(
				"김준석", "경기도 남양주",
				"010-9837-2342", "2021.03.12",
				500000,
				20, 70000);
		emp3. dispEmpInfo();	//****다 호출된다
		*/

		Employee emp4 = new Temp(
				"김재민", "서울 목동",
				"010-2319-3422", "2020.01.01",
				20, 250000);
		emp4. dispEmpInfo();
		
	}//main

}//class
