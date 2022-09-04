package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Downloads\\New_Goo_Dr\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/click-on-image-in-selenium.html");
		
		
		WebElement guruImage=driver.findElement(By.xpath
				("//*[@id=\'mobile-header\']/div/div/div/div/div/div/div/div[1]/div/div/a/img"));
		guruImage.click();
	}

}
