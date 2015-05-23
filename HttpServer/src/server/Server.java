package server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {

	private int port;
	
	//design pattern STRATEGY
	private HashMap<String, IService> services = new HashMap<String, IService>();

	public Server(int port) {
		this.port = port;
	}
	
	public void addService(String name, IService service){
		services.put(name, service);
	}

	public void launch() {

		try {
			// aperta una porta tcp che voglio usare come server
			ServerSocket socket = new ServerSocket(port);

			while (true) {
				
				// ora clientSocket resta in attesa di un client che si
				// connette, solo uno
				// il programma continua l'esecuzione solamente quando un client
				// si conentte
				final Socket clientSocket = socket.accept();

				// da un comportamento al thread, porzione di codice eseguita da
				// un thread
				Runnable runnable = new Runnable() {

					@Override
					public void run() {

						try {
							

							HttpRequest request = new HttpRequest(clientSocket);

							//String uri = loadHTTPrequest(clientSocket);
							//String filename = checkURI(uri);

							System.err.println(request.getUri());
							
							/*
							 * design pattern STRATEGY: serie di algoritmi
							 * disponibili con un componente che decide di
							 * conseguenza quale algoritmo andare a utilizzare
							 * 
							 * quindi ci sono varie soluzioni: se quella
							 * necessaria è tra queste ok, altrimenti da la
							 * soluzione di errore
							 */
							
							IService service = services.get(request.getUri());
							/* Se non ci sono implementazioni specifiche, utilizzo FileService */
							if(service == null){
								service = new FileService();
							}
							
							
//							if (filename.equals("web/books02.html")) {
//								(new BooksService()).sendHTTP(clientSocket,
//										filename);
//							} else {
//								(new FileService()).sendHTTP(clientSocket,
//										filename);
//							}
							service.sendHTTP(clientSocket, request);

							clientSocket.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				};
				// oggetto generico che si esegue ed interagisce con altri
				Thread thread = new Thread(runnable);
				thread.start();
			}

			// socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
