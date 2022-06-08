package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.browsercb;
import pom.kitezerodha;
import pom.signuppage;
import utility.excl;
 
public class login {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		driver=browsercb.newtab("https://kite.zerodha.com/");
	}
	
	@Test 
	public void loginwithvalidcredentials() throws EncryptedDocumentException, IOException {
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
	@Test
	public void forgotpassword() {
		kitezerodha kite=new kitezerodha(driver);
		kite.forgotid();
	}
	@Test
	public void singup() {
		kitezerodha kite =new kitezerodha(driver);
		kite.signup1();
		
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		signuppage sign=new signuppage(driver);
		String actualTitle =sign.getpagetitle(driver);
		String expectedtitle="Signup and open a Zerodha trading and demat account online and start investing � Zerodha";
//		if (actualTitle.equals(expectedtitle)) {
//			System.out.println("correct");
//		}
//		else {
//			System.out.println("incorrect");
//		}
		
//		Assert.assertEquals(actualTitle, expectedtitle); //hard assert will stop execution at this point
//		
////		Assert.assertTrue(sign.zerodhalogo());	
//		Assert.assertFalse(sign.zerodhalogo()); 
//		sign.entermobilenumber("1234567890");
		
		//adding to git
		SoftAssert softAssert=new SoftAssert();
Assert.assertEquals(actualTitle, expectedtitle); //hard assert will stop execution at this point
		
//		softAssert.assertTrue(sign.zerodhalogo());	
		softAssert.assertFalse(sign.zerodhalogo()); 
		sign.entermobilenumber("1234567890");
		softAssert.assertAll(); //it save all exception and at the end
		
	}

}
