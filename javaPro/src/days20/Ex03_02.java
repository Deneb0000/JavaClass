package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오전 10:45:51
 * @subject Properties 컬렉션 클래스 예제
 * @content	1. key value로 저장하는 Map 계열
 * 			2. 환경설정 값을 쓰기 기 저장한
 * 			3. setProperty() / getProperty() => p
 * 			4. 파일(properties) 저장
 * 				p.store (FileWrite, 주석문)
 * 			>	p.storeToXML (FileOutputSteam, 주석문)
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		/*
		 * Map : HT, HM, TM, SM, Properties 컬렉션클래스
		 * 1. Hashtable<String, String> == Properties
		 * 2. key + value = entry
		 * 3. 환경 설정값들을 파일로 쓰기(저장)/읽기
		 * 						put()/get()
		 * 			  setProperties()/getProperties()	
		 * 4. 저장되는 파일확장자	.properties
		 * 	  store(), storToXML() 저장하기위해서는 string 
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
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.xml";
		//파일읽을때 FileReader, BufferedReader
		//파일을 쓸때 FileWriter
		try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
			p.storeToXML(outputStream, "jdbc config sample");
			System.out.println("SAVE END");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //main

} // class
