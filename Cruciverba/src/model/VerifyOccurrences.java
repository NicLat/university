package model;

public class VerifyOccurrences implements IVerify{

	@Override
	public String verify(String input) throws StringErrException {
		if (Utils.isOneWord(input))
			return "jkxyw " + input + " " +String.valueOf(Utils.occurrences(input));
		else
			throw new StringErrException("Errore nell'inserimento della/e parole!");
	}
	
}
