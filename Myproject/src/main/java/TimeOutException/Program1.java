package TimeOutException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
	
	@Test(timeOut=10000)
	public void logindata() throws InterruptedException {
		
		  ChromeDriver driver = new ChromeDriver();
	        driver.get("https://stage.ottpeople.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(6000);

	        
	        driver.quit();
		}
		
}
