package model;

import java.util.ArrayList;

public class PannelloTurni {
	
	private int n;
	private ArrayList<Turno> turni;
	
	public PannelloTurni(int n) {
		super();
		this.n = n;
		this.turni = new ArrayList<Turno>();
	}
	
	public void aggiungiTurno(Turno turno){
		if (turni.size() == n)
			turni.remove(n-1);
		turni.add(turno);
	}

	public ArrayList<Turno> getTurni() {
		return turni;
	}

	public void setN(int n) {
		this.n = n;
	}

}
