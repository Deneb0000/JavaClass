package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days12.Student;

/**
 * @author dnb
 * @date 2024. 7. 17. - 오전 9:51:47
 * @subject		3반 30명 성적처리
 * @content		클래스 배열
 *
 */
public class Ex01 {                                                         

	public static void main(String[] args) throws IOException {             
		final int CLASS_COUNT = 3;		//행                                 
		final int STUDENT_COUNT = 30;	//열          
		
		Student[][] student = new Student [CLASS_COUNT] [STUDENT_COUNT];         

		int [] counts = new int [CLASS_COUNT];                              
		//0 - 1반학생수 / 1 - 2반학생수 / 2 - 3반학생수                                 
		char con = 'y';                                                     

		String name;                                                        
		int kor, eng, mat, tot, rank, wrank;                                
		double avg;                                                         

		Scanner scanner = new Scanner(System.in);                           
		int cIdx; // 1, 2, 3반                                                

		do {                                                                
			//1.반입력                                                         
			System.out.printf(">반 입력?");                                    
			cIdx = scanner. nextInt()-1;                                       

			//2. 그 반의 학생 정보 입력?												
			System.out.printf(">%d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력?", cIdx+1, counts[cIdx]+1);

			name = getName();                            
			kor = getScore();                          
			eng =getScore();                           
			mat = getScore();                           
			tot = kor + eng + mat;                                          
			avg = (double) tot /3 ;                                         
			wrank = rank = 1;                                               

			student[cIdx][counts[cIdx]] = new Student();
			student[cIdx][counts[cIdx]].name = name;                  
			student[cIdx][counts[cIdx]].kor = kor;                           
			student[cIdx][counts[cIdx]].eng   = eng;                           
			student[cIdx][counts[cIdx]].mat   = mat;                           
			student[cIdx][counts[cIdx]].tot   = tot;                           
			student[cIdx][counts[cIdx]].rank  = rank;                          
			student[cIdx][counts[cIdx]].wrank = wrank;                         
			student[cIdx][counts[cIdx]].avg = avg;                               

			counts[cIdx]++;                                                

			System.out.print("> 입력 계속?");                                   
			con = (char) System.in.read();                                  
			System.in.skip(System.in.available()); //공백지움                   
		} while (Character.toUpperCase(con) == 'Y');                        

		//반, 전 등수 처리 start
		for (int i = 0; i <= counts.length; i++) {	//전교생 모두 데려와
			for (int j = 0; j < counts[i/*입력받은 학생수*/]; j++) {
				//				student[i][j].tot	//성적처리를 할 학생의 총점

				for (int i2 = 0; i <= counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j++) {
						if(student[i][j] .tot < student[i2][j2].tot) {
							student[i][j].wrank++;
							if (i==i2) {
								student[i][j].rank++;
							}
						}//if
					}
				}//for j
			}
		}//for j
			
			
		//반, 전 등수 처리 End
		int 총학생수 = IntStream.of(counts).sum();                              
		System.out.printf("\t\t 학생 정보 출력 (%d명) \n",총학생수);                   
		for (int i = 0; i < counts.length; i++) {                           
			System.out.printf("[%d번 학생 : %d] \n", i+1, counts[i]);          
			for (int j = 0; j < counts[i]; j++) {                           
				System.out.printf("[%d]", j+1);              
				student[i][j].dispInfo();//i : 반  / j:이름
			}                                                               
		}//for i                                                            

	}	//main                                                              

	public static int getScore(){                                           
		return (int) (Math.random()*101); //0~100 점수 출력                     
	}                                                                       
	public static String getName() {                                        
		//성 128개                                                            
		Random rnd = new Random();                                          
		String [] lastNames = {"김","이","박","최","권","홍"};                    
		int index = rnd.nextInt(lastNames.length);                          
		String name = lastNames[index];                                     

		//이름 : 2문자                                                          
		char [] firstNames = new char[2];                                   
		for (int i = 0; i < firstNames.length; i++) {                       
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) +'가');           
		}                                                                   
		// char[] -> String;                                                
		String firstName = String.valueOf(firstNames);                      

		name += firstName;                                                  

		return name;                                                        
	}//getname;                                                             

}	//class                                                                 
