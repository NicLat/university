package files;

import java.util.ArrayList;
import java.util.StringTokenizer;

import modello.Facolta;
import modello.Team;

public class LettoreFacolta implements ILineReader{
	
	private ArrayList<Facolta> facolta;
	private ArrayList<Team> teams;

	public LettoreFacolta(ArrayList<Facolta> facolta, ArrayList<Team> teams) {
		super();
		this.facolta = facolta;
		this.teams = teams;
	}

	@Override
	public void readLine(String line){
		StringTokenizer tokenizer;
		String nomeFacolta;
		ArrayList<Team> squadre;
		ArrayList<String> nomiSquadre;
		
		tokenizer = new StringTokenizer(line,":");
		nomeFacolta = tokenizer.nextToken();
		nomiSquadre = Utils.estraiVettoreDaElenco(tokenizer.nextToken(), ",");
		
		squadre = creaVettoreSquadre(nomeFacolta, nomiSquadre);
		
		facolta.add(new Facolta(nomeFacolta, squadre));		
	}

	/**
	 * Crea un vettore di team della facoltà andandoli a prendere nel vettore totale di team
	 * @param nomeFacolta Nome della facoltà corrente
	 * @param nomiSquadre vettore coi nomi delle squadre da trovare
	 * @return
	 */
	private ArrayList<Team> creaVettoreSquadre(String nomeFacolta, ArrayList<String> nomiSquadre) {
		ArrayList<Team> squadre = new ArrayList<Team>();
		
		for (String nomeTeam : nomiSquadre) {
			Team t = Utils.trovaTeam(teams,nomeTeam);
			if(t != null){
				squadre.add(t);
			}else{
				System.err.println(nomeFacolta+": Team "+nomeTeam+" non trovato tra i team iscritti");
			}
		}
		return squadre;
	}	

}
