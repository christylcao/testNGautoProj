package page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCategoryPage {

	WebDriver driver;
	String beforeXpath = "//span[contains(text(),'";
	String afterXpath = "')]";
	String moredata;
	
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	
}
	@FindBy(how = How.NAME, using = "due_month") WebElement MONTH_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//option[@value = '1']") WebElement JANUARY;
	@FindBy(how = How.XPATH, using = "//option[@value = '2']") WebElement FEBRUARY;
	@FindBy(how = How.XPATH, using = "//option[@value = '3']") WebElement MARCH;
	@FindBy(how = How.XPATH, using = "//option[@value = '4']") WebElement APRIL;
	@FindBy(how = How.XPATH, using = "//option[@value = '5']") WebElement MAY;
	@FindBy(how = How.XPATH, using = "//option[@value = '6']") WebElement JUNE;
	@FindBy(how = How.XPATH, using = "//option[@value = '7']") WebElement JULY;
	@FindBy(how = How.XPATH, using = "//option[@value = '8']") WebElement AUGUST;
	@FindBy(how = How.XPATH, using = "//option[@value = '9']") WebElement SEPTEMBER;
	@FindBy(how = How.XPATH, using = "//option[@value = '10']") WebElement OCTOBER;
	@FindBy(how = How.XPATH, using = "//option[@value = '11']") WebElement NOVEMBER;
	@FindBy(how = How.XPATH, using = "//option[@value = '12']") WebElement DECEMBER;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'The category you want to add already exists:')]") WebElement DUPLICATE_MESSAGE;
	@FindBy(how = How.XPATH, using = "//input[@name=\"categorydata\"]") WebElement INSERT_CATEGORYDATA;
	@FindBy(how = How.XPATH, using ="//input[@value=\"Add category\"]") WebElement ADD_CATEGORY_BUTTON;
	

	public void insertDataIntoCategory(String data) {
		
		INSERT_CATEGORYDATA.sendKeys(data);
		ADD_CATEGORY_BUTTON.click();
		
		WebElement newData = driver.findElement(By.xpath(beforeXpath + data + afterXpath ));
		String inputData = newData.getAttribute("textContent");
		
		Assert.assertEquals(inputData, data);
		
	}
	public void duplicateMessage() {
		
		if(DUPLICATE_MESSAGE.isDisplayed()) {
			System.out.println(DUPLICATE_MESSAGE);
		}else {
			System.out.println("Category is displayed");
		}
	}
	
	public void validateMonthDropDown() {
		
		Select select = new Select(MONTH_DROPDOWN_ELEMENT);
		MONTH_DROPDOWN_ELEMENT.click();
		System.out.println(JANUARY.isDisplayed());
		System.out.println(FEBRUARY.isDisplayed());
		System.out.println(MARCH.isDisplayed());
		System.out.println(APRIL.isDisplayed());
		System.out.println(MAY.isDisplayed());
		System.out.println(JUNE.isDisplayed());
		System.out.println(JULY.isDisplayed());
		System.out.println(AUGUST.isDisplayed());
		System.out.println(SEPTEMBER.isDisplayed());
		System.out.println(OCTOBER.isDisplayed());
		System.out.println(NOVEMBER.isDisplayed());
		System.out.println(DECEMBER.isDisplayed());
	
	}
	
	
	
	
}