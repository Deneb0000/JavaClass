package days22;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author dnb
 * @date 2024. 7. 30. - 오후 12:23:30
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// [직렬화 (Serialization)]: 객체를 스트림으로 만드는 것
		// 								 ㄴ데이터를 송수신하기 위한것
		// [역직렬화 (descrialization)]
		//  스트림 -> 객체로 만드는 것
		
		// 객체를 직렬화 / 역직렬화 할 수 있는 "바이트 스트림" 
		// ObjectInputStream
		// ObjectOutputStream
		
		// 사람(사용자) 정보를 송/수신
		// 사람의 정보는 이름, 주소, 나이 등등
		// String info = "홍길동/서울/23/등등" 하나의 문자열을 구분자로 연결하고 주고 받을수 있다
		// 	ㄴ단점 : 자르고 형변환을 해야한다
		
		//->User.java
		User u1 = new User("이시훈","1234",25);
		User u2 = new User("원충희","4321",29);
	
		ArrayList<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		//u1, u2, list 객체를 직렬화 -> 파일 쓰기(저장)
		String name = ".\\src\\days22\\user.ser";
		try (FileOutputStream fos = new FileOutputStream(name);
			ObjectOutput oos = new ObjectOutputStream(fos);){ //보조스트림
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			System.out.println(">u1,u2,list 객체를 직렬화 시켜서 oos 파일로 저장완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		//java.io.NotSerializableException //클래스가 직렬화되어있지않았다 
		
	} //main

} //class Ex03
