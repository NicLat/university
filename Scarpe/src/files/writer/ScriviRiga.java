package files.writer;

import gestore.StockScarpe;

public class ScriviRiga implements ILineWriter{
	
	@Override
	public String writeLine(String furgone, String modello, StockScarpe stock) {
		
		return furgone + " " + modello + " " + String.valueOf(stock.getQuantita());
	}

}
