package Priority;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
	
	@Test
	public void mainrun() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://aaryaadigital.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	

	WebElement clcikonsubscription = driver.findElement(By.xpath("//img[@class=\"subscription-logo\"]"));
	clcikonsubscription.click();

	WebElement clickon2subscription = driver
			.findElement(By.xpath("//div[@class='black-background']//div[2]//div[1]//div[2]//button[1]"));
	clickon2subscription.click();
	WebElement enterphoneNumber = driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
	enterphoneNumber.sendKeys("8920689888");
	WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	clickOTP.click();
	Thread.sleep(4000);
	WebElement Otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
	Otp.sendKeys("1234");
	WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	submit.click();
	Thread.sleep(6000);

	}

}
