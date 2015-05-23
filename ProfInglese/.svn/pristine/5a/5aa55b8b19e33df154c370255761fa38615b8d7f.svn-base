package modello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CaricatoreB implements ICaricaFrasi{
	
	private BufferedReader reader;


	@Override
	public HashMap<String, ArrayList<String>> caricaCollezioneFrasi(String sorgente) {
		
		try {
			reader = new BufferedReader(new FileReader(new File(sorgente)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		HashMap<String, ArrayList<String>> frasi = new HashMap<String, ArrayList<String>>();
		String eng;
		ArrayList<String> ita = new ArrayList<String>();
		StringTokenizer tokenizer;
		String s;
		
		try {
			s = reader.readLine();
			tokenizer = new StringTokenizer(s,"–");
			tokenizer.nextToken();
			eng = tokenizer.nextToken().trim();

			s = reader.readLine();
			while(s != null){
				
				tokenizer = new StringTokenizer(s,"–");
				String lingua = tokenizer.nextToken().trim();
				if(lingua.equals("EN")){
	
					frasi.put(eng, ita);
					ita = new ArrayList<String>();
					eng = tokenizer.nextToken().trim();
				}else{
					String g = tokenizer.nextToken().trim();
					ita.add(g);
				}
				s = reader.readLine();
			}
		
			reader.close();
		
		} catch (IOException e) {
		}

		return frasi;
	}
	

	



}
