package server;

import java.io.IOException;
import java.net.Socket;

/**
 * Generico Servizio del server, da attaccare ad un uri 
 * @author Nicola
 */
public interface IService {

	/**
	 * Svolgimento del servizio che si trasforma in una risposta HTTP
	 * @param clientSocket socket che aveva richiesto quel servizio
	 * @param request HttpRequest of the service
	 * @throws IOException
	 */
	public void sendHTTP(final Socket clientSocket, HttpRequest	request)
			throws IOException;

}
