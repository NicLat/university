package model;


/** 
 * @author NL
 */
public class TimeFormat {

	long time;

	/**
	 * 
	 * @param time Riceve un tempo in nanosecondi
	 */
	public TimeFormat(long time) {
		super();
		this.time = time;
	}

	/**
	 * 
	 * @return Tempo in millisecondi con 3 decimali minimo
	 */
	public double getTimeDouble() {
		return ((double)time)/1000000;
	}
	
	/**
	 * 
	 * @return Stringa con tempo formattato in millisecondi e almeno 3 cifre decimali
	 */
	public String getTimeFormatted(){
		return String.format( "%f",((double)time)/1000000) + " ms";
	}
	
	
}
