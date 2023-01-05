package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void clickLogoButtonTest() throws InterruptedException {
		homepage.clickLogoButtonTest();
	}

	@Test(enabled = true, priority = 2)
	public void clickfeedBackTest() throws InterruptedException {
		homepage.clickFeedBackButton();
	}

	@Test(enabled = true, priority = 3)
	public void clickBodyWrapTest() throws InterruptedException {
		homepage.clickBodyWrapElement();
	}

}
