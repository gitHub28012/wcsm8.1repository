package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties"); //provide the path of property file
		
		// read the data from property file 
		
		Properties prop = new Properties();
		
		prop.load(fis); // make the property file for read
		
		String username = prop.getProperty("password");
		System.out.println(username);
		
	}

}
