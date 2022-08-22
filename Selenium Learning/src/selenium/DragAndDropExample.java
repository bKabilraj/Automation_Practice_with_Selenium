package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement  To = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(from).moveToElement(To).release(To).build().perform();
		
		actions.dragAndDrop(from, To).build().perform();		
		
	}

}
