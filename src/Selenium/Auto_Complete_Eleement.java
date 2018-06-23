package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Complete_Eleement {

	public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.google.com");
	
	WebElement e=driver.findElement(By.name("q"));
	
	Actions a=new Actions(driver);
		
	a.sendKeys(e, "Abdul kalam images").build().perform();
	
	for(int i=1;i<5;i++)
	{
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
	}
	a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
		
	}
	}
		