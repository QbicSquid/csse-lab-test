package com.csse;

import com.csse.repository.EmployeeRepository;
import com.csse.utils.employee.EmployeeTransformer;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

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
		} catch (Exception e) {
		}

	}

}
