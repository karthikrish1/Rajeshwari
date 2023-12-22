package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class t2 {

	
		
		/* create an object for webdriver wait class
		 * pass driver instance and time limit as input
		 * call condition
		 * 
		 * code is correct: executes within time limit, it will proceed further, it will not wait for
		 *                 completion of time limit
		 * code is wrong : it will wait for the completion of time limit, then it will throw up error
		 * 
		 *  * 
		 * */
		
		@Test
		public void hs()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
			//step2: create an object for chromedriver class
			 ChromeDriver ob = new ChromeDriver();
			//step3: visiting 
			ob.get("http://www.google.com");
			WebDriverWait w= new WebDriverWait(ob,5);
			
			//title
			//w.until(ExpectedConditions.titleIs("Google"));
			
			//w.until(ExpectedConditions.titleContains("oo"));
			
			//alert 
			//w.until(ExpectedConditions.alertIsPresent());
			
			//visibility of element
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
			
			//element is clickable or not
			//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
			
			//visibility of more elements
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
			
			ob.quit();
	}

}
