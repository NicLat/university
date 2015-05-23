package files;

import model.Icon;

public class Saver implements ISaver{
	
	Icon icon;
	ISaver saver;
		
	public Saver(Icon icon, ISaver saver) {
		super();
		this.icon = icon;
		this.saver = saver;
	}

	public void setSaver(ISaver saver) {
		this.saver = saver;
	}


	@Override
	public boolean save(Icon icon, String filepath) {
		return saver.save(icon, filepath);	
	}


}
