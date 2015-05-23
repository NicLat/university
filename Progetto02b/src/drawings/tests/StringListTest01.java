package drawings.tests;

import drawings.DrawingsFrame;
import drawings.stringslist.StringsList;

public class StringListTest01 {
	
	
	public static void main(String[] args) {
		
		StringsList stringList=new StringsList(
		"White", "Red", "Green", "Blue"		
		);
	
		
		DrawingsFrame frame = new DrawingsFrame(stringList);
		frame.launchFrame();
	}

}
