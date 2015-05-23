package view;

import java.util.Observable;
import java.util.Observer;
import java.util.StringTokenizer;

import javax.swing.JLabel;

import model.ProxyVerify;

public class ResultsPanel extends JLabel implements Observer{

	private static final long serialVersionUID = 1L;
	
	ProxyVerify verifica;
	
	JLabel label;
	
	public ResultsPanel(ProxyVerify verifica) {
		super();
		this.verifica = verifica;
		this.label = new JLabel("");
		
		verifica.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		String result = arg.toString();
		
		if(result.compareTo("err") != 0){
			String t = getOnlyResult(result);
			label.setText(t);
		}else
			label.setText("err");
	}

	private String getOnlyResult(String result) {
		StringTokenizer tok = new StringTokenizer(result);
		String t = tok.nextToken();
		t = tok.nextToken();
		t = tok.nextToken();
		return t;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
}
