package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2"); 
		
		List<WebElement> selectAble=driver.findElements(
				By.xpath("//*[@id=\'fruits\']"));
		int listSize=selectAble.size();
		System.out.println(listSize);
		
	}

}
