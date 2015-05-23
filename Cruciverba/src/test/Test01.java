package test;

import model.ProxyVerify;
import model.VerifyOccurrences;
import model.VerifyPalindrome;

public class Test01 {
	
	public static void main(String[] args) {
		
		ProxyVerify verifica = new ProxyVerify(new VerifyPalindrome());
		System.out.println(verifica.verify("ciao"));
		System.out.println(verifica.verify("annnnnnna"));
		System.out.println(verifica.verify("lol"));
		
		System.out.println();
		
		verifica = new ProxyVerify(new VerifyOccurrences());
		System.out.println(verifica.verify("xilofono"));
		System.out.println(verifica.verify("WWW"));
		System.out.println(verifica.verify("lol"));
		
	}

}
