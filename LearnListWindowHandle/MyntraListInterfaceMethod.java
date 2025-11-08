package LearnListWindowHandle;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraListInterfaceMethod {

	public static void main(String[] args) throws InterruptedException {
 
		
	//Instantiate the driver Object
    ChromeDriver driver= new ChromeDriver();
	
    // Launch the URL https://www.myntra.com/
    driver.get("https://www.myntra.com/");
    
    //Maximize the browser window
    driver.manage().window().maximize();
    
    //Implicitlly wait untill all the webelements get loaded
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    //In the search box, type as "bags" and press enter
    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags",Keys.ENTER);
    
   
    
    //- To the left of the screen under "Gender" click on "Men"
   driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
 
    
    
   //Explicit wait for StaleException
  
   Thread.sleep(5000);
    WebElement laptopCheckBox= driver.findElement((By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[3]")));
   
   
   laptopCheckBox.click();
   
   //- Under "Category" click "Laptop bags"
   //not working if thread.sleep is not included

   
  // //- Print the count of the items found. 
  List<WebElement> productResult = driver.findElements(By.xpath("//li[@class='product-base']"));
   
   System.out.println("Total No. of Product: " +productResult.size());
    
   //- Get the list of brand of the products displayed in the page and print the list
   Thread.sleep(2000);
 
  List<WebElement> brandName = driver.findElements(By.xpath("//h3[contains(@class,'product-brand')]"));
  
  //Create the set to print the Brand Names without duplicates
  Set<String> uniqueBrandName=new HashSet<String>();
   
  System.out.println("Brands Names are: ");
  
  for(int i=0;i<brandName.size();i++)
   {
	   String bagBrandName=brandName.get(i).getText();
	   uniqueBrandName.add(bagBrandName);
   }
   
  System.out.println(uniqueBrandName);
  
  //Get the list of names of the bags and print it 
  Thread.sleep(2000);
  
  List<WebElement> bagName= driver.findElements(By.xpath("//h4[@class='product-product']"));
  
  //Iterate the list anf get the bag name and print it  
  System.out.println("Bag Names are: ");

	for(int i=0;i<bagName.size();i++) {
		
	  System.out.print(bagName.get(i).getText()+"\t");
		
	}
	
	}

}
