package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Specific_Item_From_Cache_Element {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		WebElement e=driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		
		a.sendKeys(e, "Abdul kalam").build().perform();;
		
		while(2>1)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			String s=e.getAttribute("value");
			if(s.equalsIgnoreCase("Abdul kalam images"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				break;
			}
		}
	}

}
