package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		 driver.switchTo().frame(0);
		WebElement yourAge=driver.findElement(By.id("age"));
		
		String toolTipText = yourAge.getAttribute("title");
		System.out.println("Actual Title of Tool Tip" +toolTipText); 
	}

}



