package server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {

	private int port;
	private HashMap<String, IService> services = new HashMap<String, IService>();

	public Server(int port) {
		this.port = port;
	}
	
	public void addService(String name, IService service){
		services.put(name, service);
	}

	public void launch() {

		try {
			ServerSocket socket = new ServerSocket(port);

			while (true) {
				final Socket clientSocket = socket.accept();
				Runnable runnable = new Runnable() {

					@Override
					public void run() {

						try {
							

							HttpRequest request = new HttpRequest(clientSocket);

							System.out.println("Requested URI: " + request.getUri());
							
							IService service = services.get(request.getUri());
							if(service == null){
								service = new FileService("index.html");
							}
							
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
				
				Thread thread = new Thread(runnable);
				thread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
