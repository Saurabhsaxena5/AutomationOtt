package Selinium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeliniumXA {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void setup() throws InterruptedException {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://aaryaadigital.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait
	}

	@Test()
	public void login() throws InterruptedException {
		WebElement clickonlogin = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logButton']")));
		clickonlogin.click();

		WebElement enterphoneNumber = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile']")));
		enterphoneNumber.sendKeys("8920689888");

		WebElement clickOTP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		clickOTP.click();

		WebElement Otp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='otp']")));
		Otp.sendKeys("1234");

		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		submit.click();

		Thread.sleep(3000);
	}

	@Test()
	public void clickfilterbutton() throws InterruptedException {

		WebElement XA = driver.findElement(By.xpath("//div[@class='dropdown'][1]"));
		XA.click();
		Thread.sleep(4000);

	}

	@Test()
	public void javaExecutor() throws InterruptedException {
		JavascriptExecutor jsescroll = (JavascriptExecutor) driver;
		jsescroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(6000);

	}

	@Test
	public void clickonprofile() throws InterruptedException {
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

	}

	@Test
	public void verifyurl() throws InterruptedException {
		String url1 = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("The url of the page source is:" + url1);
		Thread.sleep(2000);
	}

	@Test
	public void subscription() throws InterruptedException {

		WebElement clickonsubscription = driver.findElement(By.xpath("//img[@class=\"subscription-logo\"]"));
		clickonsubscription.click();
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]"));

		if (element.isDisplayed()) {
			System.out.println("User already have a subscription");
		} else {
			System.out.println("User buy a subscription");
		}
		Thread.sleep(2000);

	}

	@Test
	public void searchvideo() throws InterruptedException {
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
	}

	@Test()
	public void wrongcreditanals() throws InterruptedException {

		WebElement clickonloginbutton = driver.findElement(By.xpath("//button[@class=\"logbtn\"]"));
		clickonloginbutton.click();

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

	}

	@Test
	public void watchvideo() throws InterruptedException {

		WebElement clicksearchbutton = driver.findElement(By.xpath("//div[@class=\"search-button\"]"));
		clicksearchbutton.click();

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

		Thread.sleep(4000);

	}

	@Test
	public void footerbutton() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		WebElement TermsAndCondition = driver.findElement(By.xpath("//span[normalize-space()='Terms and Conditions']"));

		TermsAndCondition.click();

		if (TermsAndCondition.isEnabled()) {
			System.out.println("It is Disabled");

		} else {
			System.out.println("It is not disabled");
		}
	}

	@Test
	public void withoutloginDetailedpage() throws InterruptedException {

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
	public void mailId() throws InterruptedException {

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
	}

	@Test
	public void logout() throws InterruptedException {
		
		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(3000);

		WebElement clickonlogout = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]//div"));
		clickonlogout.click();
		WebElement logout = driver.findElement(By.xpath("//button[@class=\"removebtn\"]"));
		logout.click();
		
		


	}

	@Test
	public void Buyrentvideo() throws InterruptedException {

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

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
