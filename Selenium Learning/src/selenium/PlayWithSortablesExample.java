package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayWithSortablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		//driver.switchTo().frame(0);
		
		//*[@id='sortable']/li
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement fromElement=elements.get(6);
		WebElement toElement=elements.get(0);
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();
		
	}

}
