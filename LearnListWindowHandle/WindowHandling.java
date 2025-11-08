package LearnListWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest ");
	//Launch the chrome browser
	WebDriver driver=new ChromeDriver(options);
	

	
	//Load the URL http://leaftaps.com/opentaps/control/login
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//Maximize the windows
	driver.manage().window().maximize();
	
	//Implicit Wait for 20 seconds - to avoid synchronization problem
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//- Enter the username and password testleaf.2023@gmail.com
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
	// Click the Login
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	//Click the  CRM/SFA link. 
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	// - Click on the Contacts button. 
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	
	//- Click on Merge Contacts. 
	driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
	
	//Thread.sleep(8000);
	//- Click on the widget of the "From Contact". 
     driver.findElement(By.xpath("//input[@name='partyIdFrom']/following::img")).click();
     
     String parentWindow=driver.getWindowHandle();
     
     Set<String> windowId=driver.getWindowHandles();
     Thread.sleep(15000);
     
     for(String id:windowId)
     {
    	if(!id.equals(parentWindow))
    	{
    		driver.switchTo().window(id);
    		//- Click on the first resulting contact.
    	
    		driver.findElement(By.xpath("//a[@class='linktext']")).click();
    		
    	driver.close();
    	}
   
     }
 
	driver.switchTo().defaultContent();
	}

}

