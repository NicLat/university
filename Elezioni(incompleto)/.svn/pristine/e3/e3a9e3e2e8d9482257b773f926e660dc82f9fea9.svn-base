package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;

import anagrafica.*;

@Deprecated
public class ConcreteAbitanti implements ILeggiAbitanti{
	
	ArrayList<Abitante> abitanti;
	
	@Override
	public ArrayList<Abitante> leggiAbitanti(HashMap<String, ArrayList<String>> archivio, BufferedReader reader) {
		
		try {
			String line = reader.readLine();
			while(line != null){
				try {
					abitanti.add(leggiAbitante(archivio, line));
				} catch (EccezioneAnagrafica e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return abitanti;
	}
	
	
	private Abitante leggiAbitante(HashMap<String, ArrayList<String>> archivio, String line) throws EccezioneAnagrafica{

		StringTokenizer tokenizer = new StringTokenizer(line);
		
		String nome = new String(tokenizer.nextToken());
		String comune = tokenizer.nextToken();
		String via = tokenizer.nextToken();
		Date dataNascita = new Date(tokenizer.nextToken());
		
		if(!Utils.esisteComune(archivio, comune)){
			throw new EccezioneAnagrafica("Comune Inesistente");
		}
		if(!Utils.esisteVia(archivio, comune, via)){
			throw new EccezioneAnagrafica("Via Non Trovata");
		}
		
		return new Abitante(nome, comune, via, dataNascita, true);		
	}
	
}
