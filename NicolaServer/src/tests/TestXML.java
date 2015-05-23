package tests;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestXML {

	public static void main(String[] args) {
		
		String xmlName = "xml/user_stories1.xml";
		File fileXML = new File(xmlName);
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbFactory.newDocumentBuilder();
			Document doc = builder.parse(fileXML);
			
			printUserStories(doc);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void printUserStories(Document doc)
			throws IOException {
		NodeList storiesList = doc.getElementsByTagName("story");
		System.out.println("<p>User Stories:<ul>");
		for (int i = 0; i < storiesList.getLength(); i++) {
			printStory(storiesList, i);
		}
		System.out.println("</ul></p>");
	}
	
	private static void printStory(NodeList storiesList, int i)
			throws IOException {
		
		Node story = storiesList.item(i);
		NodeList storyInfo = story.getChildNodes();

		System.out.println("<li class=\"userstories-list\"><span class=\"usphrase\">As a</span> "
				+ storyInfo.item(1).getTextContent());
		System.out.println(" <span class=\"usphrase\">i want</span> "
				+ storyInfo.item(3).getTextContent());
		System.out.println(" <span class=\"usphrase\">so that</span> "
				+ storyInfo.item(5).getTextContent());
	}
	
}
