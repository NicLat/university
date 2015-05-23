package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	private JMenu menuFile;
	private JMenuItem apri,esci;

	public BarraMenu() {
		super();
		
		menuFile = new JMenu("File");
			apri = new JMenuItem("Apri file di frasi");
			esci = new JMenuItem("Esci");
			
		
		add(menuFile);
			menuFile.add(apri);
			menuFile.add(esci);		
		
	}

	public JMenuItem getApri() {
		return apri;
	}
	public JMenuItem getEsci() {
		return esci;
	}
	
}
