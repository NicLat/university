package files.writer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LineaLog implements ILineWriter{
	
	private SimpleDateFormat tempo = new SimpleDateFormat("(dd,MM,yy) HH:mm:ss", Locale.ITALY);

	@Override
	public String writeLine(String str) {
		return tempo.format(new Date()) + " " + str;
	}

}
