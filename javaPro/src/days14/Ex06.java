package days14;

import days12.Tv;

public class Ex06 {

	public static void main(String[] args) {
		// days12 Tv + 상속 => 자막 기능 새로운 Tv 작성
		CaptionTv ctv = new CaptionTv();
		ctv.power();
		
		ctv.channelUp();
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		ctv.caption = true;
		ctv.dispCaption("Hello World~");
		ctv.dispCaption("Hi~");
	
		ctv.power();
		System.out.println("end");
		
	}//main

}//class

class CaptionTv extends Tv{
	
	boolean caption = false; // 자막 기능 ON(true)/OFF(false)
	void dispCaption(String message) {
		if (caption) {
			System.out.println(message);
		}	//if
	}//do
	
}