package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox= driver.findElement(By.id("email"));
		emailBox.sendKeys("kabilrajwork96@mail.com");
		
		WebElement appendBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("KABIL QA AUTOMATION");
		
		WebElement getTextBox= driver.findElement(By.name("username"));
		String value= getTextBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disableBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enable= disableBox.isEnabled();
		System.out.println(enable);
		
}
}
