package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UserStoriesService implements IService {

	private static final String filename = "web/iterations.html";

	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException {

		HttpMessage message = new HttpMessage();
		message.openHttpAnswer(clientSocket);
		
		int itNumber = getIterationNumber(request.getParameters());

		copyFile(filename, message.getOut(), itNumber);

		message.closeHttpAnswer();
	}

	private int getIterationNumber(String parameters){
		int num = 1; 
		try {
			StringTokenizer tok = new StringTokenizer(parameters, "&num=");
			num = Integer.parseInt(tok.nextToken());
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return num;
	}

	public void copyFile(String filename, OutputStreamWriter out, int itNumber)
			throws FileNotFoundException, IOException {
		BufferedReader filerReader = new BufferedReader(
				new FileReader(filename));
		String fileLine = filerReader.readLine();
		while (fileLine != null) {
			if (fileLine.trim().equals("$DYNAMIC_CONTENT$")) {

				String xmlName = "xml/user_stories";
				xmlName += String.valueOf(itNumber) + ".xml";

				File fileXML = new File(xmlName);
				
				try {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = dbFactory.newDocumentBuilder();
					Document doc = builder.parse(fileXML);
					
					printStartOfPage(out, doc);
					printUserStories(out, doc);
					
				} catch (ParserConfigurationException e) {
					e.printStackTrace();
				} catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				out.write(fileLine + "\n");
			}
			fileLine = filerReader.readLine();
		}
		filerReader.close();
	}

	private void printUserStories(OutputStreamWriter out, Document doc)
			throws IOException {
		NodeList storiesList = doc.getElementsByTagName("story");
		out.write("<p>User Stories:<ul>");
		for (int i = 0; i < storiesList.getLength(); i++) {
			printStory(out, storiesList, i);
		}
		out.write("</ul></p>");
	}

	private void printStartOfPage(OutputStreamWriter out, Document doc)
			throws IOException {
		NodeList pageInfo = doc.getElementsByTagName("title");
		NodeList info = pageInfo.item(0).getChildNodes();
		out.write("<h2 class=\"first-h2\">" + info.item(1).getTextContent() + "</h2>");
		out.write("<p>" + info.item(3).getTextContent() + "</p>");
	}

	private void printStory(OutputStreamWriter out, NodeList storiesList, int i)
			throws IOException {
		
		Node story = storiesList.item(i);
		NodeList storyInfo = story.getChildNodes();

		out.write("<li class=\"userstories-list\"><span class=\"usphrase\">As a</span> "
				+ storyInfo.item(1).getTextContent());
		out.write(" <span class=\"usphrase\">i want</span> "
				+ storyInfo.item(3).getTextContent());
		out.write(" <span class=\"usphrase\">so that</span> "
				+ storyInfo.item(5).getTextContent());
	}
	

}
