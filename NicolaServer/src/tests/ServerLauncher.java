package tests;

import server.UserStoriesService;
import server.Server;

public class ServerLauncher {

	public static final int PORT = 8080;

	public static void main(String[] args) {

		Server server = new Server(PORT);

		server.addService("/iterations.html", new UserStoriesService());
		server.launch();
	}
}
