package TimeOutException;


import org.openqa.selenium.chrome.ChromeDriver;


public class Program {
	
	@Test
	public void Test() {
		
	
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://prune.co.in/");
	driver.manage().window().maximize();
	

}
}