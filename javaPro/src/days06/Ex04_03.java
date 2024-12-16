package days06;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * @author dnb
 * @date 2024. 7. 8. - 오후 12:18:55
 * @subject
 * @content
 *
 */
public class Ex04_03 {

	public static void main(String[] args) {
	    // 1~100 임의의 정수 10개 중에 max , min
	      int [] m = new int[10];
	      for (int i = 0; i < m.length; i++) {
	         m[i] = (int)( Math.random()*100 )+1;
	      }
	      
	      // 배열의 값을 출력. 	'	Arrays 클래스 . toStrting()	'
	      // " [69, 25, 2, 77, 64, 9, 25, 81, 45, 4]	"
	      System.out.println(Arrays.toString(m));
	     
	      /*
	      max = Math.max(max, m[1]);			i=1
	      max = Math.max(max, m[2]);		
	      max = Math.max(max, m[3]);	
	      			:
	      max = Math.max(max, m[9]);			i=9
	      */
	      int max = m[0], min =m[0];
	      for (int i = 1; i < m.length; i++) {
	    	  max = Math.max(max, m[i]);
	    	  min = Math.min(min, m[i]);
		}
	      
	      System.out.printf("max=%d, min=%d\n", max, min);

	}	// main

}	//class
