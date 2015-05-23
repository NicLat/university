package dispositividitest;

import java.io.IOException;

import file.writer.ILineWriter;
import file.writer.MyFileWriter;
import modello.ITicketMachine;

public class TicketMachine implements ITicketMachine,ILineWriter {

	MyFileWriter fl = new MyFileWriter("CartellaDiTest/BigliettiStampati", this);
	
	@Override
	public void printticket(String servizio, int counter) {
		String biglietto = counter+"-"+servizio;
		try {
			fl.write(biglietto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String writeLine(String str) {
		return str;
	}

	

}
