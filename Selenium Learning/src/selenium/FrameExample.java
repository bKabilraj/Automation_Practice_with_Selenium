package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement clickMeButton1=driver.findElement(By.id("Click"));
		clickMeButton1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//02
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement cickMeButton2=driver.findElement(By.id("Click1"));
		cickMeButton2.click();
		
		String text2=driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);	
		
		
		//03
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		
		int size= totalFrames.size();
		System.out.println(size);
		
		driver.quit();
	}

}
