package java.csse.utils.employee;

import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.TransformerException;

import java.csse.config.Config;
import java.io.File;
import org.xml.sax.SAXException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import javax.xml.transform.TransformerConfigurationException;

public class EmployeeUtil extends Config {
	
	public static String getEmployeeById(String id) throws Exception {
		NodeList n; Element e = null;
		n = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(new File("src/e/EmployeeQuery.xml"))
				.getElementsByTagName("query");
		for (int x = 0; x < n.getLength(); x++) {
			e = (Element) n.item(x);
			if (e.getAttribute("id").equals(id))
				break;
		}
		return e.getTextContent().trim();
	}
}
