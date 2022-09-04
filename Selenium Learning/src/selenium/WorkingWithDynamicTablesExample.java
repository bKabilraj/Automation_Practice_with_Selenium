package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDynamicTablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> colums=driver.findElements(By.tagName("th"));
		int columsCounts = colums.size();
		
		System.out.println("Number of colums " +columsCounts);
		
		//02
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowsCounts= rows.size();
		
		System.out.println("Number of rows " +rowsCounts);
		
		//03
		WebElement getPercent=driver.findElement
				(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent= getPercent.getText();
		System.out.println("Percentage is " +percent);

		//04
		List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : allProgress) {
			String individualValue=webElement.getText().replace("%", "");
			
			numberList.add(Integer.parseInt(individualValue));
		}
		System.out.println("Final list " +numberList);
	
		int smallValue=Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString=Integer.toString(smallValue) + "%";
		String finalxpath="//td[normalize-space()=" +"\""+ smallValueString +"\""+"]"+"//following::td[1]";
		
		WebElement check=driver.findElement(By.xpath(finalxpath));
		check.click();
		}
		
}

