package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class MonthDropDown {

	WebDriver driver;
	
	
	@Test
	public void userRemovedAllItemsByToggleAll() {
		
		driver = BrowserFactory.init();
		AddCategoryPage testPage = PageFactory.initElements(driver, AddCategoryPage.class);
		
		testPage.validateMonthDropDown();
		
		BrowserFactory.tearDown();
	}
	
}
