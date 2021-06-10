package exception;

public class DuplicateException extends Exception {
	
	public DuplicateException() {
		super("데이터 검색 예외");
	}
	
	public DuplicateException(String message) {
		super("데이터 검색 예외 : " + message);
	}

}
