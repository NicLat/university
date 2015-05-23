package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class HttpRequest {

	private String uri;

	public HttpRequest(final Socket clientSocket) throws IOException {
		super();

		// recupera l'input stream di byte che sono arrivati dal
		// client (messaggio)
		// inputStreamReader converte l'input in byte in stream
		// in caratteri
		// BufferedReader spezza le stringhe con gli acapi
		BufferedReader in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));

		String line = in.readLine();

		LinkedList<String> lines = new LinkedList<String>();
		while (line != null) {
			System.out.println(line);
			lines.add(line);
			line = in.readLine();
			if (line.length() == 0) {
				line = null;
			}
		}

		StringTokenizer tokenizer = new StringTokenizer(lines.get(0), " ");
		tokenizer.nextToken();
		String uri = tokenizer.nextToken();

		this.uri = uri;
	}
	
	public String getUri() {
		return uri;
	}

}
