package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar{

	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem[] items;
	
	public JMenuItem[] getItems() {
		return items;
	}

	public MenuBar() {
		super();

		bar = new JMenuBar();
		
		menu = new JMenu("Ordinamenti");
		bar.add(menu);
		
		items = new JMenuItem[3];
		items[0] = new JMenuItem("A-Z");
		menu.add(items[0]);
		items[1] = new JMenuItem("Z-A");
		menu.add(items[1]);
		items[2] = new JMenuItem("Casuale");
		menu.add(items[2]);
	}

	public JMenuBar getBar() {
		return bar;
	}
	
}
