package convertitore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import files.Caricatore;
import files.Scrittore;

public class FormatoA implements FormatoFile{
	
	private Caricatore caricatore = new Caricatore();
	private Scrittore scrittore = new Scrittore();
	
	@Override
	public List<Paziente> leggiFile(String nomefile) {
		
		ArrayList<String> righe;
		ArrayList<Paziente> pazienti = new ArrayList<Paziente>();
		
		if (caricatore.apriFile(nomefile)){
			
			righe = caricatore.caricaRighe(5);
			while(righe != null){
				
				pazienti.add(creaPaziente(righe));
				
				righe.clear();
				righe = caricatore.caricaRighe(5);
			}
			
			caricatore.chiudiFile();
		}
		
		return pazienti;
	}
	
	@Override
	public void scriviFile(String nomefile, List<Paziente> pazienti) {
		
		scrittore.apriFile(nomefile);
		for (Paziente paziente : pazienti) {
			
			ArrayList<String> righe = creaRighe(paziente);
			
			try {
				scrittore.scriviRighe(righe);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private Paziente creaPaziente(ArrayList<String> righe) {
		Paziente p = new Paziente();
		StringTokenizer tokenizer;
		
		tokenizer = new StringTokenizer(righe.get(0),": ");
		tokenizer.nextToken();
		p.setCodice(Integer.parseInt(tokenizer.nextToken()));
		tokenizer = new StringTokenizer(righe.get(1),": ");
		tokenizer.nextToken();
		p.setNome(tokenizer.nextToken());
		tokenizer = new StringTokenizer(righe.get(2),": ");
		tokenizer.nextToken();
		p.setCognome(tokenizer.nextToken());
		tokenizer = new StringTokenizer(righe.get(3),": ");
		tokenizer.nextToken();
		p.setDataIngresso(tokenizer.nextToken() + " " + tokenizer.nextToken() + " " + tokenizer.nextToken() );
		tokenizer = new StringTokenizer(righe.get(4),": ");
		tokenizer.nextToken();
		p.setDataUscita(tokenizer.nextToken() + " " + tokenizer.nextToken() + " " + tokenizer.nextToken() );
		
		return p;
	}
	
	private ArrayList<String> creaRighe(Paziente paziente) {
		ArrayList<String> righe = new ArrayList<String>();
		righe.add("Codice_Paziente: " + paziente.getCodice());
		righe.add("Nome: " + paziente.getNome());
		righe.add("Cognome: " + paziente.getCognome());
		righe.add("Data_Ingresso: " + paziente.getDataIngresso());
		righe.add("Data_Uscita: " + paziente.getDataUscita());
		return righe;
	}
	

}
