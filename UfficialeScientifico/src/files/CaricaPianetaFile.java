package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.ILeggiPianeta;
import model.Pianeta;

public class CaricaPianetaFile implements ILeggiPianeta {
	
	IInterpretaFile interprete;

	public CaricaPianetaFile(IInterpretaFile interprete) {
		super();
		this.interprete = interprete;
	}
	
	@Override
	public Pianeta leggiPianeta(String nomefile) {
		return caricaDaFile(nomefile);
	}
		
	private Pianeta caricaDaFile(String nomefile) {
		Pianeta p;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(nomefile)));
			p = interprete.costruisci(reader);
			reader.close();
			return p;	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
