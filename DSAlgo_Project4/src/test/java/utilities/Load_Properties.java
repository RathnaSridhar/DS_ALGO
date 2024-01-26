package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Load_Properties {
	WebDriver driver;

	public static Properties Load_Property_file() {
		Properties prop = new Properties();
		try {
			FileInputStream Fis = new FileInputStream("./src/test/resources/Properties/Register.properties");
			try {
				prop.load(Fis);
				Fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
}
