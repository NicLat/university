package tests;

import server.Server;
import server.services.FileService;
import server.services.UserStoriesService;
import server.services.senders.Sender;

public class ServerLauncher {

	public static final int PORT = 8080;

	public static void main(String[] args) {
		
		FileService fs = new FileService("index.html",new Sender());

		fs.addKnownContent("html", "text/html");
		fs.addKnownContent("css", "text/css");
		fs.addKnownContent("png", "image/png");
		fs.addKnownContent("jpg", "image/jpg");
		fs.addKnownContent("gif", "image/gif");
		fs.addKnownContent("xml", "text/xml");
		
		Server server = new Server(PORT, fs);

		server.addService("/iterations.html", new UserStoriesService());
		server.launch();
	}
}
