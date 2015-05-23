package tests.adapters;

import tests.dispositivi.RiscaldamentoDiTest;
import dispositivi.DispositivoPercentuale;

public class RiscaldamentoAdapter implements DispositivoPercentuale{
	
	private static final float RAPPORTO_VALORI = 0.01f;
	private RiscaldamentoDiTest riscaldamento;
	

	public RiscaldamentoAdapter(RiscaldamentoDiTest riscaldamento) {
		super();
		this.riscaldamento = riscaldamento;
	}

	@Override
	public float setValore(float valore) {		
		float eff = riscaldamento.setValore(valore*RAPPORTO_VALORI);
		return eff;			
	}
	@Override
	public boolean operativo() {
		return riscaldamento.operativo();
	}

}
