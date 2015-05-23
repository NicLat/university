package model;

import java.util.Observable;

public class ScreenStr extends Observable{

	private String screen;

	
	public ScreenStr() {
		super();
		screen = new String("");
	}
	
	public void clearScreen(){
		screen = "";
		setChanged();
		notifyObservers();
	}
	
	public void appendScreen(String str){
		
		/*
		char[] temp = new char[100];
		for (int i = 0; i < screen.toCharArray().length; i++) {
			temp[i] = screen.charAt(i);
		}
		
		for (int i = temp.length , j=0 ; j < str.length() ; i++ , j++) {
			temp[i] = str.charAt(j);
		}

		setScreen( String.valueOf(temp) );
*/		
		
		screen += str;
		
		setChanged();
		notifyObservers();
	}
	
	public boolean isEmpty(){
		return screen.isEmpty();
	}
	
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
		setChanged();
		notifyObservers();
	}	
	
}
