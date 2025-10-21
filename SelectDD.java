package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("guest");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//locate the username
		//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//attribute based xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//locate the password field
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//text based xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click the login button
		//driver.findElement(By.className("decorativeSubmit")).click();
		//Aattribute based xpath
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//click CRM/SFA 
		//driver.findElement(By.partialLinkText("CRM/SF")).click();
		//text based xpath 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		
		
		//click leads
		//driver.findElement(By.linkText("Leads")).click();
		//text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click create lead
		//driver.findElement(By.linkText("Create Lead")).click();
		//partial text based xpath
	    driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Enter company name
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    //partial attribute name
	    driver.findElement(By.xpath("//input[contains(@id,'create')]")).sendKeys("TestLeaf");
		
		//Enter first name
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
	    //by index xpath
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nisha Sh");
		
		//Enter the Last name
	   //driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	    //by attribute based
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("A");
		
		//select dropdown
		WebElement dd=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		
		
		Select sel=new Select(dd);
	    sel.selectByVisibleText("Employee");
		
		//click create lead
	    //text based
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		

	}

}
