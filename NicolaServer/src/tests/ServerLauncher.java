package tests;

import server.Server;
import server.services.UserStoriesService;

public class ServerLauncher {

	public static final int PORT = 8080;

	public static void main(String[] args) {

		Server server = new Server(PORT);

		server.addService("/iterations.html", new UserStoriesService());
		server.launch();
	}
}
