package model;


public class Utils {
	
	static boolean isPalindrome(String str){
		for (int i = 0; i < str.length()/2 ; i++) {
			if(str.charAt(i) != str.charAt(str.length() -i-1) )
				return false;
		}
		return true;
	}
	
	static int occurrences(String str){
		String s = "JKXYW";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char temp = str.charAt(i);
			if(s.indexOf(temp) != -1)
				count++;
		}
		return count;
	}
	
	static boolean isOneWord(String str){
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == ',')
				return false;
		}
		return true;
	}
	
	static boolean areTwoWords(String str){
		int i,commas=0;
		
		for (i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				return false;
			if(str.charAt(i) == ',')
				commas++;
		}
		if(commas==1)
			return true;
		else
			return false;
	}
	
	static int countCommon(String input) {
		String[] temp = input.split(",");
		int c=0;
		for (int i = 0; i < temp[0].length(); i++) {
			if ( temp[1].indexOf(temp[0].charAt(i)) != -1)
				c++;
			
		}
		return c;
	}
}
