package days16;

public class ScoreOutVBoundException extends RuntimeException{

	private static final long serialVersionUID = -4929489435649130159L;   
	
	//예외 코드 번호 : 필드
	//unchecked 예외
	private final int ERROR_CODE ; 
	
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutVBoundException (String message) {
		this(1000,message);
	}
	
	public ScoreOutVBoundException (int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code;
	}
}
