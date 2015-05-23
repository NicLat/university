package view;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import model.ProxyVerify;
import files.LineWriter;

public class LogUpdater implements Observer{
	
	String filename;
	ProxyVerify verifica;
	LineWriter writer;

	public LogUpdater(String filename, ProxyVerify verifica) {
		super();
		this.filename = filename;
		this.verifica = verifica;
		
		this.writer = new LineWriter(filename);
		
		verifica.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		String result = arg.toString();
		try {
			if(result.compareTo("err") != 0)
				writer.write(result);
			else
				writer.write("err");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
