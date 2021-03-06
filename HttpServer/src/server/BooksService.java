package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BooksService implements IService {

	private static final String filename = "web/books02.html";

	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException {

		HttpMessage message = new HttpMessage();
		message.openHttpAnswer(clientSocket);

		copyFile(filename, message.getOut());

		message.closeHttpAnswer();
	}

	public void copyFile(String filename, OutputStreamWriter out)
			throws FileNotFoundException, IOException {
		BufferedReader filerReader = new BufferedReader(
				new FileReader(filename));
		String fileLine = filerReader.readLine();
		while (fileLine != null) {
			if (fileLine.trim().equals("$LIBRERIA_LIBRI$")) {

				// TODO

				File fileXML = new File("books.xml");
				try {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory
							.newInstance();
					DocumentBuilder builder = dbFactory.newDocumentBuilder();

					Document doc = builder.parse(fileXML);

					NodeList bookList = doc.getElementsByTagName("book");

					for (int i = 0; i < bookList.getLength(); i++) {
						printBook(out, bookList, i);
					}

				} catch (ParserConfigurationException e) {
					// TODO Verificare documentazione excetption
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				out.write(fileLine + "\n");
			}

			fileLine = filerReader.readLine();
		}
		filerReader.close();
	}

	private void printBook(OutputStreamWriter out, NodeList bookList, int i)
			throws IOException {
		Node book = bookList.item(i);
		NodeList bookInfo = book.getChildNodes();
		out.write("<div style=\"background-color:#aaa;margin:30px\">");
		for (int j = 0; j < bookInfo.getLength(); j++) {

			String nodeName = bookInfo.item(j).getNodeName();
		
			//bookInfo.item(j)
			
			if (nodeName.equals("title")) {
				out.write("<h2 style=\"background-color:#ddd;\">"
						+ bookInfo.item(j).getTextContent()
						+ "</h2>");
			} else if (nodeName.equals("author")) {
				out.write("<b>"
						+ bookInfo.item(j).getTextContent()
						+ "</b> <br/>");
			} else if (nodeName.equals("year")) {
				out.write("Prezzo : "
						+ bookInfo.item(j).getTextContent()
						+ " <br/>");
			} else if (nodeName.equals("price")) {
				out.write("Anno : "
						+ bookInfo.item(j).getTextContent()
						+ " <br/>");
			}
			
		}
		out.write("</div>");
	}
}
