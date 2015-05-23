package model;

public class VerifyPalindrome implements IVerify{

	@Override
	public String verify(String input) throws StringErrException {
		if (Utils.isOneWord(input)){
			String s = "palindroma " + input;
			if(Utils.isPalindrome(input))
				s = s + " si";
			else
				s = s + " no";
			return s;
		}else
			throw new StringErrException("Errore nell'inserimento della/e parole!");
	}
	
	
}
