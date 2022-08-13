package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//01
		WebElement alertBox =driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		alertBox.click();
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		//02
		WebElement confirmBox =driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		confirmBox.click();
		
		Alert confirmAlert =driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//03
		WebElement promptBox =driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		
		promptBox.click();
		
		Alert promptAlert =driver.switchTo().alert();
		promptAlert.sendKeys("KABIL QA AUTOMATION 2022");
		
		promptAlert.accept();
		
		//04
		//WebElement lineBreaks =driver.findElement(By.
		//		xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		
		//lineBreaks.click();
		
		//Alert lineBreakBox =driver.switchTo().alert();
		//lineBreakBox.accept();
		
		
		
	}

}
