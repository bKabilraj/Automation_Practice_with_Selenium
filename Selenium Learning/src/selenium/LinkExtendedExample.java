package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement goHomePage = driver.findElement(By.linkText("Go to Dashboard"));
		goHomePage.click();
		
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find the URL"));
		String where= whereToGo.getAttribute("href");
		System.out.println("This link is going to" +where);
		
		WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		
		String title= driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is broken");	
		}
		
		driver.navigate().back();
		
		//04
		WebElement goHomePage1 = driver.findElement(By.linkText("Go to Dashboard"));
		goHomePage1.click();
		driver.navigate().back();
		
		//05
		List<WebElement> totalLinks= driver.findElements(By.tagName("a"));
		
		int linkCount=totalLinks.size();
		
		System.out.println("Total links " +linkCount);
		
	}

}
