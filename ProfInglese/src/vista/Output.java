package vista;

import javax.swing.JTextArea;

public class Output extends JTextArea{

	private static final long serialVersionUID = 1L;
	
	public Output(String text) {
		super();
		setText(text);
		setEditable(false);
		setEnabled(false);
	}


}
