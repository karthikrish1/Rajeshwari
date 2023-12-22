package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class w2 {

	//Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver
		//to wait for a certain condition (web element) becomes visible. 
		//It also defines how frequently WebDriver will check if the condition appears
		//before throwing the “ElementNotVisibleException”.
	@Test
	public void ab() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Declare and initialise a fluent wait
				FluentWait w = new FluentWait(driver);
				
				//Specify the timout of the wait
				w.withTimeout(6000, TimeUnit.MILLISECONDS);
				
				//Sepcify polling time
				w.pollingEvery(2000, TimeUnit.MILLISECONDS);
				
				
				w.until(ExpectedConditions.alertIsPresent());
	}
}
