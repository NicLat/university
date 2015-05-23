package model;

public class Utils {

	public static String removeRest(String str){
		if(str.indexOf('%') != -1)
			return str.substring(0, str.indexOf('%'));
		else 
			return str;
	}
}
