package drawings.tests;

import drawings.DrawingsFrame;
import drawings.ExampleDrawable;
import drawings.ExampleDrawable02;
import drawings.ExampleDrawable03;

public class DrawingsFrameTest {
	public static void main(String[] args) {
		
		DrawingsFrame frame = new DrawingsFrame(new ExampleDrawable());
		frame.launchFrame();
		
		DrawingsFrame frame2 = new DrawingsFrame(new ExampleDrawable02());
		frame2.launchFrame();
		
		DrawingsFrame frame3 = new DrawingsFrame(new ExampleDrawable03());
		frame3.launchFrame();
	}
}
