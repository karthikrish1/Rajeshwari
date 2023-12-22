package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
	/*synchronisation tech: conditional and unconditional
	 * 
	 * unconditional: implicit wait
	 * conditional: explicit wait
	 * 
	 * implicit wait: once it is declared all code which is present after it
	 *                will take the time limit
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
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.findElementByLinkText("Im"); //5
		ob.quit();//5

}}
