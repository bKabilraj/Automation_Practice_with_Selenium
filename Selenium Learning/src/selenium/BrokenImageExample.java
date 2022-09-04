package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'content\']/div/img[1]"));
		
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("This Image is broken");
		}else {
			System.out.println("This Image Not broken");
		}
			
		}
	}


