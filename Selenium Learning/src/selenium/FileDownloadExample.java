package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		 
		
		WebElement downloadLink = driver.findElement(By.linkText("CSV"));
		downloadLink.click();
		driver.switchTo().frame(0);
		File fileLocation=new File("C:\\Users\\HP\\Downloads");
		File[] totalfiles = fileLocation.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("BrowserStack - List of devices to test on.csv")){
				System.out.println("File is downloaded");
			break;
				
			}
		}
	}

}
