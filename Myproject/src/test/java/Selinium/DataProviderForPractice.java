package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForPractice {

	@Test(dataProvider = "logindata")
	public void Testlogin(String username, String password) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).isDisplayed();
		driver.quit();

	}
	
	@DataProvider
	public Object[][] logindata(){
		
		Object[][] data=new Object[2][2];
		data[0][0]="admin123";
		data[0][1]="admin";
		data[1][0]="admin";
		data[0][1]="admin";
		return data;
	}
	

	
}




