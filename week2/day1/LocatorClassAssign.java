package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the browser driver
		
		ChromeDriver driver= new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the webpage
		driver.manage().window().maximize();
		
		//Find the locator for the Email input webelement -by id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Find the locator for the Password input webelement -by name
				driver.findElement(By.name("pass")).sendKeys("Tuna@321");
				
				//Find the locator for the Login button webelement -by id
				driver.findElement(By.name("login")).click();	
				
				//Find the locator for the forgotten password - by linktext
				driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
