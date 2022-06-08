package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browsercb {
	public static WebDriver  newtab(String url) {///this method returns WebDriver which is driver
	ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software testing\\selenium\\zerodha\\src\\main\\resources\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get(url);
		
		driver.manage().window().maximize();
		
		return driver;
		
		
	}

}
