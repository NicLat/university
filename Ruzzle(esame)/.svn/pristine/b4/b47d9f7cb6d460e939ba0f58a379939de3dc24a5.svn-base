package modello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import files.writer.Linea;
import files.writer.ScrittoreFile;

/**
 * Crea un resoconto ordinato di punteggi e parole su file
 * @author esame_16
 */
public class ResocontoSuFile implements IResoconto{
	
	ScrittoreFile scrittore;
	String filename;
	
	public ResocontoSuFile(String filename) {
		super();
		this.filename = filename;
	}
	
	/**
	 * ordina il vettore parole/punteggi e lo scrive su file
	 */
	@Override
	public void scriviResoconto(ArrayList<ParolaTrovata> parole){
		
		Collections.sort(parole);
		
		try {
			scrittore = new ScrittoreFile(filename, new Linea());
			for (ParolaTrovata p : parole) {	
					scrittore.write(p.getParola(), p.getPunteggio());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
