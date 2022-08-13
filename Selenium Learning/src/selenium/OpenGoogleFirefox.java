package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://www.google.lk/");
		driver.quit();
	}

}
  