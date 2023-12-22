package p1;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	//step2: create an object for chromedriver class
	ChromeDriver ob= new ChromeDriver();
	//step3: visiting 
	ob.get("http://www.facebook.com");
}
}
