package com.csse.config;

import com.csse.utils.employee.EmployeeUtil;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import java.io.IOException;

public class Config {

	public static final Properties config = new Properties();

    private static final Logger logger = Logger.getLogger("Config");

	static {
		try {
			config.load(EmployeeUtil.class.getResourceAsStream("./config.properties"));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to read config file - " + e.getMessage());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Failed to load config due to the following error - " + e.getMessage());
		}
	}
}