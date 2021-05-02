package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	
	public static  WebDriver driver;
	public static  Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream(
					".\\Testdata\\a.properties");
			prop.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				prop.getProperty("chromepath"));
		
		driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

}
