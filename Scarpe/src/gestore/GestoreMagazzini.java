package gestore;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import files.loader.LeggiRiga;
import files.loader.MyFileReader;
import files.writer.MyFileWriter;
import files.writer.ScriviRiga;

public class GestoreMagazzini {

	private HashMap<String, Vettura> vetture = new HashMap<String, Vettura>();
	private MyFileReader lettoreFile;
	private MyFileWriter scrittoreFile;
	
	/**
	 * Aggiunge una vettura alla flotta dell'azienda
	 * @param nome nome della vettura
	 */
	public void aggiungiVettura(String nome){
		vetture.put(nome, new Vettura());
	}
	
	/**
	 * Legge il report di un magazzino con carichi e scarichi sulle varie vetture
	 * @param nomefile nome file del report
	 * @param giorno giorno di cui il report parla
	 */
	public void leggiReportNegozio(String nomefile, Date giorno){
		lettoreFile = new MyFileReader(nomefile, new LeggiRiga(vetture,giorno));
		lettoreFile.loadFile();
	}
	
	/**
	 * Stampa il resoconto delle merci contenute in tutte le vetture
	 * @param nomefile nome del file su cui scrivere il resoconto
	 */
	public void stampaReportVetture(String nomefile){
		scrittoreFile = new MyFileWriter(nomefile, new ScriviRiga());
		
		for (Map.Entry<String, Vettura> vettura : vetture.entrySet()) {
			
			for (Map.Entry<String, StockScarpe> stock : vettura.getValue().getCarico().entrySet()) {
				
				try {
					scrittoreFile.write(vettura.getKey(), stock.getKey(), stock.getValue());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Stampa il resoconto delle merci presenti nei veicoli da più di tot giorni
	 * @param nomefile nome del file su cui stampare
	 * @param giorni giorni per cui uno stock è "vecchio"
	 */
	public void stampaStockVecchi(String nomefile, int giorni){
		scrittoreFile = new MyFileWriter(nomefile, new ScriviRiga());
		
		for (Map.Entry<String, Vettura> vettura : vetture.entrySet()) {
			
			for (Map.Entry<String, StockScarpe> stock : vettura.getValue().getScarpeVecchie(giorni).entrySet()) {
				
				try {
					scrittoreFile.write(vettura.getKey(), stock.getKey(), stock.getValue());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
}
