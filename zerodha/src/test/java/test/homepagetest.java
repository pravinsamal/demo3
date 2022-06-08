package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.browsercb;
import pom.homepage;
import pom.kitezerodha;
import utility.excl;

public class homepagetest {
	WebDriver driver;
	@BeforeMethod
	public void lanunchbrowseraandlogin() throws EncryptedDocumentException, IOException {
		driver=browsercb.newtab("https://kite.zerodha.com");
		kitezerodha kite=new kitezerodha(driver);
		String user=excl.getdata(0, 1, "Credentials");
		kite.enterusername(user);
		String password =excl.getdata(1, 1, "Credentials");
		kite.password1(password);
		kite.press();
		String code=excl.getdata(2, 1, "Credentials");
		kite.pin(code, driver);
		kite.button1();
	}
	@Test              //by index buy stock
	public void selectstockfromlistbyindex() {
		homepage page=new homepage(driver) ;
	page.selectstockfromlistbyindex(driver, 1);
		page.clickbuy();
	
	}
	
	@Test              //by index buy stock
	public void selectstockfromlistbyfor() {
		homepage page=new homepage(driver) ;
	page.selectstockfromlist(driver, "RTNPOWER");
		page.clickbuy();

}
}
