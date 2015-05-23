package ui;

import java.awt.GridLayout;
import java.util.LinkedList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	LinkedList<JCheckBox> operations;
	JTextField n;

	public InputPanel() {
		super();
		this.operations = new LinkedList<JCheckBox>();
		this.n = new JTextField();
		this.setLayout(new GridLayout(10,1));
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.add(new JLabel("Numero Elementi: ", JLabel.RIGHT));
		p.add(n);
		
		this.add(p);
	}
		
	public LinkedList<JCheckBox> getOperations() {
		return operations;
	}
	public JTextField getN() {
		return n;
	}

	public void addOperation(String name){
		operations.add(new JCheckBox(name));
	}
	
	public void build(){
		this.add(new JLabel("Scegli le perazioni da confrontare:"));
		for (JCheckBox temp : operations) {
			this.add(temp);
		}
	}

}
