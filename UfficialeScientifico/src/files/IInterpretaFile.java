package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import model.Pianeta;

public interface IInterpretaFile {
	
	public Pianeta costruisci(BufferedReader reader) throws IOException,FileNotFoundException;

}
