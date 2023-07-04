package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;
	
	
	@Test
	public void userShouldBeAbletoClickToggleAll() {
		
		
		driver = BrowserFactory.init();
		AddCategoryPage addPage = PageFactory.initElements(driver, AddCategoryPage.class);
		
		addPage.insertDataIntoCategory("QA SDET ALUMNI 2023");
		
		BrowserFactory.tearDown();
	
		
	}

}
