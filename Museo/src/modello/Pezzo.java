package modello;

/**
 * Pezzo presente nel museo, implementa comparable per i confronti tra pezzi e gli ordinamenti
 * @author NL
 */
public class Pezzo implements Comparable<Pezzo>{
	
	/**
	 * Costanti riguardanti le caratteristiche del museo, public perchè potrebbero essere utili ad altri componenti futuri.
	 * Potrebbero diventare un input da file in caso questo software diventasse riutilizzabile per molti musei
	 */
	public static final int ANNO_MIN = 800;
	public static final int ANNO_MAX = 1900;
	public static final String[] SALE = {"Salone Medioevale", 
										"Salone Rinascimentale",
										"Sala dell'Inquisizione",
										"Sala delle Scienze Moderne", 
										"Sala delle Tecnologie moderne"};
	
	
	private String codiceIdentificativo;
	private int anno;
	private String descrizione;
	private String sala;
	
	/**
	 * Costruttore di {@link Pezzo} contenente controlli su anno, sala e codice identificativo
	 * @param codiceIdentificativo
	 * @param anno
	 * @param descrizione
	 * @param sala
	 * @throws Exception
	 */
	public Pezzo(String codiceIdentificativo, int anno, String descrizione, String sala) throws Exception{
		super();
		setCodiceIdentificativo(codiceIdentificativo);
		setAnno(anno);
		setDescrizione(descrizione);
		setSala(sala);
	}

	public void setCodiceIdentificativo(String codiceIdentificativo) throws Exception {
		if(codiceIdentificativo.length() != 8)
			throw new Exception("Codice identificativo non negli standard");
		
		//TODO controllo che il codice abbia solo lettere e numeri
		this.codiceIdentificativo = codiceIdentificativo;
	}
	public void setAnno(int anno) throws Exception {
		if(anno < ANNO_MIN || anno > ANNO_MAX){
			throw new Exception("Anno non compatibile");
		}else{
			this.anno = anno;
		}
	}
	public void setSala(String sala) throws Exception {
		if(esisteSala(sala))
			this.sala = sala;
		else 
			throw new Exception("Sala non esistente");
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**
	 * Funzione che controlla l'esistenza di una sala
	 * @param sala
	 * @return
	 */
	private boolean esisteSala(String sala){
		for (int i = 0; i < SALE.length; i++) {
			if(sala.equals(SALE[i]))
				return true;
		}
		return false;		
	}

	
	@Override
	public int compareTo(Pezzo p) {
		
		if(sala.compareTo(p.getSala()) != 0)
			return sala.compareTo(p.getSala());
		else if(compareInt(anno, p.getAnno()) != 0)
			return compareInt(anno, p.getAnno());
		else if(codiceIdentificativo.compareTo(p.getCodiceIdentificativo()) != 0)
			return codiceIdentificativo.compareTo(p.getCodiceIdentificativo());
		
		return 0;
	}
	
	private int compareInt(int a, int b){
		if(a > b)
			return 1;
		else if(a < b)
			return -1;
		return 0;
	}
	
	
	public String getCodiceIdentificativo() {
		return codiceIdentificativo;
	}
	public int getAnno() {
		return anno;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public String getSala() {
		return sala;
	}
	
}
