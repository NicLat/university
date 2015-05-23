package modello;

/**
 * Generatore di partite che fornisce una partita secondo le caratteristiche prestabilite, 
 * è dietro un'interfaccia perchè potrebbe essere sostituito con un'implementazione migliore
 * in vista di inserimento di parole vere
 * @author esame_16
 */
public interface IGeneraCampo {
	
	/**
	 * Genera una partita
	 * @return Partita generata
	 */
	public char[][] generaCampo(int lato, int vocaliMinime);

}
