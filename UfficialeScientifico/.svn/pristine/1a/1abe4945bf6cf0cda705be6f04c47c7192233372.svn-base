package model;

public class Elemento implements Comparable<Elemento> {
	private String nome;
	private int concentrazione;
	
	public Elemento(String nome, int concentrazione) {
		super();
		this.nome = nome;
		this.concentrazione = concentrazione;
	}
	
	@Override
	public int compareTo(Elemento o) {
		if(this.concentrazione < o.getConcentrazione())
			return 1;
		else if(this.concentrazione > o.getConcentrazione())
			return -1;
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConcentrazione() {
		return concentrazione;
	}

	public void setConcentrazione(int concentrazione) {
		this.concentrazione = concentrazione;
	}	

}
