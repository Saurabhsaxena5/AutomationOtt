package Selinium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OrangeHRM {
    WebDriver driver;

    @BeforeMethod
    public void setProperties() {
        // Using WebDriverManager to manage ChromeDriver
       

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com/");
    }

    @Test(priority = 1)
    public void signIn() {
        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();

        WebElement name = driver.findElement(By.name("name"));
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        WebElement signBtn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));

        name.sendKeys("akash singh");
        email.sendKeys("akashsinghh07@gmail.com");
        signBtn.click();

        WebElement title = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        title.click();
    }

    @Test(priority = 2, dependsOnMethods = "signIn")
    public void enterAccountInfo() {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("akash singh");
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
