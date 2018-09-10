package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream(System.getProperty("user.dir")+"/Configs/gmail.properties"));
		
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}
