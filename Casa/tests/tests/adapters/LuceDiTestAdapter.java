package tests.adapters;

import tests.dispositivi.LuceDiTest;
import dispositivi.Dispositivo;

public class LuceDiTestAdapter implements Dispositivo{

	private LuceDiTest luce;
	
	public LuceDiTestAdapter(LuceDiTest luce) {
		super();
		this.luce = luce;
	}

	@Override
	public void accendi() {
		luce.accendi();
	}
	@Override
	public void spegni() {
		luce.spenta();
	}
	@Override
	public boolean operativo() {
		return true;
	}
	
}
