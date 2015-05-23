package dispositivi;

/**
 * 
 * @author nicola
 * Eccezione per notificare un errore nel dispositivo
 */
public class ErroreDispositivo extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;

	public ErroreDispositivo(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
