package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LineWriter {

	String filename;
	FileWriter writer;
	
	public LineWriter(String filename){
		super();
		this.filename = filename;	
	}

	public void write(String res) throws IOException {
		writer = new FileWriter(new File(filename), true);
		writer.write(res+"\n");
		writer.close();
	}
}