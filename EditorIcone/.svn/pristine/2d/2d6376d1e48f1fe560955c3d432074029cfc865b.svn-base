package files;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Icon;

public class PNGSaver implements ISaver{

	BufferedImage bufferedImage;
	
	@Override
	public boolean save(Icon icon, String filepath) {
		
		buildImg(icon);
		File f = new File(filepath);
		
		try {
			ImageIO.write(bufferedImage, "PNG", f);
		} catch (IOException e) {
			return false;
		}
		return true;
		
	}
	
	
	
	private void buildImg(Icon icon) {
		bufferedImage = new BufferedImage(icon.getDimension(), icon.getDimension(),
		        BufferedImage.TYPE_INT_RGB);
		
		for (int i = 0; i < icon.getDimension() ; i++) {
			for (int j = 0; j < icon.getDimension() ; j++) {
				bufferedImage.setRGB(j, i, icon.getColorIJ(i, j).getRGB());
			}
		}
	}	
	 
}
