package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kitezerodha {

	@FindBy(xpath ="//input[@id=\"userid\"]")private WebElement username;
	
	@FindBy(xpath ="//input[@id=\"password\"]")private WebElement password;
	
	@FindBy(xpath="//button[@class=\"button-orange wide\"]")private WebElement login1;
	
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pinpress;
	
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement submit;
	
	@FindBy(xpath="//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
	
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public kitezerodha (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void enterusername(String user) {
		username.sendKeys(user);
		
	}
	public void password1(String pass) {
		password.sendKeys(pass);
	}
	
	public void press () {
		login1.click();	
		}
	
	public void pin(String code,WebDriver driver) {
		
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.visibilityOf(pinpress));
		pinpress.sendKeys(code);
	}
	
	public void button1() {
		submit.click();
		
	}
	
	public void forgotid() {
		forgot.click();
	}
	
	public void signup1() {
		signup.click();
	}
	
}
