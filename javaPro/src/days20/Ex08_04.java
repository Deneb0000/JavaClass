package days20;

import java.util.ArrayList;

/**
 * @author dnb
 * @date 2024. 7. 26. - 오후 3:20:00
 * @subject	제네릭 클래스의 객체 생성과 사용
 * @content
 *
 */
//public class Ex08_04 {
//
//	public static void main(String[] args) {
//		// 제네릭 클래스의 객체 생성과 사용
//		Box3<Fruit> fruitBox = new Box3<>();
//		Box3<Apple> appleBox = new Box3<>();
//		Box3<Grape> grapeBox = new Box3<>();
//		Box3<Toy> toyBox = new Box3<>();
//		
//		//Type mismatch: cannot convert from Box3<Grape> to Box3<Apple>
//		//타입이 일치하지않는다
////		Box3<Apple> box1 = new Box3<Grape>();
////		Box3<Fruit> box1 = new Box3<Grape>();	업캐스팅이 안된다....
//		
////		fruitBox.add(Fruit item);
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
//		
////		fruitBox.add(new Toy()); //전혀 상속관계가 없다 안되는것이 당연하다
//		
//		
//	} //main
//
//} //class Ex08_04
//
////과일
//class Fruit extends Object{
//	public String toString() {
//		return "Fruit";
//	}
//}
////과일<-사과
//class Apple extends Fruit{
//	public String toString() {
//		return "Apple";
//	}   
//}
////과일<-포도
//class Grape extends Fruit{
//	public String toString() {
//		return "Grape";
//	}   
//}
////장난감
//class Toy{
//	public String toString() {
//		return "Toy";
//	}   
//}
//
//class Box3 <T> { //T의 Box3 제네릭 클래스
//	ArrayList<T> list = new ArrayList<T>();
//	
//	void add(T item) {  this.list.add(item); }
//	
//	int size() { return this.list.size(); }
//	
//	T get(int i) { return this.list.get(i); }
//	public String toString() { return  this.list.toString();  }  
//}
