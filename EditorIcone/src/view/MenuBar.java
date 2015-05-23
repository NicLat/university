package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar{

	private JMenuBar bar;
	private JMenu menuFile,menuNuovo,menuStrumenti;
	private JMenuItem salva;
	private JMenuItem[] itemsDim,itemsStrumenti;

	public MenuBar() {
		super();

		bar = new JMenuBar();
		
		menuFile = new JMenu("File");
			menuNuovo = new JMenu("Nuovo");
				itemsDim = new JMenuItem[3];
				itemsDim[0] = new JMenuItem("16x16");
				menuFile.add(itemsDim[0]);
				itemsDim[1] = new JMenuItem("24x24");
				menuFile.add(itemsDim[1]);
				itemsDim[2] = new JMenuItem("32x32");
				menuFile.add(itemsDim[2]);
			salva = new JMenuItem("Salva");	
		menuStrumenti = new JMenu("Strumenti");
			itemsStrumenti = new JMenuItem[3];
			itemsStrumenti[0] = new JMenuItem("Matita");
			menuFile.add(itemsStrumenti[0]);
			itemsStrumenti[1] = new JMenuItem("Gommino");
			menuFile.add(itemsStrumenti[1]);
			itemsStrumenti[2] = new JMenuItem("Pennello Colore");
			menuFile.add(itemsStrumenti[2]);
		
		
		bar.add(menuFile);
			menuFile.add(menuNuovo);
				menuNuovo.add(itemsDim[0]);
				menuNuovo.add(itemsDim[1]);
				menuNuovo.add(itemsDim[2]);
			menuFile.add(salva);
		bar.add(menuStrumenti);
			menuStrumenti.add(itemsStrumenti[0]);
			menuStrumenti.add(itemsStrumenti[1]);
			menuStrumenti.add(itemsStrumenti[2]);
		
	}

	public JMenuItem getSalva() {
		return salva;
	}

	public JMenuItem[] getItemsDim() {
		return itemsDim;
	}

	public JMenuItem[] getItemsStrumenti() {
		return itemsStrumenti;
	}

	public JMenuBar getBar() {
		return bar;
	}
	
}
