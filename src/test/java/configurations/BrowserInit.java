package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserInit {
	public String getBrowserName() {
		return readPropertiesFile().getProperty("browserName");

	}

	public static Properties readPropertiesFile() {

		FileInputStream files;
		Properties prop = new Properties();
		{
			try {
				files = new FileInputStream("C:\\Users\\MYADAV16\\Desktop\\Agile\\SPrint 2\\Apollo247\\src\\test\\resources\\browser.properties");
				try {
					prop.load(files);
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return prop;

	}
}

