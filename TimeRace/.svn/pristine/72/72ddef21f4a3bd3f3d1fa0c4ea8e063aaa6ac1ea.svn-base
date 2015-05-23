package model;

import java.util.ArrayList;

import ui.NException;
/**
 * 
 * @author NL
 * 
 */
public class Comparator {
	
	private ArrayList<IOperation> operations;
	private int n;
	
	/**
	 * 
	 * @param n Imposta il numero di elementi su cui effettuare l'operazione
	 */
	public Comparator() {
		super();
		this.operations = new ArrayList<IOperation>();
		this.n = 100;
	}
	
	/**
	 * 
	 * @param op Aggiunge un operazione al confronto
	 */
	public void addOperator(IOperation op){
		operations.add(op);
	}

	/**
	 * 
	 * @return Vettore di tempi dell'esecuzione delle operazioni
	 */
	public ArrayList<TimeFormat> execute(){
		ArrayList<TimeFormat> times = new ArrayList<TimeFormat>();
		
		for (IOperation op : operations) {
			times.add(new TimeFormat(op.timeOperation(n)));
		}
		return times;
	}

	/**
	 * 
	 * @param n Setta il numero di elementi
	 * @throws NException Eccezione sul numero di elementi
	 */
	public void setN(int n) throws NException {
		if (n < 1 || n > 100000)
			throw new NException("Il numero elementi deve essere compreso tra 1 nessuno 100000");
		this.n = n;
	}
	
	/**
	 * Svuota il vettore operatori
	 */
	public void emptyOperators(){
		operations.clear();
	}
	
	
	

}
