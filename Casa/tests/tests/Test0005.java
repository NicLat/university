package tests;

import tests.adapters.FrigoDiTestAdapter;
import tests.adapters.LuceDiTestAdapter;
import tests.adapters.RiscaldamentoAdapter;
import tests.dispositivi.FrigoDiTest;
import tests.dispositivi.LuceDiTest;
import tests.dispositivi.RiscaldamentoDiTest;
import dispositivi.Centralina;

public class Test0005 {
	
	public static void main(String[] args) {
		
		
		Centralina centralina = Centralina.getIstanzaCentralina();
		centralina.registraDispositivo("Luce1", new LuceDiTestAdapter(new LuceDiTest()));
		centralina.registraDispositivo("Luce2", new LuceDiTestAdapter(new LuceDiTest()));
		centralina.registraDispositivo("Frigorifero1", new FrigoDiTestAdapter(new FrigoDiTest()));
		
		centralina.registraDispositivoPerc("Riscaldamento1", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		centralina.registraDispositivoPerc("Riscaldamento2", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		centralina.registraDispositivoPerc("Riscaldamento3", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		
		
		String richiesta = "Riscaldamento1 set=19 00:01";
		String risposta = centralina.getRisposta(richiesta);
		System.out.println(risposta);
		
		richiesta = "Frigorifero1 on 00:02";
		risposta = centralina.getRisposta(richiesta);
		System.out.println(risposta);
	}

}
