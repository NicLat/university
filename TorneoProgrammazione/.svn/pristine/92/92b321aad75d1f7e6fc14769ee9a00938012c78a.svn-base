package files;

import java.util.ArrayList;
import java.util.StringTokenizer;

import modello.Team;


public class LettoreIncontro implements ILineReader{
	
	private ArrayList<Team> teams;
	
	public LettoreIncontro(ArrayList<Team> teams) {
		super();
		this.teams = teams;
	}

	@Override
	public void readLine(String line) {

		StringTokenizer tokenizer1,tokenizer2;
		String nome1,nome2;
		int p1,p2;
		
		tokenizer1 = new StringTokenizer(line,",");
		
		tokenizer2 = new StringTokenizer(tokenizer1.nextToken(),"-");	
		nome1 = tokenizer2.nextToken();
		nome2 = tokenizer2.nextToken();
		
		tokenizer2 = new StringTokenizer(tokenizer1.nextToken(),"-");	
		p1 = Integer.parseInt(tokenizer2.nextToken());
		p2 = Integer.parseInt(tokenizer2.nextToken());
		
		Utils.trovaTeam(teams, nome1).aggiungiPunti(p1);
		Utils.trovaTeam(teams, nome2).aggiungiPunti(p2);
		
	}

}
