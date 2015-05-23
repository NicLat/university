package anagrafica;

import java.util.ArrayList;

public class Quartiere {
	
	private String nome;
	private ArrayList<String> vie;
	
	public Quartiere(String nome) {
		super();
		this.nome = nome;
		this.vie = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getVie() {
		return vie;
	}

	public void setVie(ArrayList<String> vie) {
		this.vie = vie;
	}	
	
	public void addVia(String via){
		vie.add(via);
	}
}
