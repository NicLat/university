package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar{

	private JMenuBar bar;
	private JMenu menuPartita,menuTipo;
	private JMenuItem nuova,esci;
	private JMenuItem[] opzioni;

	public MenuBar() {
		super();

		bar = new JMenuBar();
		
		menuPartita = new JMenu("Partita");
			nuova = new JMenuItem("Nuova");
			esci = new JMenuItem("Esci");
			
		menuTipo = new JMenu("Tipo");
			opzioni = new JMenuItem[7];
			opzioni[0] = new JMenuItem("8x8, 5 mine");
			menuTipo.add(opzioni[0]);
			opzioni[1] = new JMenuItem("8x8, 15 mine");
			menuTipo.add(opzioni[1]);
			opzioni[2] = new JMenuItem("12x12, 20 mine");
			menuTipo.add(opzioni[2]);
			opzioni[3] = new JMenuItem("12x12, 30 mine");
			menuTipo.add(opzioni[3]);
			opzioni[4] = new JMenuItem("16x16, 50 mine");
			menuTipo.add(opzioni[4]);
			opzioni[5] = new JMenuItem("16x16, 70 mine");
			menuTipo.add(opzioni[5]);
			opzioni[6] = new JMenuItem("Personalizzata");
			menuTipo.add(opzioni[6]);

		
		bar.add(menuPartita);
			menuPartita.add(nuova);
			menuPartita.add(esci);
			
		bar.add(menuTipo);
			menuTipo.add(opzioni[0]);
			menuTipo.add(opzioni[1]);
			menuTipo.add(opzioni[2]);
			menuTipo.add(opzioni[3]);
			menuTipo.add(opzioni[4]);
			menuTipo.add(opzioni[5]);
			menuTipo.add(opzioni[6]);
		
		
	}

	public JMenuItem getNuova() {
		return nuova;
	}
	public JMenuItem getEsci() {
		return esci;
	}
	public JMenuItem[] getOpzioni() {
		return opzioni;
	}
	public JMenuBar getBar() {
		return bar;
	}
	
}
