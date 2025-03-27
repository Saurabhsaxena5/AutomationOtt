package Selinium;

import java.time.Duration;
import java.util.Set;

import org.testng.annotations.Test;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OnlyForcheckingPurpose {
	
	
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void setup() throws InterruptedException {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://aaryaadigital.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		WebElement clickonlogin = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logButton']")));
		clickonlogin.click();

		WebElement enterphoneNumber = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile']")));
		enterphoneNumber.sendKeys("8920689888");

		WebElement clickOTP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		clickOTP.click();
		Thread.sleep(4000);
		WebElement Otp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='otp']")));
		Otp.sendKeys("1234");

		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		submit.click();

		WebElement clickonfilterButton = driver.findElement(By.xpath("//div[@class=\"dropdown\"][1]"));
		clickonfilterButton.click();
		
			WebElement Value7= driver.findElement(By.xpath("//input[@value=\"7\"]"));
			Value7.click();
			
			WebElement Value6= driver.findElement(By.xpath("//input[@value=\"6\"]"));
			Value6.click();
		
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("document.querySelector('.dropdown-menu.show').scrollTop += 300");

			Thread.sleep(6000);
			
			WebElement clickOnSubmitButton = driver.findElement(By.xpath("//button[@class=\"btn btn-primary mt-2\"]"));
			clickOnSubmitButton.click();
			
			}

	
	}
	

		
				 
				
	
		
	
		


