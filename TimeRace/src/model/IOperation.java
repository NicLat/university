package model;
/**
 * 
 * @author NL
 *
 */
public interface IOperation {
	
	/**
	 * 
	 * @param n	Numero di elementi su cui effettuare l'operazione
	 * @return	Tempo in nanosecondi per lo svolgimento
	 */
	public long timeOperation(int n);

}
