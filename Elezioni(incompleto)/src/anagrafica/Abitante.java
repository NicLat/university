package anagrafica;

import java.util.Date;

public class Abitante {
	
	private String nomeCompleto;
	private String comune;
	private String via;
	private Date dataNascita;
	private boolean cittadinanza;
	
	
	public Abitante(String nomeCompleto, String comune, String via,
			Date dataNascita, boolean cittadinanza) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.comune = comune;
		this.via = via;
		this.dataNascita = dataNascita;
		this.cittadinanza = cittadinanza;
	}
	
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public boolean isCittadinanza() {
		return cittadinanza;
	}
	public void setCittadinanza(boolean cittadinanza) {
		this.cittadinanza = cittadinanza;
	}
	

}
