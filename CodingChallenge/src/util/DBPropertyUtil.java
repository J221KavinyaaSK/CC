package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {
	public static String getPropertyString(String fileName) {
		try {
			Properties props = new Properties();
			FileInputStream fis = new FileInputStream(fileName);
			props.load(fis);
			fis.close();
			return props.getProperty("connectionString");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
