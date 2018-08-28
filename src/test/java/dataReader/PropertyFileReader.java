package dataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	public static Properties getFile() throws IOException {
		
		FileInputStream fileread = new FileInputStream(new File("D:\\Selenium-workspace1\\com.Asapep.kpit.test\\Properties\\property.properties"));
		Properties property = new Properties();
		property.load(fileread);
		return property;
	}
	
	

}
