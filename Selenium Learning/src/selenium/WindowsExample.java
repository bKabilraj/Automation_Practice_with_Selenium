package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> handles= driver.getWindowHandles();
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}

		}
		
	

}
