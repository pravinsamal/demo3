package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {
//	WebDriver driver;
	
	@FindBy(xpath = "//img[@class=\"logo-img\"]")private WebElement logo;

	@FindBy(xpath = "//input[@id=\"user_mobile\"]")private WebElement mobilenumber;
	public signuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getpagetitle(WebDriver driver) {
		String title=driver.getTitle();
		return title;

	}
	
	public boolean zerodhalogo() {
		return logo.isDisplayed();
	}
	public void entermobilenumber(String number) {
		mobilenumber.sendKeys(number);
	}
	

}
