package days20;

import java.util.ArrayList;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 3:29:50
 * @subject	 [제한된 제네릭 클래스]
 * @content
 *
 */
public class Ex08_05 {

	public static void main(String[] args) {
		/*
		 * [제한된 제네릭 클래스]
		 * Box<T> 
		 * <T extends Fruit> 의미이해
		 * <T extends Fruit & eatable> 의미 이해
		 * */

//		Box4<Toy> toybox = new Box4<>();	//class Box4 < T extends Fruit>
//		Box4<빵> 빵box = new Box4<>();		//때문에 빵과 Toy는 에러가 뜬다
//		Box4<Apple> applebox = new Box4<>();
//		Box4<Grape> grapebox = new Box4<>();
		
		
	} // main

} //class Ex08_05 

//제한된 제네릭 클래스
//class Box4<T>{
//class Box4 < T extends Fruit >{ // 과일에서 물러받은 타입만
//class Box4 < T extends Fruit & eatable >{ // 먹을수 있는 과일 타입만 받는다
//	
//	ArrayList<T> list = new ArrayList<T>();
//	
//	void add(T item) {  this.list.add(item); }
//	
//	int size() { return this.list.size(); }
//	
//	T get(int i) { return this.list.get(i); }
//	public String toString() { return  this.list.toString();  } 
//}
//
////먹을수 있는 음식..
//interface eatable{
//	//
//}
//
//class 빵 implements eatable {
//	//
//}
//
////과일
//class Fruit extends Object implements eatable {
//public String toString() {
//	return "Fruit";
//}
//}
////과일<-사과
//class Apple extends Fruit{
//public String toString() {
//	return "Apple";
//}   
//}
////과일<-포도
//class Grape extends Fruit{
//public String toString() {
//	return "Grape";
//}   
//}
////장난감
//class Toy{
//public String toString() {
//	return "Toy";
//}   
//}