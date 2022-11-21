package org.login;




import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Testing extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("https://www.facebook.com/");
		
		Thread.sleep(2000);
		WebElement username = ElementLocators("email");
		username.sendKeys("sudhirkumar");
		
		Thread.sleep(2000);
		WebElement password = ElementLocators("pass");
		password.sendKeys("Sudhir1234");
		


		


		
		
	}

}
