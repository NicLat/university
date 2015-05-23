package vista;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextPane;

import modello.CatalogoDigitale;
import modello.Pezzo;

/**
 * Osserva l'elenco di pezzi e li mostra nel pannello a seconda del filtro impostato
 * @author NL
 */
public class LeggiCatalogo extends JTextPane implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	private CatalogoDigitale catalogo;
	private String filtro;

	public LeggiCatalogo(CatalogoDigitale catalogo, String filtro) {
		super();
		this.catalogo = catalogo;
		this.filtro = filtro;
		catalogo.addObserver(this);
		aggiornaTesto();
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
		aggiornaTesto();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		aggiornaTesto();
	}

	private void aggiornaTesto(){
		String text = "";	
		
		if(filtro.equals("Tutti")){
			for (Pezzo p : catalogo.elencoPezzi()) {
					text += getFormato(p) + "\n";
			}		
		}else{
			for (Pezzo p : catalogo.elencoPezzi()) {
			if(p.getSala().equals(filtro))
				text += getFormato(p) + "\n";
			}	
		}
		
		setText(text);
	}
	
	private String getFormato(Pezzo p){
		return (p.getSala() +"          "+ p.getAnno() +"\t"+ p.getCodiceIdentificativo() +"\t"+ p.getDescrizione());
	}
	
}
