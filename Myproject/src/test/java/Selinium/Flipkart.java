package Selinium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	@Test
	public class Flipkart {
	
	
		public static void main(String[] args) throws InterruptedException {
			
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
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
		
		@Nullable
		String pagesource = driver.getTitle();
		System.out.println(pagesource);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		WebElement AddToCart = driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]"));
		AddToCart.click();
		Thread.sleep(2000);
		
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
	
	
