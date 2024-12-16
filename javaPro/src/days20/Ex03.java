package days20;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오전 10:45:51
 * @subject	pro~ 파일생성하기
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Map : HT, HM, TM, SM, Properties 컬렉션클래스
		 * 1. Hashtable<String, String> == Properties
		 * 2. key + value = entry
		 * 3. 환경 설정값들을 파일로 쓰기(저장)/읽기
		 * 						put()/get()
		 * 			  setProperties()/getProperties()	
		 * 4. 저장되는 파일확장자	.properties
		 * 	  store(), storToXML()
		 * 	  load() <읽어오는 작업
		 * 
		 * */ 

		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";	//환경설정값
		//환경설정값을 파일에 저장하고싶어 - store()로 저장하는 작업
		
		Properties p = new Properties();
		p.setProperty("className"/*키값*/, "oracle.jdbc.driver.OracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger");
		//				키값			밸류값
		//									파일이름
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		//파일읽을때 FileReader, BufferedReader
		//파일을 쓸때 FileWriter
		try (FileWriter writer = new FileWriter(fileName)) {
//			p.store(write, "jdbc config sample");
			//저장한다 이 파일에
			
			p.store(writer, "jdbc config samle");
			System.out.println("SAVE END");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //main

} // class
