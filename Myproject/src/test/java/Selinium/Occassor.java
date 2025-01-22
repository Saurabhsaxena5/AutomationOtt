package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Occassor {
	
	@Test
	public void Loginonoccasor() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement clickonlogin = driver.findElement(By.xpath("//a[text()=\"Login/Sign Up\"]"));
		clickonlogin.click();
		
		WebElement enteremail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		enteremail.sendKeys("saxenasaurabh596@gmail.com");
		
		WebElement enterpassword = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		enterpassword.sendKeys("Saurabh@123");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		 WebElement clickoncaptcha = driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"));
		 clickoncaptcha.click();
		 
		 driver.quit();
		
	}
	@Test
	public void searchonanyitem() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement enterinput = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		enterinput.sendKeys("wwfcs");
		WebElement clcikonsearchbutton = driver.findElement(By.xpath("//button[@class=\"sub-btn\"]"));
		clcikonsearchbutton.click();
	}
	
	@Test
	public void scrolltheHomepage() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
	}
		@Test
		public void checkcityItisclickableorNot() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			WebElement clickoncityandcheckthedata = driver.findElement(By.cssSelector("div:nth-child(8) a:nth-child(1) div:nth-child(1) div:nth-child(1) figure:nth-child(1)"));
			clickoncityandcheckthedata.click();
			Thread.sleep(3000);
			
			JavascriptExecutor checkcity = (JavascriptExecutor)driver;
			checkcity.executeScript("window.scrollBy(0,2000)");
			driver.quit();
		}


}
