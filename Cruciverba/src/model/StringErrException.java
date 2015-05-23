package model;

public class StringErrException extends Exception{

	private static final long serialVersionUID = 1L;

	String e;
	
	public StringErrException(String e) {
		super(e);
		this.e = e;
	}
	
}
