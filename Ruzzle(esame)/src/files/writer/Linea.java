package files.writer;

public class Linea implements IScriviLinea{
	
	@Override
	public String writeLine(String parola, int punteggio) {
		return punteggio + " " + parola;
	}

}
