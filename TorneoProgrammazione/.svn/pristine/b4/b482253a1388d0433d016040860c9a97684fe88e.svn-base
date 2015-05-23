package ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	private JMenu menuClassifica;
	private JMenuItem team,facolta;

	public BarraMenu() {
		super();
		
		menuClassifica = new JMenu("Classifica");
			team = new JMenuItem("Teams");
			facolta = new JMenuItem("Facolta");
			
		
		add(menuClassifica);
			menuClassifica.add(team);
			menuClassifica.add(facolta);		
		
	}

	public JMenuItem getTeam() {
		return team;
	}
	public JMenuItem getFacolta() {
		return facolta;
	}

	
	
}
