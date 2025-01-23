





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public 	class Testing_only  {
	
	@Test
	public void WithoutLoginUserClickOnFooterButtonRedirectToHomepage() throws InterruptedException {
	    // Set up ChromeDriver
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    try {
	        // Navigate to the website
	        driver.get("https://aaryaadigital.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);

	        // Click on the tab
	        WebElement clickonTab = driver.findElement(By.xpath("//a[@href=\"/Devotional/16\"]"));
	        clickonTab.click();
	        Thread.sleep(2000);

	        // Validate the URL
	        String actualPage = driver.getCurrentUrl();
	        String expectedUrl = "https://aaryaadigital.com/Devotional/16"; // Adjust as per your test case
	        Thread.sleep(2000);

	        if (actualPage.equals(expectedUrl)) {
	            System.out.println("The actual page is working: " + actualPage);
	        } else {
	            System.out.println("URL mismatch. Actual: " + actualPage + ", Expected: " + expectedUrl);
	        }

	        // Scroll to the bottom of the page
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        Thread.sleep(2000);

	        // Click on the video
	        WebElement clickonVideo = driver.findElement(By.xpath("//div[@class='scroll-container']//div[@id='custom-div-2']"));
	        clickonVideo.click();
	        Thread.sleep(2000);

	        // Scroll the footer logo into view and ensure it's clickable
	        WebElement clickonFooterButton = driver.findElement(By.xpath("//img[@class='sc-dcJsrY fyeCh']"));
	        jse.executeScript("arguments[0].scrollIntoView(true);", clickonFooterButton);
	        Thread.sleep(1000);

	        // Perform a click using Actions to avoid overlay issues
	        Actions action = new Actions(driver);
	        action.moveToElement(clickonFooterButton).click().perform();
	        System.out.println("Footer button clicked successfully!");

	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Test encountered an issue: " + e.getMessage());
	    } 
	        // Close the driver
	        driver.quit();
	    }
	    }
