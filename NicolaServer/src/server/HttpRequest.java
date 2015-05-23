package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class HttpRequest {

	private String uri = "";
	private String parameters = "";

	public HttpRequest(final Socket clientSocket) throws IOException {
		super();

		BufferedReader in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));

		String line = in.readLine();
		
		

		LinkedList<String> lines = new LinkedList<String>();
		while (line != null) {
						
			if(line.contains("User-Agent:")){
				System.err.println(line);
			}
			
			lines.add(line);
			line = in.readLine();
			if (line.length() == 0) {
				line = null;
			}
		}
		
		if(lines.isEmpty() == false){
			StringTokenizer tokenizer = new StringTokenizer(lines.get(0), " ");
			tokenizer.nextToken();
			
			StringTokenizer tokenizer2 = new StringTokenizer(tokenizer.nextToken(), "?");
			
			this.uri = tokenizer2.nextToken();
			if(tokenizer2.hasMoreTokens())
				this.parameters = tokenizer2.nextToken();
		}
	}
	
	public String getParameters() {
		return parameters;
	}
	public String getUri() {
		return uri;
	}

}
