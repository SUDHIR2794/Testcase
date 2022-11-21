package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	
		File file = new File("C:\\Users\\Its We\\Desktop\\Java Recording\\Framework\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("sudhir");

		Cell cell2 = row.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		System.out.println(stringCellValue2);
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("kumar");

		Cell cell3 = row.getCell(2);
		String stringCellValue3 = cell3.getStringCellValue();
		System.out.println(stringCellValue3);
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("sudhir.kumar@gmail.com");

		Cell cell4 = row.getCell(3);
		String stringCellValue4 = cell4.getStringCellValue();
		System.out.println(stringCellValue4);
		
		Thread.sleep(2000);
		WebElement usernumber = driver.findElement(By.id("userNumber"));
		usernumber.sendKeys("9840131993");

		Cell cell5 = row.getCell(4);
		String stringCellValue5 = cell5.getStringCellValue();
		System.out.println(stringCellValue5);

		Cell cell6 = row.getCell(5);
		String stringCellValue6 = cell6.getStringCellValue();
		System.out.println(stringCellValue6);
		
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		gender.click();
		
		Thread.sleep(2000);
		WebElement hobbies = driver.findElement(By.xpath("(//label[text()='Sports'])[1]"));
		hobbies.click();


		
	
		
		
		
		
		
		
	

		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
