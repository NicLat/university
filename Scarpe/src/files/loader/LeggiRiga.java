package files.loader;

import gestore.Vettura;

import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LeggiRiga implements ILineReader{
	
	HashMap<String, Vettura> vetture;
	Date data;
	
	public LeggiRiga(HashMap<String, Vettura> vetture, Date data) {
		super();
		this.vetture = vetture;
		this.data = data;
	}

	@Override
	public void readLine(String line) {
		String[] parti = scompattaLinea(line);
		
		if(vetture.containsKey(parti[0])){
			//System.out.println("contiene vettura");
			try {
				vetture.get(parti[0]).modificaPresenze(parti[2], Integer.parseInt(parti[1]), data);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.err.println(e.getMessage()+"\n    "+line);
			}
		}

	}
	
	private String[] scompattaLinea(String line){
		StringTokenizer tokenizer = new StringTokenizer(line);
		String[] parti = new String[tokenizer.countTokens()];
		parti[0] = tokenizer.nextToken();
		parti[1] = tokenizer.nextToken();
		parti[2] = tokenizer.nextToken();
		return parti;
	}

}
