package testnannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglistener.dk.class)
public class a1 {

	/*before test: only once before all the test cases started its executed
	 *after test : only once after all the test cases finished its execution
	 *
	 *before class: only once after before test
	 *after class: only once before after test 
	 *
	 *before method: run before each test case
	 *after method: run after each test case 
	 *
	 *before test: visiting 
	 *   before class : maximising
	 *      before method : refresh   tc1 : getting title  aftermethod : cookies deletion
	 *      before method: refresh     tc2 : clicking      aftermethod: cookies deletion
	 *   after class: getting url
	 *after test  : closing
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	ChromeDriver ob;
	@BeforeClass
	public void btc()
	{
		System.out.println("Before class");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class ");
		System.out.println(ob.getCurrentUrl());
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before tst ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ob= new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}
	
	@Test
	public void t1()
	{
		System.out.println("Test case 1" + ob.getTitle());
	}
	
	@Test
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Images").click();
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("Before method");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}
}
