package Selinium;

import java.time.Duration;
import java.util.Set;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeliniumXA {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod()
	public void setup() throws InterruptedException {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://aaryaadigital.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait
		
	}

	@Test
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

		Thread.sleep(6000);
	}

	@Test
	public void clickfilterbutton() throws InterruptedException {
		try {
			WebElement buttonelemennt = driver.findElement(By.xpath("//button[@class=\"btn btn-primary mt-2\"]"));

			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("document.querySelector('.dropdown-menu').scrollBy(0,100)");

			buttonelemennt.click();

			String actualurl = "https://aaryaadigital.com/LanguageData/26";

			String expectedurl = driver.getCurrentUrl();

			if (actualurl.equals(expectedurl)) {
				System.out.println("Match url");
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void javaExecutor() throws InterruptedException {
		JavascriptExecutor jsescroll = (JavascriptExecutor) driver;
		jsescroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(6000);

	}

	@Test
	public void clickonprofile() throws InterruptedException {
		Thread.sleep(6000);

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(6000);

		WebElement clickprofile = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]/a[2]"));

		clickprofile.click();
		Thread.sleep(6000);

		WebElement clickoneditbutton = driver.findElement(By.xpath("//button[@class=\"edit-button\"]"));
		clickoneditbutton.click();

		WebElement clearData = driver.findElement(By.xpath("//input[@class=\"input-name\"]"));
		Thread.sleep(6000);
		clearData.clear();
		Thread.sleep(6000);
		clearData.sendKeys("Hey this update message");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@class=\"edit-button\"]")).click();
		Thread.sleep(6000);

	}

	@Test
	public void verifyurl() throws InterruptedException {
		String url1 = driver.getCurrentUrl();
		Thread.sleep(6000);
		System.out.println("The url of the page source is:" + url1);
		Thread.sleep(6000);
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
		Thread.sleep(6000);

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

	@Test
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

	@Test()
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

		Thread.sleep(12000);

	}

	@Test()
	public void footerbutton() throws InterruptedException {
		try {
			Thread.sleep(20000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(6000);

			WebElement TermsAndCondition = driver
					.findElement(By.xpath("//span[normalize-space()='Terms and Conditions']"));

			TermsAndCondition.click();

			if (TermsAndCondition.isDisplayed()) {

				System.out.println("Element is click");

			} else {
				System.out.println("It is not disabled");
			}
		} catch (Exception e) {
			System.out.println("Error while scrolling: " + e.getMessage());
		}
	}

	@Test()
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

	@Test()
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

	@Test()
	public void logout() throws InterruptedException {

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class='Navbar']//div[3]//img[1]"));

		clickonprofile.click();
		Thread.sleep(3000);

		WebElement clickonlogout = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]//div"));
		clickonlogout.click();
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.xpath("//button[@class=\"removebtn\"]"));
		logout.click();

		Thread.sleep(3000);

	}

	@Test()
	public void Buyrentvideo() throws InterruptedException {

		WebElement clickonprofile = driver.findElement(By.xpath("//div[@class=\"dropdown\"][2]"));

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

	@Test()
	public void viewAll() throws InterruptedException {

		Thread.sleep(4000);
		WebElement clickonviewall = driver.findElement(By.xpath("//a[@href=\"/View/home/trending-movies/311\"]"));

		clickonviewall.click();
		Thread.sleep(10000);

		String checkviewall = driver.getCurrentUrl();
		String expectedviewlallurl = "https://aaryaadigital.com/View/home/trending-movies/311";

		if (checkviewall.equals(expectedviewlallurl)) {
			System.err.println("expected url or actual url same.");

		} else {
			System.out.println("Not Both same url");
		}

		driver.quit();

	}

	@Test()
	public void clickOnFilterButtonandScrollbucket() throws InterruptedException {

		

		Thread.sleep(6000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		WebElement TermsAndCondition = driver.findElement(By.xpath("//span[normalize-space()='Terms and Conditions']"));

		TermsAndCondition.click();
		Thread.sleep(5000);

		// Ensure the element is clickable and displayed
		if (TermsAndCondition.isDisplayed()) {
			System.out.println("Element is clickable");
		} else {
			System.out.println("It is not clickable");
		}

		// Wait for the page to load properly
		Thread.sleep(6000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		jse.executeScript("document.querySelector('.support').scrollBy(0,100)");

		Thread.sleep(6000);
	}

	@Test
	public void clickonViewAllButtonCheckDataIsvisible() throws InterruptedException {

		Thread.sleep(4000);
		WebElement clickonviewall = driver.findElement(By.xpath("//a[@href=\"/View/home/trending-movies/311\"]"));

		clickonviewall.click();
		Thread.sleep(10000);

		String checkviewall = driver.getCurrentUrl();
		String expectedviewlallurl = "https://aaryaadigital.com/View/home/trending-movies/311";

		if (checkviewall.equals(expectedviewlallurl)) {
			System.err.println("expected url or actual url same.");

		} else {
			System.out.println("Not Both same url");
		}

		WebElement Datacheck = driver.findElement(By.xpath("//div[@class=\"view-screen\"]"));

		if (Datacheck.isDisplayed()) {
			System.out.println("Data check");
		} else {
			System.out.println("Test case is failed");
		}

	}
	@Test
	public void clickonplaystoreButton() throws InterruptedException {
		Thread.sleep(6000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(6000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement clickonplaystore = driver.findElement(By.xpath("//div[@class=\"icon\"]//a[@class=\"sc-imWYAI gPjsGN\"][1]"));
		clickonplaystore.click();
		Thread.sleep(4000);
		String currentId = driver.getWindowHandle();
		System.out.println(currentId);
		
		Set<String> Puralwindow = driver.getWindowHandles();
		System.out.println(Puralwindow);
		
		Thread.sleep(4000);
			
		for(String windowHandle :Puralwindow) {
			if(!windowHandle.equals(Puralwindow)) {
				driver.switchTo().window(windowHandle);
			}
		}
				
				String checkwindowHandlurl = driver.getCurrentUrl();
				System.out.println(checkwindowHandlurl);
			
				WebElement checkTheNameOfTheApp = driver.findElement(By.xpath("//h1[@class=\"product-header__title app-header__title\"]"));
				checkTheNameOfTheApp.getText();
				System.out.println(checkTheNameOfTheApp);
				
				
				driver.quit();

}
	@Test
	public void filterButton() throws InterruptedException {
	
		Thread.sleep(4000);
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

	

	@AfterMethod
	public void quit() throws InterruptedException {

		driver.quit();
	}

}
