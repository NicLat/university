package drawings.tests;

import javax.swing.JPanel;

import drawings.DrawingsFrame;
import drawings.stringslist.Placer;
import drawings.stringslist.StringsList;
import drawings.stringslist.VerticalPlacer;

public class StringListTest04 {
	
	
	public static void main(String[] args) {
		
		StringsList stringList=new StringsList(
			"White", "Red", "Green", "Blue"		
		);
		
		stringList.setIndex(2);
			
		Placer placer = new Placer();
		stringList.setPlacer(placer);
		placer.setPlacer(new VerticalPlacer());
		
		DrawingsFrame frame = new DrawingsFrame(stringList);
		frame.launchFrame();
		
		JPanel panel = frame.getPanel();
	
		StringListController controller = new StringListController(stringList, placer, panel);
	
		frame.addKeyLisener(controller);
	}

}
