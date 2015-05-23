package modello;

public class MineException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public MineException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
