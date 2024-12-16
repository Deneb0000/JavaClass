package days12;

public class Student {
	//필드 선언
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	//학생 정보를 출력해주는 메서드
	public void dispInfo() {
		System.out.printf("%s\t %d\t %d\t %d\t %d\t\t %.2f\t %d\n"
				,name,kor,eng,mat,tot,avg,rank, wrank);
		
	}//dispInfo\

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", rank="
				+ rank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}
	
	
}	//class


