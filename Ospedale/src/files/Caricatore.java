package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Caricatore {
	
	private BufferedReader reader;
	
	public boolean apriFile(String filename){
		try {
			this.reader = new BufferedReader(new FileReader(new File(filename)));
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}

	public ArrayList<String> caricaRighe(int num) {
		
			ArrayList<String> str = new ArrayList<String>();
			try {
				for (int i = 0; i < num; i++) {
					String s = reader.readLine();
					
					if(s == null){
						reader.close();
						return null;
					}
					
					str.add(s);
				}
			} catch (IOException e) {
				str = null;
			}
			return str;
	}
	
	public void chiudiFile(){
		try {
			reader.close();
		} catch (IOException e) {
		}
	}
	


}
