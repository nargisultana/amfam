package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "SiteHeader__logo-img") 
	WebElement logo;
	
	
	public void clickLogoButtonTest() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath = "//a[@id='oo_tab']") //don't find unique name so do it by xpath.
	WebElement feedBack;
	
	public void clickFeedBackButton() throws InterruptedException {
     feedBack.click();
     Thread.sleep(5000);
     
	}
	@FindBy(id ="body-wrapper")
	WebElement bodyElement;
	
	public void clickBodyWrapElement() throws InterruptedException {
		bodyElement.click();
		Thread.sleep(5000);
	}
	


}
