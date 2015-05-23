package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

import model.Elemento;
import model.Pianeta;

public class Interprete implements IInterpretaFile {

	private String line,line2;
	private StringTokenizer tok,tok2;
	
	private Pianeta p;
	
	public Interprete() {
		super();
		line = new String();
		line2 = new String();
	}
	

	@Override
	public Pianeta costruisci(BufferedReader reader) throws IOException,FileNotFoundException {
		p = new Pianeta();
		
		line = reader.readLine();
		tok = new StringTokenizer(line);
		p.setMinTemp(Integer.parseInt(tok.nextToken()));
		p.setMaxTemp(Integer.parseInt(tok.nextToken()));
		
		line = reader.readLine();
		tok = new StringTokenizer(line);
		p.setDiametro(Integer.parseInt(tok.nextToken()));
		
		line = reader.readLine();
		line2 = reader.readLine();
		tok = new StringTokenizer(line);
		tok2 = new StringTokenizer(line2);
		while(tok.hasMoreTokens() && tok2.hasMoreTokens()){
			Elemento el = new Elemento(tok.nextToken(),Integer.parseInt(tok2.nextToken())); 
			p.addElemento(el);
		}
		
		return p;
	}

	
}
