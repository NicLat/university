package tests;

import server.BooksService;
import server.RandomBook;
import server.Server;

public class ServerLauncher {

	public static final int PORT = 8080;

	public static void main(String[] args) {

		Server server = new Server(PORT);

		// quindi nel caso di books02 fa quel servizio, altrimenti fa
		// normalmente il servizio di FileService
		server.addService("/books", new BooksService());
		server.addService("/books02.html", new BooksService());
		server.addService("/books03.html", new RandomBook());

		server.launch();
	}
}
