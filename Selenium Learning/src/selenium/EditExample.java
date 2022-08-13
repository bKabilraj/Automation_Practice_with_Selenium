package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("kabilwork@gamil.com");
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("KABIL QA");
		String value= driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);
		
		driver.findElement(By.name("username")).clear();
		
	}

}
