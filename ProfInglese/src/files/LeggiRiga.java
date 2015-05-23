package files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class LeggiRiga implements ILineReader{
	
	HashMap<String, ArrayList<String>> frasiDaCaricare;
	
	public LeggiRiga(HashMap<String, ArrayList<String>> frasiDaCaricare) {
		super();
		this.frasiDaCaricare = frasiDaCaricare;
	}

	@Override
	public void readLine(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, ":-");
		
		String inglese = tokenizer.nextToken();
		ArrayList<String> traduzioni = new ArrayList<String>();
		
		while(tokenizer.hasMoreTokens()){
			traduzioni.add(tokenizer.nextToken());
		}
		
		frasiDaCaricare.put(inglese, traduzioni);
	}

}
