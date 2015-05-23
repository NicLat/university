package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import anagrafica.Quartiere;
import anagrafica.Utils;


@Deprecated
public class ConcreteQuartieri implements ILeggiQuartieri{
	
	ArrayList<Quartiere> quartieri;
	
	@Override
	public ArrayList<Quartiere> leggiQuartieri( HashMap<String, ArrayList<String>> archivio, String comune, BufferedReader reader) {
		try {
			String line = reader.readLine();
			while(line != null){
				try {
					quartieri.add(leggiQuartiere(archivio, comune, line));
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
		return quartieri;
	}
		
	
	private Quartiere leggiQuartiere(HashMap<String, ArrayList<String>> archivio, String comune, String line) throws EccezioneAnagrafica{

		StringTokenizer tokenizer = new StringTokenizer(line,",");
		
		String nome = tokenizer.nextToken();
		comune = tokenizer.nextToken();
		if(!Utils.esisteComune(archivio, comune)){
			throw new EccezioneAnagrafica("Comune Inesistente");
		}
		Quartiere q = new Quartiere(nome);
		
		while(tokenizer.hasMoreTokens()){
			String via = tokenizer.nextToken();
			if(!Utils.esisteVia(archivio, comune, via)){
				throw new EccezioneAnagrafica("Via Inesistente");
			}
			q.addVia(via);
		}
		
		return q;		
	}
	
}
