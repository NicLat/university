package convertitore;

import java.util.List;


public class Convertitore implements FormatoFile{
	
	private FormatoFile formato;
	
	
	public Convertitore(FormatoFile formato) {
		super();
		this.formato = formato;
	}
	public void setFormato(FormatoFile formato) {
		this.formato = formato;
	}
	
	
	@Override
	public List<Paziente> leggiFile(String nomefile) {
		return formato.leggiFile(nomefile);
	}
	
	@Override
	public void scriviFile(String nomefile, List<Paziente> pazienti) {
		formato.scriviFile(nomefile, pazienti);
	}

}
