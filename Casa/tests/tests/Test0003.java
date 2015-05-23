package tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import tests.adapters.FrigoDiTestAdapter;
import tests.adapters.LuceDiTestAdapter;
import tests.adapters.RiscaldamentoAdapter;
import tests.dispositivi.FrigoDiTest;
import tests.dispositivi.LuceDiTest;
import tests.dispositivi.RiscaldamentoDiTest;
import dispositivi.Centralina;

public class Test0003 {
	
	@Test
	public void test03(){

		ArrayList<String> richieste = new ArrayList<String>();
		Collections.addAll(richieste, 	"Luce1 on",
										"Luce2 on",
										"Luce1 off",
										"Frigorifero1 on",
										"Riscaldamento1 set=100",
										"Riscaldamento2 set=70",
										"Riscaldamento3 set=20"
							);
		
		
		ArrayList<String> risposte = new ArrayList<String>();
		Collections.addAll(risposte, 	"Luce1 done",
										"Luce2 done",
										"Luce1 done",
										"Frigorifero1 done",
										"Riscaldamento1 done",
										"Riscaldamento2 done",
										"Riscaldamento3 done"
							);


		Centralina centralina = Centralina.getIstanzaCentralina();
		centralina.registraDispositivo("Luce1", new LuceDiTestAdapter(new LuceDiTest()));
		centralina.registraDispositivo("Luce2", new LuceDiTestAdapter(new LuceDiTest()));
		centralina.registraDispositivo("Frigorifero1", new FrigoDiTestAdapter(new FrigoDiTest()));
		
		centralina.registraDispositivoPerc("Riscaldamento1", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		centralina.registraDispositivoPerc("Riscaldamento2", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		centralina.registraDispositivoPerc("Riscaldamento3", new RiscaldamentoAdapter(new RiscaldamentoDiTest("R",0)));
		
		for (int i = 0; i < richieste.size() ; i++) {
			String risposta = centralina.getRisposta(richieste.get(i));
			
			if(!risposta.equalsIgnoreCase(risposte.get(i))){
				fail(richieste.get(i) + " ha generato " + risposta);
			}
		}
	}
	
	
	public static void main(String[] args) {
		(new Test0003()).test03();
	}

}
