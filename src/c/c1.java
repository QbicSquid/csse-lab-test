package c;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Properties;


public class c1 {

	public static final Properties e5 = new Properties();

	static {
		try {
			e5.load(c2.class.getResourceAsStream("../config/config.properties"));
		} catch (Exception e) {
			
		}
	}
}
