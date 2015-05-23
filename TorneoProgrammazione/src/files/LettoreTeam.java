package files;

import java.util.ArrayList;
import java.util.StringTokenizer;

import modello.Team;


public class LettoreTeam implements ILineReader{
	
	private ArrayList<Team> teams;
	
	public LettoreTeam(ArrayList<Team> teams) {
		super();
		this.teams = teams;
	}

	@Override
	public void readLine(String line) {

		StringTokenizer tokenizer;
		String nome;
		ArrayList<String> partecipanti;
		
		tokenizer = new StringTokenizer(line,":");
		nome = tokenizer.nextToken();
		partecipanti = Utils.estraiVettoreDaElenco(tokenizer.nextToken(), ",");
		
		try {
			teams.add(new Team(partecipanti, nome));
		} catch (Exception e) {
			System.err.println(nome + ": " + e.getMessage());
		}
		
	}

}
