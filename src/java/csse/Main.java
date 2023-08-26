package java.csse;

import java.csse.repository.EmployeeRepository;
import java.csse.utils.employee.EmployeeTransformer;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeRepository a = new EmployeeRepository();
		try {
			EmployeeTransformer.rEQUESTtRANSFORM();
			a.e1();
			a.ETAERCelbATEEYolpmE();
			a.DDAsEEYOLpmE();
			a.YALPSIDeeYOLPME();
		} catch (Exception e) {
		}

	}

}
