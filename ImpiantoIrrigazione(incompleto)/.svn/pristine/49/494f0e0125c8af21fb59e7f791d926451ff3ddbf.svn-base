package impianto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Centralina {
	
	private HashMap<String, IIrrigatoreONOFF> onoff;
	private HashMap<String, IIrrigatorePERC> perc;
	private int contaCodici = 0;

	private ArrayList<Programma> programmi;
	
	// implementazione del singleton
	private static Centralina istanzaCentralina = new Centralina();
	private Centralina() {
		super();
		
		onoff = new HashMap<String, IIrrigatoreONOFF>();
		perc = new HashMap<String, IIrrigatorePERC>();
		programmi = new ArrayList<Programma>();
	}
	public static Centralina getIstanzaCentralina(){
		return istanzaCentralina;
	}
	
	
	public void gestisciComando(String irrigatore, String comando){
		
		if(onoff.containsKey(irrigatore)){
			if(comando.equals("on")){
				onoff.get(irrigatore).accendi();
			}else if(comando.equals("off")){
				onoff.get(irrigatore).spegni();
			}
		}else if(perc.containsKey(irrigatore)){
			if(comando.equals("on")){
				perc.get(irrigatore).setApertura(100);
			}else if(comando.equals("off")){
				perc.get(irrigatore).setApertura(0);
			}else{
				StringTokenizer tok = new StringTokenizer(comando,"=");
				tok.nextToken();
				int percentuale = 0;
				try {
					percentuale = Integer.parseInt(tok.nextToken());
				} catch (NumberFormatException e) {
					
				}
				if(percentuale >= 0 && percentuale <=100 ){
					perc.get(irrigatore).setApertura(percentuale);
				}
			}
			
		}
		
		
	}
	
	
	public void aggiungiProgramma(){
		
		// mette un nuovo programma nel vettore 
		// fa partire il processo timer per farlo partire automaticamente
		
		//il timer dopo aver eseguito il compito:
		//    fa partire un'altro timer per lo spegnimento (durata)
		//    toglie il programma dal vettore
	}
	
	public void eseguiProgrammi(Date inizio, Date fine){
		
		//cerca tutti i programmi nell'intervallo di date
	}

}
