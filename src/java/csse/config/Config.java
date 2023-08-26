package java.csse.config;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.csse.utils.employee.EmployeeUtil;
import java.io.IOException;
import java.util.Properties;


public class Config {

	public static final Properties config = new Properties();

	static {
		try {
			config.load(EmployeeUtil.class.getResourceAsStream("../config/config.properties"));
		} catch (Exception e) {
			
		}
	}
}
