package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Open Chrome
		//2. Google home page

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.lk/");
	}

}
