package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import model.Phrases;

public class PhrasesArea implements Observer{

	private Phrases frasi;
	private JTextArea area;
	
	public PhrasesArea(Phrases frasi, JTextArea area) {
		super();
		this.frasi=frasi;
		this.area=area;
		area.setEnabled(false);
		frasi.addObserver(this);

		area.setText(null);
		area.setText(createString());
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		area.setText(null);
		area.setText(createString());
	}

	
	private String createString(){
		
		String str = new String("");
		if(frasi.getSize()==0)
			str="Nessuna Stringa Inserita";
		else
			for (int i = 0; i < frasi.getSize(); i++) {
				str += (frasi.getElem(i) + "\n");
			}
		return str;
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}

}
