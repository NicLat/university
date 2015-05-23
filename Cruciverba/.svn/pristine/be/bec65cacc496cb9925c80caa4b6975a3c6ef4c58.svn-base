package model;

import java.util.Observable;

public class ProxyVerify extends Observable implements IVerify{

	private IVerify verifica;
	
	
	public ProxyVerify(IVerify verifica) {
		super();
		this.verifica = verifica;
	}

	@Override
	public String verify(String input) {
		String out="";
		
		try {
			out = verifica.verify(input);
			setChanged();
			notifyObservers(out);
				
		} catch (StringErrException e) {
			setChanged();
			notifyObservers(new String("err"));
		}
		
		return out;
	}
	

	public IVerify getVerifica() {
		return verifica;
	}

	public void setVerifica(IVerify verifica) {
		this.verifica = verifica;
	}

}
