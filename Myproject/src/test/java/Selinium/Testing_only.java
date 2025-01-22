





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public 	class Testing_only  {
	
	@Test
	public void usernotlogin() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement clickonmovies = driver.findElement(By.xpath("//a[@href=\"/Devotional/16\"]"));
			clickonmovies.click();
}
}