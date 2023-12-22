package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	/*assertion: tech where we will be comparing actual result with obtained result
	 * 
	 * hard    : provided by assert builtin class
	 *           static in nature
	 *           fail=> fail the test case, it will not proceeed further
	 *           
	 * soft assert
	 *        provided by softassert builtin class
	 *        nonstatic in nature
	 *        fail=> it will proceed further
	 *        original result=> invoke assertAll()
	 * 
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertfalse(condition)
	 ** 
	 * */

	
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
}
