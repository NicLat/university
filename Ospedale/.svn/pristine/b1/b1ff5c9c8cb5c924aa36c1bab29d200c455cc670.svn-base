package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Scrittore {

	private FileWriter writer;
	private String filename;

	public boolean apriFile(String filename){
		this.filename = filename;
		try {
			this.writer = new FileWriter(new File(filename));
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public void scriviRighe(List<String> righe) throws IOException {
		writer = new FileWriter(new File(filename), true);
		for (int i = 0; i < righe.size(); i++) {
			writer.write(righe.get(i) + "\n");
		}
		writer.close();
	}
	
	public void chiudiFile(){
		
	}
}