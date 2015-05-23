package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pianeta {	
	private int maxTemp, minTemp, diametro;
	private ArrayList<Elemento> elementi;
	
	public Pianeta() {
		super();
		this.maxTemp = 0;
		this.minTemp = 0;
		this.diametro = 0;
		this.elementi = new ArrayList<Elemento>(25);
	}
	
	
	public boolean isAffine(Pianeta p){
		int countNonPres = 0;
		List<String> elementiPrincipali = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			elementiPrincipali.add(p.getElementi().get(i).getNome());
		}
		
		for (int i = 0; i < 5; i++) {
			//System.out.println(p.getElementi().get(i).getNome());
			if (! elementiPrincipali.contains( elementi.get(i).getNome() ))
				countNonPres++;
		}
		
		if(countNonPres > 1)
			return false;
		return true;
	}
	//prova
	
	

	public boolean addElemento(Elemento el){
		
		if(elementi.size() >= 25)
			return false;
		
		elementi.add(el);
		Collections.sort(elementi);		
		
		return true;
	}
	
	
	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public ArrayList<Elemento> getElementi() {
		return elementi;
	}


	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
}
