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
		
		menu = new JMenu("Verifiche");
		bar.add(menu);
		
		items = new JMenuItem[3];
		items[0] = new JMenuItem("Palindroma");
		menu.add(items[0]);
		items[1] = new JMenuItem("Occorrenze JKXYW");
		menu.add(items[1]);
		items[2] = new JMenuItem("Possibili Incroci");
		menu.add(items[2]);
	}

	public JMenuBar getBar() {
		return bar;
	}
	
}
