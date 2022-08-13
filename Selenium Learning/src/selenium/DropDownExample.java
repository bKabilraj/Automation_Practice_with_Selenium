package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//01
		WebElement dropDown1= driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropDown1);
		//select.selectByIndex(3);
		//select.selectByValue("2");
		select.selectByVisibleText("Loadrunner");
		
		//02
		List<WebElement> listOfOption = select.getOptions();
		int size =listOfOption.size();
		
		System.out.println("NUMBER OF ELEMENTS: " +size);
		
		//03
		//dropDown1.sendKeys("Selenium");
		
		WebElement sendKeySelection = driver.findElement(By
				.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		sendKeySelection.sendKeys("Loadrunner");
		
		//04
		WebElement multiSelect=driver.findElement(By.
				xpath("//*[@id=\'contentblock']/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(4);
	}

}
//*[@id="contentblock"]/section/div[6]/select/option[1]
//*[@id="contentblock"]/section/div[6]/select
//*[@id="contentblock"]/section/div[6]