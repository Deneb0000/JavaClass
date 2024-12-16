package days15;

/**
 * @author dnb
 * @date 2024. 7. 19. - 오후 12:30:49
 * @subject		[싱글톤(singleton)]	여러 차례 호출되더라도 실제로 생성되는 객체
 * @content		
 *
 */
public class Ex05 {

	public static void main(String[]args) {
		
		//The constructor BoardDAO() is not visible	호출못한다
//		BoardDAO dao = new BoardDAO();
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.insert();

		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.update();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.select();
						
	}	//main
	
}	//class

//DB 연결 + CRUD
//DAO = Data Access Object
class BoardDAO{
	
	private static BoardDAO boardDAO =null;
	
	//1. private로 꼭 생성자 만들기
	private BoardDAO(){}
	//synchronized 동기화(잠금) 처리
	public synchronized static BoardDAO getInstance() {
//		return new BoardDAO();
		if (boardDAO == null) {	//같은클래스안이라서 걸린다
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}	
	
	public void insert() {
		System.out.println("DB 추가");
	}
	public void select() {
		System.out.println("DB 조회");
	}
	public void delete() {
		System.out.println("DB 삭제");
	}
	public void update() {
		System.out.println("DB 수정");
	}
	
}

