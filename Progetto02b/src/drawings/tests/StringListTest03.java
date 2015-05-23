package drawings.tests;

import drawings.DrawingsFrame;
import drawings.stringslist.StringsList;

public class StringListTest03 {
	
	
	public static void main(String[] args) {
		
		StringsList stringList1=new StringsList(
		"White", "Red", "Green", "Blue"		
		);
		
		StringsList stringList2=new StringsList(
		"White", "Red", "Green", "Blue"		
		);
	
		DrawingsFrame frame1 = new DrawingsFrame(stringList1);
		frame1.launchFrame();
		
		DrawingsFrame frame2 = new DrawingsFrame(stringList2);
		stringList2.down();stringList2.down();stringList2.down();stringList2.down();stringList2.down();
		frame2.launchFrame();
		
		
	}

}
