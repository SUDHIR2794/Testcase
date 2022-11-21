package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void browserLaunch(String url) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static WebElement ElementLocators(String value) {

		WebElement findElement = driver.findElement(By.id(value));
		return findElement;

	}

	public static WebElement elementlocatorsbyxpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;

	}

	public static WebElement elementlocators(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;	

	
	}
	
}
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		

	
	
	
	
	
	
	
	
	
	

		
		
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


