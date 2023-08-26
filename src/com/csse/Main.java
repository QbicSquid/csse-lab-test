package com.csse;

import com.csse.repository.EmployeeRepository;
import com.csse.utils.employee.EmployeeTransformer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

	private static final Logger logger = Logger.getLogger("Main");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeRepository employeeRepo = new EmployeeRepository();
		try {
			EmployeeTransformer.request();
			employeeRepo.e1();
			employeeRepo.create();
			employeeRepo.createMany();
			employeeRepo.display();
		} catch (TransformerConfigurationException e) {
			logger.log(Level.SEVERE, "Failed to configure transformer - " + e.getMessage());
		} catch (TransformerFactoryConfigurationError e) {
			logger.log(Level.SEVERE,
					"Failed to configure transformer factory- " + e.getMessage() + ". Exiting process....");
		} catch (TransformerException e) {
			logger.log(Level.SEVERE, "Failure in transformer - " + e.getMessage());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Process execution failed - " + e.getMessage());
		}
	}
}