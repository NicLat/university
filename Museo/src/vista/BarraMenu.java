package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import modello.Pezzo;

public class BarraMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	private JMenu menuAzioni,menuFiltra;
	private JMenuItem inserisci,esporta;
	private JMenuItem[] filtri;

	public BarraMenu() {
		super();
		
		menuAzioni = new JMenu("Classifica");
			inserisci = new JMenuItem("Inserisci Pezzi");
			esporta = new JMenuItem("Esporta Catalogo");
		
		menuFiltra = new JMenu("Filtra");		
			filtri = new JMenuItem[6];
			filtri[0] = new JMenuItem(Pezzo.SALE[0]);
			menuFiltra.add(filtri[0]);
			filtri[1] = new JMenuItem(Pezzo.SALE[1]);
			menuFiltra.add(filtri[1]);
			filtri[2] = new JMenuItem(Pezzo.SALE[2]);
			menuFiltra.add(filtri[2]);
			filtri[3] = new JMenuItem(Pezzo.SALE[3]);
			menuFiltra.add(filtri[3]);
			filtri[4] = new JMenuItem(Pezzo.SALE[4]);
			menuFiltra.add(filtri[4]);
			filtri[5] = new JMenuItem("Tutti");
			menuFiltra.add(filtri[5]);
			

		add(menuAzioni);
			menuAzioni.add(inserisci);
			menuAzioni.add(esporta);
		add(menuFiltra);
			menuFiltra.add(filtri[0]);
			menuFiltra.add(filtri[1]);
			menuFiltra.add(filtri[2]);
			menuFiltra.add(filtri[3]);
			menuFiltra.add(filtri[4]);
			menuFiltra.add(filtri[5]);
			
		
	}

	public JMenuItem getInserisci() {
		return inserisci;
	}

	public JMenuItem getEsporta() {
		return esporta;
	}

	public JMenuItem[] getFiltri() {
		return filtri;
	}



	
	
}
