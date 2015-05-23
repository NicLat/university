package anagrafica;

import java.util.ArrayList;
import java.util.HashMap;

public class Archivio {
	
	private HashMap<String, ArrayList<String>> vie;				//chiave comune
	private HashMap<String, ArrayList<Quartiere>> quartieri;	//chiave comune

	public Archivio() {
		super();
		vie = new HashMap<String, ArrayList<String>>();
		quartieri = new HashMap<String, ArrayList<Quartiere>>();
	}
	
	
	public HashMap<String, ArrayList<String>> getComuni() {
		return vie;
	}
	public HashMap<String, ArrayList<Quartiere>> getQuartieri() {
		return quartieri;
	}


	public boolean addComune(String comune){
		if(!Utils.esisteComune(vie,comune)){
			vie.put(comune, new ArrayList<String>());
			quartieri.put(comune, new ArrayList<Quartiere>());
			return true;
		}
		return false;
	}
	
	public boolean addVia(String comune, String via){
		if(Utils.esisteComune(vie,comune)){
			vie.get(comune).add(via);
			return true;
		}
		return false;
	}
	
	public boolean addQuartiere(String comune, Quartiere quartiere){
		if(Utils.esisteComune(vie,comune)){
			quartieri.get(comune).add(quartiere);
			return true;
		}
		return false;
	}

	
	
	

}
