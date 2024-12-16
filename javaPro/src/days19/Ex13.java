package days19;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오후 5:10:07
 * @subject
 * @content
 *
 */
public class Ex13 {

	public static void main(String[] args) {
		//		┌읽어올 문자	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = '0'; i <= 'z'; i++) {
			if(Character.isDigit(i) || Character.isAlphabetic(i)) {
				hm.put((char)i, 0);				
			} //if
		}

		String fileName = "Ex01.java";
		String dir = "user.dir";
	      String userDir = System.getProperty(dir);      
	      String path = String.format("%s\\src\\days19\\%s", userDir, fileName);
		
	      try (FileReader reader = new FileReader(path)) {
	    	  int code;
	    	  char one;
	    	  while ((code = reader.read()) != -1) {
	    		  one =(char) code;
	    		  
	    		  if( hm. containsKey(one)) {
	    			  int count =  hm.get(one);
	    			  hm.put(one, count+1);
	    		  }
	    	  }
	      } catch (Exception e) {
	    	  // TODO: handle exception
	      }
	      
		//출력
		Set<Entry<Character, Integer>> es = hm.entrySet();
		Iterator<Entry<Character, Integer>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) ir
					.next();
			System.out.printf("'%c'=%d\t%s\n", entry.getKey(), entry.getValue(),"#".repeat(entry.getValue()));
		}
		
	} //main

} // class
