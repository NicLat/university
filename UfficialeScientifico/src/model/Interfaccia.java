package model;
import files.*;

public class Interfaccia {
	
	ArchivioPianeti archivio;

	public Interfaccia(ArchivioPianeti archivio) {
		super();
		this.archivio = new ArchivioPianeti();
	}
	
	public void addPianeta(String nome){
		ILeggiPianeta sensori = new CaricaPianetaFile(new Interprete());
		Pianeta p = sensori.leggiPianeta(nome+".txt");		
		archivio.addPianeta(nome, p);
	}
	
	public void stampaPianetiAffini(String nome){
		ArchivioPianeti affini;
		affini = archivio.cercaPianetiAffini(nome);
		affini.stampaElenco();		
	}
	
	public void stampaPianeti(){
		archivio.stampaElenco();
	}
	
}
