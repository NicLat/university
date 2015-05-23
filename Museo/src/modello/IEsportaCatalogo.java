package modello;

import java.util.ArrayList;

/**
 * Interfaccia per l'esportazione del catalogo
 * @author NL
 */
public interface IEsportaCatalogo {
	
	/**
	 * Esporta il catalogo nei parametri
	 * @param catalogo
	 */
	public void esportaCatalogo(ArrayList<Pezzo> pezzi);

}
