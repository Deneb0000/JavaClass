package days19;

/**
 * @author dnb
 * @date 2024. 7. 25. - 오전 11:45:37
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// [LinkedList] 컬렉션 클래스
		//	link 사슬(고리) 연결된	+List		
		//	단방향 링크리스트	
		// 	양방향 링크리스트 + 환형

		//1) 배열 : 읽기 성능 가장 빠르다.
		//		  배열 크지x 삽입, 삭제 무지 속도 느리다.
		//2) 링크드리스트 : 비연속적으로 삽입, 삭제 할때 성능이 빠르다
		Node node1 = new Node();
		node1.value = 10;

		Node node2 = new Node();
		node2.value = 20;

		node1.next = node2; // next의 필드에 node2를 준다 (연결한다)

		Node node3 = new Node();
		node3.value = 30;

		node2.next = node3;

		Node node4 = new Node();
		node4.value = 40;

		node3.next = node4;

		Node node5 = new Node();
		node5.value = 50;

		node4.next = node5;
		//node5.next = null;

		//node1 시작노드로 부터 모든 노드의 value 출력
		Node node = node1;

		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}


	} //main


} //class

class Node{
	int value; // 값
	
	//다음 노드의 주소
	Node next = null; //단방향
	Node prev = null; //양방향
	
}