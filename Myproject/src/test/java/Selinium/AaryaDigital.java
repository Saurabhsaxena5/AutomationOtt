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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AaryaDigital {
	WebDriver driver;

	@Test(groups = { "smoke" })
	public void login() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(3000);

		WebElement clickprofile = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]/a[2]"));

		clickprofile.click();
		Thread.sleep(4000);

		WebElement clickoneditbutton = driver.findElement(By.xpath("//button[@class=\"edit-button\"]"));
		clickoneditbutton.click();

		WebElement clearData = driver.findElement(By.xpath("//input[@class=\"input-name\"]"));
		Thread.sleep(4000);
		clearData.clear();
		Thread.sleep(4000);
		clearData.sendKeys("Hey this update message");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@class=\"edit-button\"]")).click();
		Thread.sleep(4000);
		driver.quit();

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
		driver.quit();
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
		clickonsubscription.click();
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]"));
		if (element.isDisplayed() && element.isEnabled()) {
			element.click();

			System.out.println("The user have  a subscription");

		} else {
			System.out.println("User not buy a subscription ");
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
	public void withoutloginDetailedpage() throws InterruptedException {

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
		driver.quit();

	}

	@Test()
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
		WebElement clickonVideo = driver
				.findElement(By.xpath("//div[@class='scroll-container']//div[@id='custom-div-2']"));
		clickonVideo.click();
		Thread.sleep(2000);

		// Click on the footer button
		WebElement clickonFooterButton = driver.findElement(By.xpath("//img[@class='sc-dcJsrY fyeCh']"));
		Actions action = new Actions(driver);
		action.moveToElement(clickonFooterButton);
		clickonFooterButton.click();
		driver.quit();

		clickonFooterButton.click(); // Attempt the click
		Thread.sleep(2000);

	}

	@Test
	public void loginwithmailid() throws InterruptedException {
		// Set up ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Navigate to the website
		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();
		Thread.sleep(2000);

		WebElement clickonmail = driver.findElement(By.xpath("//button[normalize-space()='Login with Mail']"));
		clickonmail.click();
		Thread.sleep(2000);

		WebElement sendmailid = driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]"));
		sendmailid.sendKeys("rajnish.kumar@unvii.com");

		WebElement sendotp = driver.findElement(By.xpath("//button[normalize-space()='Send OTP']"));
		sendotp.click();
		Thread.sleep(2000);

		WebElement enterotp = driver.findElement(By.xpath("//input[@class=\"otp-input form-control\"]"));
		enterotp.sendKeys("1234");
		Thread.sleep(2000);

		WebElement verifyotp = driver.findElement(By.xpath("//button[normalize-space()='Verify OTP']"));
		verifyotp.click();

		String otpactual = verifyotp.getTagName();
		String otpexpected = "Send OTP";
		Thread.sleep(2000);

		if (otpactual.equals(otpexpected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		driver.quit();

	}

	@Test
	public void logout() throws InterruptedException {

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

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(3000);

		WebElement clickonlogout = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]//div"));
		clickonlogout.click();
		WebElement logout = driver.findElement(By.xpath("//button[@class=\"removebtn\"]"));
		logout.click();
		if (clickonlogin.equals(clickonlogin)) {
			System.out.println("Code is passed");
		} else {
			System.out.println("This test case is failed");
		}

		driver.quit();

	}

	@Test(groups = { "Smoke" })
	public void buyrent_video() throws InterruptedException {
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
		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(3000);

		WebElement clickonrentbutton = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]//a[1]"));
		clickonrentbutton.click();

		WebElement clickonvideo = driver.findElement(By.xpath("//div[@class=\"card movie-card\"]"));

		clickonvideo.click();

		JavascriptExecutor jsescroll = (JavascriptExecutor) driver;
		jsescroll.executeScript("window.scrollBy(0,300)");

		WebElement clickonwatchnow = driver.findElement(By.xpath("//button[@class=\"sc-gFqAkR goYXOV\"]]"));
		clickonwatchnow.click();

		driver.quit();
	}

	@Test
	public void clickon_viewall() throws InterruptedException {
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
		JavascriptExecutor jsescroll = (JavascriptExecutor) driver;
		jsescroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(6000);

		WebElement clickonviewall = driver.findElement(By.xpath("//a[@href=\"/View/home/trending-movies/311\"]"));

		clickonviewall.click();

		String checkviewall = driver.getCurrentUrl();
		String expectedviewlallurl = "https://aaryaadigital.com/View/home/trending-movies/311";

		if (checkviewall.equals(expectedviewlallurl)) {
			System.err.println("expected url or actual url same.");

		} else {
			System.out.println("Not Both same url");
		}

		driver.quit();

	}

	@Test
	public void email() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();
		Thread.sleep(4000);

		WebElement clickonmail = driver.findElement(By.xpath("//div[@class=\"signin-form\"]//button[2]"));
		clickonmail.click();
		Thread.sleep(4000);

		WebElement enternumber = driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]"));
		enternumber.sendKeys("9557455449@gmail");
		Thread.sleep(4000);

		WebElement clickonotp = driver.findElement(By.xpath("//button[normalize-space()='Send OTP']"));
		clickonotp.click();
		Thread.sleep(4000);

		// Check error message
		String actualmessage = driver.findElement(By.xpath("//span[@class=\"error-message\"]")).getText();
		String expectedmessage = "Enter a valid email ";

		assertEquals(actualmessage, expectedmessage);
	}

	@Test
	public void couponcode_check() throws InterruptedException {

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

		WebElement clcikonsubscriptionpage = driver.findElement(By.xpath("//div[@class='black-background']//div[2]//div[1]//div[2]//button[1]"));
		clcikonsubscriptionpage.click();

		WebElement entercouponcode = driver.findElement(By.xpath("//input[@placeholder=\"Enter coupon code...\"]"));
		entercouponcode.sendKeys("pmHn7A");
	}

}
