package modello;

import java.util.Observable;


public class Campo extends Observable{
	
	private static Campo istanzaCampo = new Campo();
	private Campo(){
		super();
	}
	public static Campo getIstanzaCampo(){
		return istanzaCampo;
	}
	
	
	private Casella[][] caselle;
	private int righe,colonne,mine;
	private boolean finita;
	
	public void setup(int righe, int colonne, int mine){
		
		caselle = new Casella[righe][colonne];
		this.righe = righe;
		this.colonne = colonne;
		if(mine > righe*colonne)
			mine = righe*colonne;
		this.mine = mine;
		this.setFinita(false);
		
		Utility.inizializzaCampo(caselle);
		Utility.piazzaMine(getIstanzaCampo(), mine);
		Utility.contaVicinanze(getIstanzaCampo());

		setChanged();
		notifyObservers();
	}
	
	
	
	public void setCasellaIJ(int i, int j, char set) throws MineException{
		if(set == 'P'){
			if(getCasellaIJ(i, j).getStato() == 'D')
				getCasellaIJ(i, j).setStato('P');		// mette bandierina
			else if(getCasellaIJ(i, j).getStato() == 'P')
				getCasellaIJ(i, j).setStato('D');		// toglie bandierina
			
			setChanged();
			notifyObservers();
		}else if(set == 'F'){
			if(getCasellaIJ(i, j) != null)		
				liberaCasella(i,j);						// prova a liberare
		}
		
		if(Utility.vinto(getIstanzaCampo()))
			throw new MineException("Hai vinto!");
	}
	
	
	private void liberaCasella(int i, int j) throws MineException{
		
		if(getCasellaIJ(i, j).getStato() == 'D'){
			
			getCasellaIJ(i, j).setStato('F');
			//System.out.println("libero casella "+i+","+j);
			setChanged();
			notifyObservers();
			
			if(getCasellaIJ(i, j).getContenuto() == 'M'){
				setFinita(true);
				throw new MineException("CA BOOOOM!");
			}else if(getCasellaIJ(i, j).getContenuto() == '-'){
				// chiamata ricorsiva della libera casella tutto attorno
				if(getCasellaIJ(i-1, j-1) != null) liberaCasella(i-1, j-1);
				if(getCasellaIJ(i-1, j) != null) liberaCasella(i-1, j);
				if(getCasellaIJ(i-1, j+1) != null) liberaCasella(i-1, j+1);
				if(getCasellaIJ(i, j-1) != null) liberaCasella(i, j-1);
				if(getCasellaIJ(i, j+1) != null) liberaCasella(i, j+1);
				if(getCasellaIJ(i+1, j-1) != null) liberaCasella(i+1, j-1);
				if(getCasellaIJ(i+1, j) != null) liberaCasella(i+1, j);
				if(getCasellaIJ(i+1, j+1) != null) liberaCasella(i+1, j+1);
			}
		}
	}
	
	
	public char getCarattereVista(int i, int j){
		char stampa = ' ';
		if(getCasellaIJ(i, j).getStato() == 'F')
			stampa = getCasellaIJ(i, j).getContenuto();
		else if(getCasellaIJ(i, j).getStato() == 'P')
			stampa = 'P';
		return stampa;
	}
	
	
	public int getRighe() {
		return righe;
	}
	public int getColonne() {
		return colonne;
	}
	public int getMine() {
		return mine;
	}
	public Casella getCasellaIJ(int i, int j){
		if(i > caselle.length-1 || i < 0)
			return null;
		if(j > caselle[i].length-1 || j < 0)
			return null;
		return caselle[i][j];
	}
	public boolean isFinita() {
		return finita;
	}
	public void setFinita(boolean finita) {
		this.finita = finita;
	}

}

