package model;

import java.util.ArrayList;


public class Ufficio implements IUfficio {

	private static final int TIPI_SERVIZI = 3;
	
	private int[] serviti;
	private int[] code;
	private ArrayList<ICassa> casse;
	private DistributoreBiglietti distributore;
	private PannelloTurni pannello;
	
	public Ufficio(PannelloTurni pannello) {
		super();
		this.serviti = new int[TIPI_SERVIZI];
		this.code = new int[TIPI_SERVIZI];
		
		for (int i = 0; i < TIPI_SERVIZI; i++) {
			serviti[i] = 0;
			code[i] = 0;
		}
		
		this.casse = new ArrayList<ICassa>();
		this.distributore = new DistributoreBiglietti(this);
		this.pannello = pannello;
	}
	
	
	public void addCassa(ICassa cassa){
		casse.add(cassa);
	}
	
	public ArrayList<ICassa> getCasse() {
		return casse;
	}

	public DistributoreBiglietti getDistributore() {
		return distributore;
	}	

	

	@Override
	public PannelloTurni getPannelloTurni() {
		return pannello;
	}

	@Override
	public void incrementaCoda(int tipo) {
		code[tipo]++;
	}

	@Override
	public int getCoda(int tipo) {
		return code[tipo];
	}

	@Override
	public boolean serviCliente(int tipo) {
		if(code[tipo] > serviti[tipo]){
			serviti[tipo]++;
			return true;
		}
		return false;
	}

	@Override
	public int getServito(int tipo) {
		return serviti[tipo];
	}
	
	
}
