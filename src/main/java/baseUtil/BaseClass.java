package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.Homepage;

public class BaseClass {

	
	WebDriver driver;
	public Homepage homepage;


	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nyc/eclipse-workspace/com.amfam/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amfam.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homepage = new Homepage(driver);
		
	}
	
	@AfterMethod
	public void tear() {
		driver.quit();
		
	}
	
	
}
