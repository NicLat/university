package tests;

import server.Server;
import server.services.FileService;
import server.services.UserStoriesService;
import server.services.senders.Sender;

public class ServerLauncher {

	public static final int PORT = 8080;

	public static void main(String[] args) {

		Server server = new Server(PORT, new FileService("index.html",
				new Sender()));

		server.addService("/iterations.html", new UserStoriesService());
		server.launch();
	}
}
