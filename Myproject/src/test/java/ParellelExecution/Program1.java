package ParellelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
	
    @Test(dataProvider="login", dataProviderClass=Dataprovider.class)
    public void Login(String mobileNumber, String otp) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://stage.ottpeople.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);

        WebElement clickonlogin = driver.findElement(By.xpath("//button[@class=\"logbtn\"]"));
        clickonlogin.click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys(mobileNumber);

        WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        clickOTP.click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@name=\"otp\"]")).sendKeys(otp);

        WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submit.click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@class=\"dropdown\"][2]")).isDisplayed();
        

        driver.quit();
    }
}
