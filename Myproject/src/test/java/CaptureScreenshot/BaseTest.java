package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		// ✅ Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		// ✅ Launch the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	// ✅ Method to capture a screenshot with timestamp
	public void captureScreenshot(String testName) {
		
		// Convert WebDriver object to TakeScreenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		// Create the Screenshots folder if it doesn't exist
		File screenshotsFolder = new File("./Screenshots/");
		if (!screenshotsFolder.exists()) {
			screenshotsFolder.mkdir();
		}
		
		// Generate timestamp for the screenshot
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File destFile = new File("./Screenshots/" + testName + "_" + timestamp + ".png");
		
		try {
			// ✅ Copy file from source to destination
			FileUtils.copyFile(sourceFile, destFile);
			System.out.println("✅ Screenshot saved successfully at: " + destFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("❌ Failed to save screenshot.");
		}
	}
}
