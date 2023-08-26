package com.csse;

import com.csse.repository.EmployeeRepository;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

	private static final Logger logger = Logger.getLogger("Main");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeRepository employeeRepo = new EmployeeRepository();
		try {
			employeeRepo.e1();
			employeeRepo.create();
			employeeRepo.createMany();
			employeeRepo.display();
		} catch (TransformerFactoryConfigurationError e) {
			logger.log(Level.SEVERE,
					"Failed to configure transformer factory- " + e.getMessage() + ". Exiting process....");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Process execution failed - " + e.getMessage());
		}
	}
}