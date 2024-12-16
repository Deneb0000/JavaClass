package days12;

public class Student2 {
	//필드 선언
	public String name;
	public Student2(String name, int kor, int eng, int mat, int tot, int rank, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
	}

	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	//학생 정보를 출력해주는 메서드
	public void dispInfo() {
		System.out.printf("%s\t %d\t %d\t %d\t %d\t\t %.2f\t %d\n"
				,name,kor,eng,mat,tot,avg,rank, wrank);
		
	}//dispInfo

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", rank="
				+ rank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}
	
	
}	//class
