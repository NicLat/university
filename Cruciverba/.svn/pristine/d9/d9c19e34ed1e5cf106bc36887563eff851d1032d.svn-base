package model;

public class VerifyCrosses implements IVerify{

	@Override
	public String verify(String input) throws StringErrException {
		if (Utils.areTwoWords(input)){
			int c = Utils.countCommon(input);
			return "comuni " + input + " " + String.valueOf(c);
		}else
			throw new StringErrException("Errore nell'inserimento della/e parole!");
	}

	
}
