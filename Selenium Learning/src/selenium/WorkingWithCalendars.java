package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		WebElement selectDate=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		//Thread.sleep(5000);
		selectDate.click();
	}

}
