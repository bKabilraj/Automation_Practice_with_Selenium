package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml;jsessionid=node0137njtd67lj2q90s34o075fym259950.node0");
		
		
	}

}
