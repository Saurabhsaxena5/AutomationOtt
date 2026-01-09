package CaptureScreenshot;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Screenshot extends BaseTest{

	@Test(testName="LoginAaryaaDigital")
	public void LoginAaryaaDigital() throws InterruptedException {
		
		
		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();

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

		driver.quit();

	}
	
	@Test(testName="flipKart")
		public void flipKart() {
		
		
		driver.get("https://www.flipkart.com/");
		

		driver.manage().window().maximize();
		
		
		WebElement enterwords = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		enterwords.sendKeys("iphone");
		enterwords.submit();
		
		String parentchildurl = driver.getWindowHandle();
		WebElement iphone15 = driver.findElement(By.partialLinkText("Apple iPhone 15 (Blue, 128 GB)"));
		iphone15.click();
		
		
		
		
		Set<String> handles= driver.getWindowHandles();
		
		for(String handle:handles) {
			
		System.out.println("The id of the child window:"+handle);
			Object url1 = driver.getCurrentUrl();
		 System.out.println(url1);
		 if(!handle.equals(parentchildurl)) {
		driver.switchTo().window(handle);
			}
		}
		
		
		String pagesource = driver.getTitle();
		System.out.println(pagesource);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		
		WebElement AddToCart = driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]"));
		AddToCart.click();
		
		
		JavascriptExecutor scrollthewindow = (JavascriptExecutor)driver;
		scrollthewindow.executeScript("window.scrollBy(0,200)");
		
		WebElement placeanorder = driver.findElement(By.xpath("//button[@class=\"QqFHMw zA2EfJ _7Pd1Fp\"]"));
		
		placeanorder.click();
		
		WebElement enterphonenumber = driver.findElement(By.xpath("//input[@class=\"r4vIwl Jr-g+f\"]"));
		enterphonenumber.sendKeys("9634420847");
		
		WebElement paymentcontinue = driver.findElement(By.xpath("//button[@class=\"QqFHMw YhpBe+ _7Pd1Fp\"]"));
		paymentcontinue.click();
		driver.quit();
		
	}
	
		

}

