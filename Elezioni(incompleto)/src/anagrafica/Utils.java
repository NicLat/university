package anagrafica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Utils {
	
	public static boolean esisteComune(HashMap<String, ArrayList<String>> comuni, String nome){
		for (Entry<String, ArrayList<String>> temp : comuni.entrySet()) {
			if(temp.getKey() == nome)
				return true;
		}
		return false;
	}
	
	public static boolean esisteVia(HashMap<String, ArrayList<String>> comuni, String comune, String nome){
		for (String viaTemp : comuni.get(comune)) {
			if(viaTemp == nome)
				return true;
		}
		return false;
	}
	

}
