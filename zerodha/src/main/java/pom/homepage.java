package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
	
	@FindBy(xpath="//span[text()=\"TATACOFFEE\"]")private WebElement tatacoffee;
	@FindBy(xpath = "//button[@class=\"button-blue buy\"]")private WebElement buyshare;
	@FindBy(xpath = "//div[@class=\"vddl-list list-flat\"]//span//span//span[@class=\"nice-name\"]")private List<WebElement> stock;
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectTataCoffee(WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(tatacoffee));
		Actions action=new Actions(driver);
		action.moveToElement(tatacoffee); 
		action.perform();
	}
	
	public void selectstockfromlist(WebDriver driver,String stockname) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(tatacoffee));
		for(int a =0;a<stock.size();a++) {
			String texts=stock.get(a).getText();
			if(texts.equals(stockname)) {
				Actions action=new Actions(driver);
				action.moveToElement(stock.get(a)); 
				action.perform();
			}
		}
		 	}
	public void selectstockfromlistbyindex(WebDriver driver,int i) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(tatacoffee));
						Actions action=new Actions(driver);
				action.moveToElement(stock.get(i)); 
				action.perform();
			 	}
	public void clickbuy() {
		buyshare.click();
	}
}
