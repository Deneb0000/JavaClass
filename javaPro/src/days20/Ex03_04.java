package days20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오전 11:42:43
 * @subject
 * @content	환경설정값을 가져오다
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		/*
		//C:\E\Class\SS21Class\Workspace\JavaClass\javaPro
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		 */
		
		Properties p = System.getProperties();
		Set<Object> ks = p.keySet();
		Iterator<Object> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n",key,value);
		}


	} //main

} //class
