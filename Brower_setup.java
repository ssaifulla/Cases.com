package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Brower_setup {
	public WebDriver driver;
	public Properties prop;

	public void Browsers() throws IOException {
	Properties prop = new Properties();
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/Browsers.properties");
		prop.load(file);
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().timeouts()
		

	}
	
	/*
	 * public WebDriver run_Browser() { driver.get(prop.getProperty("browser"));
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); return
	 * driver;
	 * 
	 * }
	 * 
	 * public void close_Browser() { driver.quit(); }
	 */
	
}
