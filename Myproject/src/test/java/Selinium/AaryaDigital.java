package Selinium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AaryaDigital {
	WebDriver driver;

	@Test(groups = { "smoke" })
	public void login() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

	@Test
	public void profile() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		Thread.sleep(4000);

		Thread.sleep(3000);

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]"));

		clickonprofile.click();
		Thread.sleep(3000);
	}

	@Test
	public void url() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		Thread.sleep(4000);

		Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("The url of the page source is:" + url1);
		Thread.sleep(2000);
	}

	@Test(groups = { "smoke" })
	public void subscription() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

		Thread.sleep(2000);

		WebElement clickonsubscription = driver.findElement(By.xpath("//img[@class=\"subscription-logo\"]"));
		Thread.sleep(2000);
		clickonsubscription.click();
		if (clickonsubscription.isDisplayed()) {
			System.out.println("yes");
		} else {
			System.out.println("No");

		}
		Thread.sleep(2000);

		driver.quit();
	}

	@Test
	public void searchVideo() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		Thread.sleep(4000);

		// Add wait times to allow the page to load
		Thread.sleep(3000);

		// Locate and click the search button
		WebElement clickOnSearch = driver.findElement(By.xpath("//div[@class=\"search-button\"]"));
		clickOnSearch.click();

		Thread.sleep(4000);

		// Locate the search input and enter the search term
		WebElement enter = driver
				.findElement(By.xpath("//div[@class=\"search-container\"]//input[@class=\"search-input visible\"]"));
		enter.sendKeys("Meri jaan Tiranga");
		Thread.sleep(4000);

		// Submit the search
		enter.sendKeys(Keys.ENTER);
		Thread.sleep(7000);

		driver.quit();
	}

	@Test
	public void loginWithWrongCreditanals() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();
		Thread.sleep(4000);

		WebElement enterphoneNumber = driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
		enterphoneNumber.sendKeys("8920689888");
		WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clickOTP.click();
		WebElement Otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
		Otp.sendKeys("1235");

		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

		Thread.sleep(2000);

		String actualmessage = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText();
		String expectedmessage = "Incorrect OTP entered. Please enter again.";

		if (actualmessage.equals(expectedmessage)) {

			System.out.println("Actual message: [" + actualmessage + "]");
		} else {
			System.out.println("Not work");
		}

		driver.quit();
	}

	@Test(groups = { "smoke" })
	public void watchvideo() throws InterruptedException {

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Navigate to the website
		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Click on Login
		WebElement clickOnLogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickOnLogin.click();

		// Enter phone number and request OTP
		WebElement enterPhoneNumber = driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
		enterPhoneNumber.sendKeys("8920689888");
		WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clickOTP.click();
		Thread.sleep(4000);

		// Enter OTP and submit
		WebElement otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
		otp.sendKeys("1234");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

		// Search for a video
		WebElement clickOnSearch = driver.findElement(By.xpath("//div[@class=\"search-button\"]"));
		clickOnSearch.click();
		Thread.sleep(2000);

		WebElement enterSearch = driver
				.findElement(By.xpath("//div[@class=\"search-container\"]//input[@class=\"search-input visible\"]"));
		enterSearch.sendKeys("Meri jaan Tiranga");
		Thread.sleep(2000);
		enterSearch.sendKeys(Keys.ENTER);

		// Click on the video
		WebElement clickOnVideo = driver.findElement(By.xpath("//img[@alt=\"Meri Jaan Tiranga Hai Trailer\"]"));
		clickOnVideo.click();

		// Scroll down using JavaScript Executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Wait for the page to load
		Thread.sleep(3000);

		// Perform scroll and validate
		try {
			jse.executeScript("window.scrollBy(0,300);");
			Long scrollPosition = (Long) jse.executeScript("return window.pageYOffset;");
			System.out.println("Scroll position after scrolling: " + scrollPosition);
		} catch (Exception e) {
			System.out.println("Error while scrolling: " + e.getMessage());
		}

		WebElement watchnow = driver.findElement(By.xpath("//button[@class=\"sc-fPXMVe bgqGRl\"]"));

		watchnow.click();

		driver.quit();

	}

	@Test
	public void clickonfooterbutton() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();
		Thread.sleep(4000);

		WebElement enterphoneNumber = driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
		enterphoneNumber.sendKeys("8920689888");
		WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clickOTP.click();
		WebElement Otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
		Otp.sendKeys("1234");

		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		WebElement TermsAndCondition = driver.findElement(By.xpath("//span[normalize-space()='Terms and Conditions']"));

		TermsAndCondition.click();

		if (TermsAndCondition.isEnabled()) {
			System.out.println("It is Disabled");

		} else {
			System.out.println("It is not disabled");
		}

		Thread.sleep(4000);
		driver.quit();

	}

	@Test(groups = { "smoke" })
	public void withoutloginDetaiedpage() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickonTab = driver.findElement(By.xpath("//a[@href=\"/Devotional/16\"]"));

		clickonTab.click();
		Thread.sleep(2000);
		String actualpage = driver.getCurrentUrl();

		String expectedurl = driver.getCurrentUrl();
		Thread.sleep(2000);
		if (actualpage.equals(expectedurl)) {
			System.out.println("The actual page is working:" + actualpage);
		} else {
			System.out.println("Dismatchurl");
		}

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement clickonVideo = driver
				.findElement(By.xpath("//div[@class='scroll-container']//div[@id='custom-div-2']"));
		clickonVideo.click();
		Thread.sleep(2000);
		String gettext = driver.findElement(By.xpath("//h3[@class=\"detailHeading\"]")).getText();
		String actual = "Ahiya Maiya Pujwa Ke Beriya";
		Thread.sleep(2000);
		if (gettext.equals(actual)) {
			System.out.println("The Name of the video is :" + actual);
		} else {
			System.out.println("Failed");

		}

		Navigation nav = driver.navigate();
		nav.back();
		nav.back();
		Thread.sleep(2000);

		String actalpageurl = "https://aaryaadigital.com/";
		String expectedpageurl = "https://aaryaadigital.com/";

		if (actalpageurl.equals(expectedpageurl)) {
			System.out.println("Test case is failed");
		} else {
			System.out.println("Failed");
		}

	}

	@Test
	public void WithoutLoginUserClickOnFooterButtonRedirectToHomepage() throws InterruptedException {
		// Set up ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

		// Click on the footer button
		WebElement clickonFooterButton = driver.findElement(By.className("//img[@class=\"sc-dcJsrY fyeCh\"]"));

		

		clickonFooterButton.click(); // Attempt the click
		Thread.sleep(1000);
		

	}
}
