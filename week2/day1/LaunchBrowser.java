package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		//launch the browser
		driver.get("https://www.facebook.com/");
		
		//maximise
		driver.manage().window().maximize();
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
