package modello;

import java.util.ArrayList;

public class Confrontatore implements IConfronta{

	@Override
	public boolean trovaTraduzioneAccettabile(String frase, ArrayList<String> soluzioni) {
		
		for (String slz : soluzioni) {
			if(slz.equalsIgnoreCase(frase))
				return true;
			if(ugualiAMenoDiUnCarattere(slz, frase))
				return true;			
		}
		
		return false;
	}
	
	private boolean ugualiAMenoDiUnCarattere(String s1, String s2){
		int diff = 0;
		
		if(s1.length() != s2.length())
			return false;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i))
				diff++;
		}
		
		if(diff <= 1)
			return true;
		return false;
	}
}
