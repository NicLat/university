package tests.adapters;

import tests.dispositivi.FrigoDiTest;
import dispositivi.Dispositivo;
import dispositivi.ErroreDispositivo;

public class FrigoDiTestAdapter implements Dispositivo{
	
	private FrigoDiTest frigo;

	public FrigoDiTestAdapter(FrigoDiTest frigo) {
		super();
		this.frigo = frigo;
	}
	
	@Override
	public void accendi() throws ErroreDispositivo {
		frigo.setAcceso(true);
		//throw new ErroreDispositivo("ciao");
	}
	@Override
	public void spegni() {
		frigo.setAcceso(false);
	}
	@Override
	public boolean operativo() {
		return frigo.operativo();
	}
	
	

}
