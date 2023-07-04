package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class DuplicateTest {

	WebDriver driver;
	AddCategoryPage testPage = PageFactory.initElements(driver, AddCategoryPage.class);
	
	
	@Test
	public void duplicateMessage() {
		
		driver = BrowserFactory.init();
		AddCategoryPage testPage = PageFactory.initElements(driver, AddCategoryPage.class);
		
		testPage.insertDataIntoCategory("QA SDET ALUMNI 2023");
		testPage.duplicateMessage();
		
		BrowserFactory.tearDown();
		
	}

}
