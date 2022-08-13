package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium_Learning\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1, Get the xy position
		WebElement getPositionButton=driver.findElement(By.id("position"));
		
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		
		System.out.println("X value is :"+ xValue+"Y value is :"+yValue);
		
		//2.find the color
		WebElement colorButton= driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Button color is:"+color);
		
		//3.find the size
		WebElement sizeButton=driver.findElement(By.id("size"));
		int width=sizeButton.getSize().getWidth();
		int height=sizeButton.getSize().getHeight();
		
		System.out.println("Height is :"+ height +"Width is :" +width);
		
		//4.go to home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
	}

}
